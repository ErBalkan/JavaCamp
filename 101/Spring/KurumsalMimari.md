# Spring Boot ile Java'da Kurumsal Mimari ile Proje Geliştirme

## Giriş
Spring Boot, Java tabanlı kurumsal uygulamaların hızlı ve kolay bir şekilde geliştirilmesini sağlayan bir framework'tür. Bu rehberde, Spring Boot kullanarak kurumsal bir projeyi nasıl geliştirebileceğinizi adım adım anlatacağız.

## Gereksinimler
- Java Development Kit (JDK)
- Spring Boot
- Bir IDE (IntelliJ IDEA, Eclipse, vs.)
- Maven veya Gradle

## Proje Yapılandırması
### 1. Yeni Bir Spring Boot Projesi Oluşturma
Spring Initializr kullanarak yeni bir Spring Boot projesi oluşturabilirsiniz:
- [Spring Initializr](https://start.spring.io/)
- Gerekli bağımlılıkları seçin (Spring Web, Spring Data JPA, H2 Database, vs.)

### 2. Proje Yapısını Anlama
Spring Boot projeleri genellikle aşağıdaki gibi bir yapıya sahiptir:
```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── ornek/
│   │           └── proje/
│   │               ├── ProjeApplication.java
│   │               ├── controller/
│   │               ├── service/
│   │               ├── repository/
│   │               └── model/
│   └── resources/
│       ├── application.properties
│       └── static/
│       └── templates/
└── test/
```

## Uygulama Geliştirme
### 1. Model Katmanı
Model sınıfları, veritabanı tablolarını temsil eder. Örneğin:
```java
@Entity
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isim;
    private String email;

    // Getter ve Setter metodları
}
```

### 2. Repository Katmanı
Veritabanı işlemleri için repository arayüzleri oluşturulur:
```java
public interface KullaniciRepository extends JpaRepository<Kullanici, Long> {
}
```

### 3. Service Katmanı
İş mantığı service sınıflarında yer alır:
```java
@Service
public class KullaniciService {
    @Autowired
    private KullaniciRepository kullaniciRepository;

    public List<Kullanici> tumKullanicilariGetir() {
        return kullaniciRepository.findAll();
    }

    public Kullanici kullaniciKaydet(Kullanici kullanici) {
        return kullaniciRepository.save(kullanici);
    }
}
```

### 4. Controller Katmanı
HTTP isteklerini işleyen controller sınıfları:
```java
@RestController
@RequestMapping("/api/kullanicilar")
public class KullaniciController {
    @Autowired
    private KullaniciService kullaniciService;

    @GetMapping
    public List<Kullanici> tumKullanicilariGetir() {
        return kullaniciService.tumKullanicilariGetir();
    }

    @PostMapping
    public Kullanici kullaniciKaydet(@RequestBody Kullanici kullanici) {
        return kullaniciService.kullaniciKaydet(kullanici);
    }
}
```

## Sonuç
Bu rehberde, Spring Boot kullanarak Java'da kurumsal bir projeyi nasıl geliştirebileceğinizi öğrendiniz. Spring Boot'un sağladığı kolaylıklar sayesinde, projelerinizi hızlı ve etkili bir şekilde geliştirebilirsiniz.
