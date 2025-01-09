# Java Networking ve Sockets

Bu doküman, Java'da networking ve sockets konularını en baştan profesyonel seviyeye kadar anlatmaktadır. Kod örnekleri ve açıklamaları ile birlikte detaylı bir rehber sunulmaktadır.

## Giriş

Java, ağ programlaması için güçlü bir destek sunar. Java'nın `java.net` paketi, ağ uygulamaları geliştirmek için gerekli sınıfları ve arayüzleri içerir. Bu dokümanda, Java'da networking ve sockets konularını ele alacağız.

## Temel Kavramlar

### IP Adresi ve Port Numarası

- **IP Adresi**: Bir cihazın ağ üzerindeki benzersiz adresidir.
- **Port Numarası**: Bir cihaz üzerindeki belirli bir uygulamayı tanımlar.

### Socket

Socket, iki cihaz arasında veri alışverişi yapmak için kullanılan bir uç noktadır. Java'da socket programlama, `Socket` ve `ServerSocket` sınıfları ile gerçekleştirilir.

## Java'da Socket Programlama

### ServerSocket Sınıfı

`ServerSocket` sınıfı, sunucu tarafında bir socket oluşturmak için kullanılır. Aşağıdaki örnek, basit bir sunucu uygulamasını göstermektedir:

```java
import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is listening on port 1234");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("Hello, client!");
                socket.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
```

**Açıklama**: Bu kod, 1234 portunda dinleyen bir sunucu oluşturur. Bir istemci bağlandığında, "Hello, client!" mesajını gönderir ve bağlantıyı kapatır.

### Socket Sınıfı

`Socket` sınıfı, istemci tarafında bir socket oluşturmak için kullanılır. Aşağıdaki örnek, basit bir istemci uygulamasını göstermektedir:

```java
import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 1234;
        try (Socket socket = new Socket(hostname, port)) {
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String message = reader.readLine();
            System.out.println("Server message: " + message);
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
```

**Açıklama**: Bu kod, `localhost` üzerinde 1234 portuna bağlanan bir istemci oluşturur. Sunucudan gelen mesajı okur ve ekrana yazdırır.

## İleri Seviye Konular

### Çoklu İstemci Desteği

Sunucu tarafında çoklu istemci desteği sağlamak için her istemci bağlantısı için ayrı bir thread oluşturabiliriz:

```java
import java.io.*;
import java.net.*;

public class MultiThreadedServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is listening on port 1234");
            while (true) {
                Socket socket = serverSocket.accept();
                new ClientHandler(socket).start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello, client!");
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
```

**Açıklama**: Bu kod, her yeni istemci bağlantısı için bir `ClientHandler` thread'i oluşturur ve istemciye mesaj gönderir.

## Sonuç

Bu dokümanda, Java'da networking ve sockets konularını ele aldık. Temel kavramlardan başlayarak, socket programlama ve çoklu istemci desteği gibi ileri seviye konuları inceledik. Bu bilgilerle, Java'da ağ uygulamaları geliştirebilirsiniz.