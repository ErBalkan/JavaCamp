# Java İstisna Yönetimi

Java'da istisna yönetimi, geliştiricilerin çalışma zamanı hatalarını ele almasını sağlayan güçlü bir mekanizmadır ve uygulamanın normal akışını sağlar. Genellikle derleme zamanında kontrol edilen istisnaları ele almak için kullanılır.

## Temel Kavramlar

### 1. İstisna Hiyerarşisi
Java'da tüm istisnalar `Throwable` sınıfından türetilmiştir. İki ana alt sınıf vardır:
- `Exception`: Makul bir uygulamanın yakalamak isteyebileceği durumları belirtir.
- `Error`: Makul bir uygulamanın yakalamaya çalışmaması gereken ciddi sorunları belirtir.

### 2. İstisna Türleri
- **Kontrol Edilen İstisnalar**: Derleme zamanında kontrol edilen istisnalardır. Örneğin, `IOException`, `SQLException`.
- **Kontrol Edilmeyen İstisnalar**: Derleme zamanında kontrol edilmeyen istisnalardır. Örneğin, `ArithmeticException`, `NullPointerException`.

### 3. İstisnaların Yönetimi
Java, istisnaları yönetmek için birkaç anahtar kelime sağlar:

- **try**: İstisnalar için izlenecek kod bloğu.
- **catch**: İstisnayı ele alacak kod bloğu.
- **finally**: İstisna atılsa da atılmasa da her zaman çalışacak kod bloğu.
- **throw**: İstisnayı açıkça atmak için kullanılır.
- **throws**: Bir metodun atabileceği istisnaları bildirmek için metod imzalarında kullanılır.

### Örnek

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Sonuç: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Yakalanan istisna: Sıfıra bölme.");
        } finally {
            System.out.println("Finally bloğu çalıştı.");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
```

Bu örnekte:
- `divide` metodu, sıfıra bölme durumunda `ArithmeticException` atar.
- `try` bloğu, istisna atılabilecek kodu içerir.
- `catch` bloğu, istisnayı ele alır.
- `finally` bloğu, istisna atılsa da atılmasa da çalışır.

### En İyi Uygulamalar
- Her zaman en spesifik istisnayı ilk yakalayın.
- `Throwable`, `Exception` veya `RuntimeException` yakalamaktan kaçının, zorunlu olmadıkça.
- Kaynakları `finally` bloğunda temizleyin veya otomatik kaynak yönetimi için try-with-resources kullanın.
- Hata ayıklamaya yardımcı olacak anlamlı mesajlar sağlayın.

Bu uygulamaları takip ederek, Java uygulamalarınızda istisnaları etkili bir şekilde yönetebilir, sağlamlık ve güvenilirlik sağlayabilirsiniz.
