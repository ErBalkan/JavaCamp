# Java Interface Konusu

Java'da interface, bir sınıfın hangi metodları uygulaması gerektiğini belirten bir şablondur. Interface'ler, sadece metod imzalarını içerir ve bu metodların nasıl uygulanacağına dair herhangi bir bilgi içermezler. Bu, interface'lerin soyut sınıflar gibi davranmasını sağlar, ancak çoklu kalıtımın mümkün olmadığı durumlarda daha esnek bir yapı sunar.

## Interface Tanımlama

Bir interface tanımlamak için `interface` anahtar kelimesi kullanılır:

```java
public interface Hayvan {
    void sesCikar();
    void hareketEt();
}
```

## Interface Uygulama

Bir sınıf, bir veya birden fazla interface'i `implements` anahtar kelimesi ile uygulayabilir:

```java
public class Kedi implements Hayvan {
    @Override
    public void sesCikar() {
        System.out.println("Miyav");
    }

    @Override
    public void hareketEt() {
        System.out.println("Kedi yürüyor");
    }
}
```

## Interface'lerin Avantajları

- **Çoklu Kalıtım**: Java'da bir sınıf sadece bir sınıftan kalıtım alabilir, ancak birden fazla interface'i uygulayabilir.
- **Soyutlama**: Interface'ler, uygulama detaylarını gizleyerek soyutlama sağlar.
- **Esneklik**: Interface'ler, farklı sınıfların aynı metodları farklı şekillerde uygulamasına olanak tanır.

## Örnek Kullanım

Aşağıda, bir interface ve bu interface'i uygulayan iki farklı sınıf örneği bulunmaktadır:

```java
public interface Ucan {
    void uc();
}

public class Kus implements Ucan {
    @Override
    public void uc() {
        System.out.println("Kuş uçuyor");
    }
}

public class Ucak implements Ucan {
    @Override
    public void uc() {
        System.out.println("Uçak uçuyor");
    }
}
```

Bu örnekte, `Kus` ve `Ucak` sınıfları `Ucan` interface'ini uygulayarak kendi `uc` metodlarını tanımlarlar.