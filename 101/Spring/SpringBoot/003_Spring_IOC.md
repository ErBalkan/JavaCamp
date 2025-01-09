# Spring Boot IOC (Inversion of Control)

## Inversion of Control (Kontrolün Tersine Çevrilmesi) Nedir?

Inversion of Control (IOC), yazılım geliştirme sürecinde bağımlılıkların yönetimini kolaylaştıran bir prensiptir. IOC, nesnelerin bağımlılıklarını kendilerinin oluşturması yerine, bu bağımlılıkların dışarıdan sağlanmasını sağlar. Bu sayede, kodun daha esnek, test edilebilir ve yönetilebilir olması sağlanır.

## Spring IOC Container

Spring Framework, IOC prensibini uygulamak için bir IOC Container sağlar. Bu container, uygulamanın nesnelerini (bean) oluşturur, yapılandırır ve yönetir. Spring IOC Container, XML dosyaları veya Java anotasyonları kullanılarak yapılandırılabilir.

### Bean Nedir?

Bean, Spring IOC Container tarafından yönetilen bir nesnedir. Bean'ler, uygulamanın yapı taşlarıdır ve container tarafından oluşturulup yönetilirler.

## Spring Boot ile IOC Kullanımı

Spring Boot, Spring Framework'ün kolay ve hızlı bir şekilde kullanılmasını sağlayan bir araçtır. Spring Boot ile IOC kullanımı oldukça basittir. Aşağıda, Spring Boot ile IOC kullanımına dair bir örnek bulunmaktadır.

### Örnek: Basit Bir Servis ve Controller

#### 1. Adım: Proje Yapılandırması

Spring Boot projesi oluşturduktan sonra, `pom.xml` dosyasına gerekli bağımlılıkları ekleyin:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

#### 2. Adım: Servis Sınıfı Oluşturma

Bir servis sınıfı oluşturarak iş mantığını bu sınıfa yerleştirelim:

```java
import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String getMessage() {
        return "Merhaba, Spring Boot IOC!";
    }
}
```

- `@Service` anotasyonu, bu sınıfın bir servis sınıfı olduğunu ve Spring IOC Container tarafından yönetileceğini belirtir.

#### 3. Adım: Controller Sınıfı Oluşturma

Bir controller sınıfı oluşturarak HTTP isteklerini bu sınıfa yönlendirelim:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return myService.getMessage();
    }
}
```

- `@RestController` anotasyonu, bu sınıfın bir RESTful web servisi olduğunu belirtir.
- `@Autowired` anotasyonu, Spring IOC Container'ın `MyService` bağımlılığını otomatik olarak enjekte etmesini sağlar.
- `@GetMapping` anotasyonu, HTTP GET isteklerini bu metoda yönlendirir.

#### 4. Adım: Uygulamayı Başlatma

Spring Boot uygulamasını başlatmak için ana sınıfı oluşturun:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
```

- `@SpringBootApplication` anotasyonu, Spring Boot uygulamasının başlangıç noktası olduğunu belirtir.

Bu adımları takip ederek, Spring Boot ile IOC prensibini kullanarak basit bir uygulama oluşturabilirsiniz. Bu örnekte, `MyService` sınıfı bir servis olarak tanımlandı ve `MyController` sınıfı bu servisi kullanarak bir HTTP isteğine yanıt verdi.

## Sonuç

Spring Boot ile IOC kullanımı, uygulamanın bağımlılıklarını yönetmeyi kolaylaştırır ve kodun daha esnek, test edilebilir ve yönetilebilir olmasını sağlar. Bu makalede, Spring Boot ile IOC kullanımına dair temel bir örnek gösterilmiştir. Daha karmaşık senaryolar için Spring Framework'ün sunduğu diğer özellikleri de inceleyebilirsiniz.