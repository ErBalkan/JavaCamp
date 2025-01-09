# Spring Boot Anotasyonları

Spring Boot, Java tabanlı uygulamalar geliştirmek için kullanılan bir çerçevedir. Spring Boot, çeşitli anotasyonlar kullanarak yapılandırmayı basitleştirir ve geliştiricilere daha hızlı ve daha verimli bir şekilde uygulama geliştirme imkanı sunar. Bu bölümde, Spring Boot'ta sıkça kullanılan anotasyonları ve bunların nasıl kullanıldığını detaylı bir şekilde inceleyeceğiz.

## @SpringBootApplication

`@SpringBootApplication` anotasyonu, Spring Boot uygulamalarının ana giriş noktasıdır. Bu anotasyon, üç önemli anotasyonu bir araya getirir: `@Configuration`, `@EnableAutoConfiguration`, ve `@ComponentScan`.

```java
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
```

- `@Configuration`: Bu anotasyon, sınıfın bir Spring yapılandırma sınıfı olduğunu belirtir.
- `@EnableAutoConfiguration`: Bu anotasyon, Spring Boot'un otomatik yapılandırma özelliğini etkinleştirir.
- `@ComponentScan`: Bu anotasyon, belirtilen paketlerdeki bileşenleri tarar ve Spring konteynerine ekler.

## @RestController

`@RestController` anotasyonu, bir sınıfın RESTful web hizmeti denetleyicisi olduğunu belirtir. Bu anotasyon, `@Controller` ve `@ResponseBody` anotasyonlarının birleşimidir.

```java
@RestController
public class MyRestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
```

- `@GetMapping`: Bu anotasyon, HTTP GET isteklerini belirli bir yöntemle eşler.

## @Autowired

`@Autowired` anotasyonu, Spring'in bağımlılık enjeksiyonu mekanizmasını kullanarak bir bileşeni otomatik olarak enjekte etmesini sağlar.

```java
@Service
public class MyService {
    // İş mantığı burada
}

@RestController
public class MyController {
    @Autowired
    private MyService myService;

    @GetMapping("/service")
    public String useService() {
        return myService.performService();
    }
}
```

- `@Service`: Bu anotasyon, sınıfın bir hizmet bileşeni olduğunu belirtir.

## @Entity

`@Entity` anotasyonu, bir sınıfın JPA varlığı olduğunu belirtir. Bu sınıf, veritabanı tablolarıyla eşleştirilir.

```java
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Getter ve Setter metodları
}
```

- `@Id`: Bu anotasyon, birincil anahtar alanını belirtir.
- `@GeneratedValue`: Bu anotasyon, birincil anahtarın nasıl oluşturulacağını belirtir.

## @Repository

`@Repository` anotasyonu, bir sınıfın veri erişim bileşeni olduğunu belirtir. Bu sınıf, veritabanı işlemlerini gerçekleştirir.

```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Özel sorgular burada tanımlanabilir
}
```

- `JpaRepository`: Bu arayüz, temel CRUD işlemlerini sağlar.

## @Configuration

`@Configuration` anotasyonu, bir sınıfın Spring yapılandırma sınıfı olduğunu belirtir. Bu sınıf, bean tanımlamaları içerir.

```java
@Configuration
public class AppConfig {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
```

- `@Bean`: Bu anotasyon, bir bean tanımlamasını belirtir.

Bu, Spring Boot'ta sıkça kullanılan bazı anotasyonların kısa bir özetidir. Bu anotasyonlar, Spring Boot uygulamalarını daha modüler ve yönetilebilir hale getirir.