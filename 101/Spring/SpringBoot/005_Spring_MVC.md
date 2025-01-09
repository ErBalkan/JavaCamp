# Java Spring MVC

Java Spring MVC (Model-View-Controller), Spring Framework'ün bir parçası olarak web uygulamaları geliştirmek için kullanılan bir modüldür. MVC tasarım deseni, uygulamanın iş mantığını, kullanıcı arayüzünü ve kontrol akışını birbirinden ayırarak daha düzenli ve yönetilebilir bir yapı sağlar.

## Model-View-Controller (MVC) Nedir?

- **Model**: Uygulamanın veri yapısını ve iş mantığını temsil eder. Veritabanı işlemleri ve iş kuralları burada yer alır.
- **View**: Kullanıcıya gösterilen arayüzdür. HTML, JSP, Thymeleaf gibi teknolojilerle oluşturulur.
- **Controller**: Kullanıcıdan gelen istekleri alır, iş mantığını çalıştırır ve uygun bir View'a yönlendirir.

## Spring MVC Mimarisi

Spring MVC, DispatcherServlet adında merkezi bir bileşen kullanır. DispatcherServlet, gelen istekleri alır ve uygun Controller'a yönlendirir. Controller, iş mantığını çalıştırdıktan sonra bir Model ve View döner. DispatcherServlet, bu Model ve View'ı kullanarak kullanıcıya yanıt döner.

## Spring MVC ile Basit Bir Uygulama

### Proje Yapısı

```
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── controller
│   │       │   └── HomeController.java
│   │       └── DemoApplication.java
│   └── resources
│       ├── static
│       ├── templates
│       │   └── home.html
│       └── application.properties
```

### HomeController.java

```java
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Merhaba, Spring MVC!");
        return "home";
    }
}
```

**Açıklama**: `HomeController` sınıfı, ana sayfa isteğini karşılar. `/` URL'ine gelen GET isteğini `home` metodu ile işler. `Model` nesnesine bir mesaj ekler ve `home` adlı View'a yönlendirir.

### home.html

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Spring MVC Uygulaması</title>
</head>
<body>
    <h1 th:text="${message}">Mesaj burada görünecek</h1>
</body>
</html>
```

**Açıklama**: `home.html` dosyası, Thymeleaf kullanılarak oluşturulmuş bir HTML şablonudur. `th:text` ifadesi, modelden gelen `message` değişkeninin değerini HTML içinde gösterir.

### DemoApplication.java

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

**Açıklama**: `DemoApplication` sınıfı, Spring Boot uygulamasının ana sınıfıdır. `main` metodu, uygulamayı başlatır.

### application.properties

```properties
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
```

**Açıklama**: `application.properties` dosyası, Thymeleaf şablonlarının yerini ve uzantısını belirtir.

## Sonuç

Bu basit örnek, Spring MVC'nin temel çalışma prensiplerini ve bileşenlerini göstermektedir. Daha karmaşık uygulamalarda, farklı Controller'lar, Service katmanı ve Repository katmanı gibi ek bileşenler kullanılarak daha modüler ve yönetilebilir bir yapı oluşturulabilir.