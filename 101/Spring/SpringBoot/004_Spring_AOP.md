# Spring Boot AOP (Aspect Oriented Programming)

Aspect Oriented Programming (AOP), yazılım geliştirme sürecinde çapraz kesen endişeleri (cross-cutting concerns) yönetmek için kullanılan bir programlama paradigmasıdır. Spring AOP, Spring Framework'ün bir parçası olarak AOP desteği sağlar ve uygulamalarda logging, transaction management, security gibi çapraz kesen endişeleri yönetmeyi kolaylaştırır.

## AOP Kavramları

### Aspect (Kesit)
Bir uygulamanın çapraz kesen endişelerini tanımlayan modüldür. Örneğin, logging veya security birer aspect olabilir.

### Join Point (Birleşim Noktası)
Bir uygulamanın yürütülmesi sırasında bir aspect'in uygulanabileceği noktadır. Örneğin, bir metodun çağrılması veya bir nesnenin oluşturulması bir join point olabilir.

### Advice (Öneri)
Bir aspect'in belirli bir join point'te ne yapacağını tanımlar. Farklı türde advice'lar vardır:
- **Before Advice**: Bir metod çağrılmadan önce çalışır.
- **After Advice**: Bir metod çağrıldıktan sonra çalışır.
- **Around Advice**: Bir metod çağrılmadan önce ve sonra çalışır.
- **After Returning Advice**: Bir metod başarılı bir şekilde döndükten sonra çalışır.
- **After Throwing Advice**: Bir metod bir istisna fırlattıktan sonra çalışır.

### Pointcut (Kesim Noktası)
Hangi join point'lerin bir advice tarafından kesileceğini belirler. Pointcut ifadeleri genellikle AspectJ dilinde yazılır.

### Weaving (Dokuma)
Aspect'lerin uygulama koduna entegre edilme sürecidir. Bu işlem derleme zamanında, yükleme zamanında veya çalışma zamanında gerçekleşebilir.

## Spring AOP Kullanımı

Spring AOP kullanarak bir logging aspect'i oluşturma örneği:

### 1. Aspect Tanımlama

```java
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.service.*.*(..))")
    public void logBeforeMethod() {
        System.out.println("Method çağrılmadan önce loglama yapılıyor.");
    }
}
```

Bu örnekte, `LoggingAspect` sınıfı bir aspect olarak tanımlanmıştır. `@Before` anotasyonu ile belirtilen pointcut ifadesi, `com.example.service` paketindeki tüm metod çağrılmadan önce `logBeforeMethod` metodunun çalışmasını sağlar.

### 2. Spring Boot Uygulamasında Aspect'i Etkinleştirme

Spring Boot uygulamasında AOP'yi etkinleştirmek için `@EnableAspectJAutoProxy` anotasyonunu kullanabilirsiniz:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }
}
```

Bu adımlarla, Spring Boot uygulamanızda AOP kullanarak logging işlemlerini gerçekleştirebilirsiniz.

## Sonuç

Spring AOP, uygulamalarda çapraz kesen endişeleri yönetmek için güçlü bir araçtır. Aspect, join point, advice, pointcut ve weaving gibi temel kavramları anlayarak, Spring AOP'yi etkili bir şekilde kullanabilirsiniz. Bu örnekler, Spring AOP'nin nasıl kullanılacağını göstermek için basit bir giriş niteliğindedir. Daha karmaşık senaryolar için Spring AOP dokümantasyonunu inceleyebilirsiniz.