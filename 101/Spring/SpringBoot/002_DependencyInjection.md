# Spring Boot'ta Dependency Injection (Bağımlılık Enjeksiyonu)

## Giriş
Dependency Injection (DI), yazılım geliştirmede sıkça kullanılan bir tasarım desenidir. Bu desen, sınıfların bağımlılıklarını dışarıdan almasını sağlar. Spring Framework, DI'yi kolaylaştıran güçlü bir araçtır. Bu yazıda, Spring Boot'ta DI'nin nasıl kullanıldığını detaylı bir şekilde inceleyeceğiz.

## Dependency Injection Nedir?
Dependency Injection, bir sınıfın ihtiyaç duyduğu bağımlılıkları (diğer sınıflar, servisler vb.) dışarıdan almasını sağlayan bir tekniktir. Bu sayede sınıflar arasındaki bağımlılıklar gevşek bağlanır ve test edilebilirlik artar.

## Spring Boot'ta Dependency Injection

### 1. Constructor Injection
Constructor Injection, bağımlılıkların sınıfın yapıcısı (constructor) aracılığıyla sağlanmasıdır.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void performService() {
        // İş mantığı burada
    }
}
```

Yukarıdaki örnekte, `MyService` sınıfı `MyRepository` bağımlılığını yapıcı metot aracılığıyla alır. `@Autowired` anotasyonu, Spring'in bu bağımlılığı otomatik olarak enjekte etmesini sağlar.

### 2. Setter Injection
Setter Injection, bağımlılıkların setter metotları aracılığıyla sağlanmasıdır.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyRepository myRepository;

    @Autowired
    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void performService() {
        // İş mantığı burada
    }
}
```

Bu örnekte, `MyService` sınıfı `MyRepository` bağımlılığını setter metodu aracılığıyla alır. `@Autowired` anotasyonu yine bağımlılığın otomatik olarak enjekte edilmesini sağlar.

### 3. Field Injection
Field Injection, bağımlılıkların doğrudan sınıfın alanlarına (field) enjekte edilmesidir.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyRepository myRepository;

    public void performService() {
        // İş mantığı burada
    }
}
```

Bu örnekte, `MyService` sınıfı `MyRepository` bağımlılığını doğrudan alanına enjekte eder. `@Autowired` anotasyonu bu bağımlılığın otomatik olarak sağlanmasını sağlar.

## Sonuç
Spring Boot'ta Dependency Injection, uygulamaların daha modüler, test edilebilir ve bakımı kolay olmasını sağlar. Constructor Injection, Setter Injection ve Field Injection gibi farklı yöntemlerle bağımlılıkları enjekte edebilirsiniz. Hangi yöntemi kullanacağınız, projenizin ihtiyaçlarına ve kodunuzun yapısına bağlıdır.
