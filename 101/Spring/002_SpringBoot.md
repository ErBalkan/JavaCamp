# Spring Boot Nedir?

Spring Boot, Spring Framework'ün bir uzantısıdır ve Spring tabanlı uygulamaların hızlı ve kolay bir şekilde geliştirilmesini sağlar. Spring Boot, minimal konfigürasyon ile bağımsız, üretim seviyesinde uygulamalar oluşturmayı hedefler.

## Spring Boot Özellikleri

- **Hızlı Başlangıç**: Spring Boot, projeye hızlı bir başlangıç yapmanızı sağlar.
- **Minimal Konfigürasyon**: Gereksiz XML konfigürasyonlarını ortadan kaldırır.
- **Bağımsız Uygulamalar**: Gömülü sunucular (Tomcat, Jetty, vb.) ile bağımsız çalışabilen uygulamalar oluşturur.
- **Üretim Hazır**: Sağlam ve güvenilir uygulamalar geliştirmek için çeşitli özellikler sunar.

## Örnek Spring Boot Uygulaması

Aşağıda basit bir Spring Boot uygulamasının nasıl oluşturulacağını gösteren bir örnek bulunmaktadır:

### Adım 1: Proje Yapılandırması

`pom.xml` dosyasına gerekli bağımlılıkları ekleyin:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

### Adım 2: Ana Uygulama Sınıfı

`SpringBootApplication` anotasyonu ile ana uygulama sınıfını oluşturun:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }
}
```

### Adım 3: Basit Bir REST Kontrolcüsü

Bir REST kontrolcüsü oluşturarak basit bir "Hello, World!" endpoint'i ekleyin:

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
```

### Uygulamayı Çalıştırma

Uygulamayı çalıştırmak için aşağıdaki komutu kullanabilirsiniz:

```bash
mvn spring-boot:run
```

Tarayıcınızda `http://localhost:8080/hello` adresine giderek "Hello, World!" mesajını görebilirsiniz.
