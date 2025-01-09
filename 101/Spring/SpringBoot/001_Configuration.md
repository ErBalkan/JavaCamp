# Java Spring Boot Konfigürasyonu

Java Spring Boot, Java uygulamalarının geliştirilmesini bir dizi kural ve araç sağlayarak basitleştiren bir çerçevedir. Spring Boot'ta konfigürasyon, özellik dosyaları, YAML dosyaları ve Java anotasyonları kullanılarak çeşitli şekillerde yapılabilir.

## Konfigürasyon Yöntemleri

### 1. Özellik Dosyaları
Spring Boot, `application.properties` dosyasında konfigürasyon özelliklerini tanımlamanıza olanak tanır. Bu dosya genellikle `src/main/resources` dizininde bulunur.

Örnek:
```properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=secret
```

### 2. YAML Dosyaları
Alternatif olarak, konfigürasyon için `application.yml` dosyasını kullanabilirsiniz. YAML dosyaları daha okunabilir ve hiyerarşik veri yapıları destekler.

Örnek:
```yaml
server:
    port: 8080

spring:
    datasource:
        url: jdbc:mysql://localhost:3306/mydb
        username: root
        password: secret
```

### 3. Java Anotasyonları
Spring Boot uygulamanızı konfigüre etmek için Java anotasyonlarını da kullanabilirsiniz. Yaygın anotasyonlar arasında `@Configuration`, `@Bean` ve `@Value` bulunur.

Örnek:
```java
@Configuration
public class AppConfig {

        @Value("${spring.datasource.url}")
        private String datasourceUrl;

        @Bean
        public DataSource dataSource() {
                DriverManagerDataSource dataSource = new DriverManagerDataSource();
                dataSource.setUrl(datasourceUrl);
                return dataSource;
        }
}
```

## Sonuç
Spring Boot, uygulamanızı konfigüre etmek için birden fazla yol sunar ve ihtiyaçlarınıza en uygun yöntemi seçmenize olanak tanır. İster özellik dosyalarını, ister YAML dosyalarını, ister Java anotasyonlarını tercih edin, Spring Boot size gereken esnekliği sağlar.
