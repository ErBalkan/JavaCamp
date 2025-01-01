# Java Enum (Sabitler) Konusu

Java'da `enum` (sabitler), sabit değerlerin bir listesini tanımlamak için kullanılan özel bir veri türüdür. `enum` anahtar kelimesi ile tanımlanır ve genellikle sabit değerlerin bir grup olarak temsil edilmesi gerektiğinde kullanılır. İşte `enum` konusunun detayları:

## Enum Tanımlama

Bir `enum` tanımlamak için `enum` anahtar kelimesi kullanılır. Örneğin:

```java
public enum Gun {
    PAZARTESI,
    SALI,
    CARSAMBA,
    PERSEMBE,
    CUMA,
    CUMARTESI,
    PAZAR
}
```

Yukarıdaki örnekte, haftanın günlerini temsil eden bir `enum` tanımlanmıştır.

## Enum Kullanımı

`enum` türündeki değişkenler, tanımlanan sabit değerlerden birini alabilir. Örneğin:

```java
public class Main {
    public static void main(String[] args) {
        Gun bugun = Gun.PAZARTESI;
        System.out.println("Bugün: " + bugun);
    }
}
```

Bu örnekte, `bugun` değişkeni `Gun` enum'undan bir değer alır ve bu değer ekrana yazdırılır.

## Enum ile Metotlar

`enum` içine metotlar da tanımlanabilir. Örneğin:

```java
public enum Gun {
    PAZARTESI,
    SALI,
    CARSAMBA,
    PERSEMBE,
    CUMA,
    CUMARTESI,
    PAZAR;

    public boolean isHaftaSonu() {
        return this == CUMARTESI || this == PAZAR;
    }
}
```

Bu örnekte, `isHaftaSonu` metodu, günün hafta sonu olup olmadığını kontrol eder.

## Enum Constructor ve Alanlar

`enum` sabitleri, constructor ve alanlar ile birlikte kullanılabilir. Örneğin:

```java
public enum Gun {
    PAZARTESI("Pazartesi"),
    SALI("Salı"),
    CARSAMBA("Çarşamba"),
    PERSEMBE("Perşembe"),
    CUMA("Cuma"),
    CUMARTESI