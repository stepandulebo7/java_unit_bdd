import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new StaticFileHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Сервер запущен на http://localhost:8000/");
    }

    static class StaticFileHandler implements HttpHandler {
        private final Map<String, String> mimeTypes = new HashMap<>();

        public StaticFileHandler() {
            mimeTypes.put(".html", "text/html; charset=utf-8");
            mimeTypes.put(".css", "text/css; charset=utf-8");
            mimeTypes.put(".js", "application/javascript; charset=utf-8");
            mimeTypes.put(".json", "application/json; charset=utf-8");
            mimeTypes.put(".png", "image/png");
            mimeTypes.put(".jpg", "image/jpeg");
            mimeTypes.put(".gif", "image/gif");
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            if (path.equals("/")) {
                path = "/index.html";
            }

            // Remove leading slash to make path relative
            path = path.substring(1);
            
            File file = new File(path);
            if (!file.exists() || file.isDirectory()) {
                String response = "404 File not found: " + path;
                exchange.sendResponseHeaders(404, response.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
                return;
            }

            // Set content type
            String contentType = getContentType(path);
            exchange.getResponseHeaders().set("Content-Type", contentType);
            
            // Set cache control
            exchange.getResponseHeaders().set("Cache-Control", "no-cache");

            // Send file
            exchange.sendResponseHeaders(200, file.length());
            try (InputStream is = new FileInputStream(file);
                 OutputStream os = exchange.getResponseBody()) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = is.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
            }
        }

        private String getContentType(String path) {
            int lastDot = path.lastIndexOf('.');
            if (lastDot >= 0) {
                String extension = path.substring(lastDot).toLowerCase();
                String mimeType = mimeTypes.get(extension);
                if (mimeType != null) {
                    return mimeType;
                }
            }
            return "application/octet-stream";
        }
    }
} 