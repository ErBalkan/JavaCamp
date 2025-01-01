# Java'da OOP ve Class

## Nesne Yönelimli Programlama (OOP)

Nesne Yönelimli Programlama (Object-Oriented Programming, OOP), yazılım geliştirme sürecinde kullanılan bir programlama paradigmasıdır. OOP'nin temel prensipleri şunlardır:

- **Sınıflar (Classes)**: Nesnelerin şablonlarıdır. Bir sınıf, nesnelerin sahip olacağı özellikleri (fields) ve davranışları (methods) tanımlar.
- **Nesneler (Objects)**: Sınıflardan türetilen örneklerdir. Her nesne, sınıfın özelliklerini ve davranışlarını taşır.
- **Kapsülleme (Encapsulation)**: Verilerin ve bu verilere erişim yöntemlerinin bir arada tutulmasıdır. Bu sayede veri gizliliği ve güvenliği sağlanır.
- **Miras (Inheritance)**: Bir sınıfın başka bir sınıftan özellik ve davranışlarını devralmasıdır. Bu, kodun yeniden kullanılabilirliğini artırır.
- **Çok Biçimlilik (Polymorphism)**: Aynı isimdeki metodların farklı şekillerde davranabilmesidir. Bu, metodların farklı nesneler üzerinde farklı işlemler yapabilmesini sağlar.

## Class (Sınıf)

Java'da sınıf, bir nesnenin özelliklerini ve davranışlarını tanımlayan bir yapıdır. Sınıflar, `class` anahtar kelimesi ile tanımlanır. Örnek bir sınıf tanımı şu şekildedir:

```java
public class Araba {
    // Özellikler (fields)
    String renk;
    String model;
    int yil;

    // Davranışlar (methods)
    void calistir() {
        System.out.println("Araba çalıştırıldı.");
    }

    void durdur() {
        System.out.println("Araba durduruldu.");
    }
}
```

Bu örnekte, `Araba` sınıfı üç özelliğe (`renk`, `model`, `yil`) ve iki metoda (`calistir`, `durdur`) sahiptir. Bu sınıftan türetilen her nesne, bu özelliklere ve davranışlara sahip olacaktır.

## Nesne Oluşturma

Bir sınıftan nesne oluşturmak için `new` anahtar kelimesi kullanılır. Örneğin:

```java
public class Main {
    public static void main(String[] args) {
        // Araba sınıfından bir nesne oluşturma
        Araba benimArabam = new Araba();
        benimArabam.renk = "Kırmızı";
        benimArabam.model = "Toyota";
        benimArabam.yil = 2020;

        // Nesne üzerinde metodları çağırma
        benimArabam.calistir();
        benimArabam.durdur();
    }
}
```

Bu kodda, `Araba` sınıfından `benimArabam` adında bir nesne oluşturulmuş ve bu nesnenin özellikleri atanmıştır. Daha sonra, nesne üzerindeki metodlar çağrılarak araba çalıştırılmış ve durdurulmuştur.
