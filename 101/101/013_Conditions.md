# Koşullu İfadeler (Conditions) - Java

Koşullu ifadeler, belirli bir koşulun doğru veya yanlış olmasına bağlı olarak farklı kod bloklarının çalıştırılmasını sağlar. Java'da koşullu ifadeler genellikle `if`, `else if`, `else` ve `switch` deyimleri ile kullanılır.

## `if` Deyimi

`if` deyimi, belirli bir koşulun doğru olup olmadığını kontrol eder. Eğer koşul doğruysa, `if` bloğu içerisindeki kod çalıştırılır.

```java
int num = 10;

if (num > 0) {
    System.out.println("Sayı pozitiftir.");
}
```

## `else if` Deyimi

`else if` deyimi, birden fazla koşulu kontrol etmek için kullanılır. İlk `if` koşulu yanlışsa, `else if` koşulu kontrol edilir.

```java
int num = 0;

if (num > 0) {
    System.out.println("Sayı pozitiftir.");
} else if (num < 0) {
    System.out.println("Sayı negatiftir.");
} else {
    System.out.println("Sayı sıfırdır.");
}
```

## `else` Deyimi

`else` deyimi, yukarıdaki `if` veya `else if` koşullarının hiçbiri doğru değilse çalıştırılır.

```java
int num = -5;

if (num > 0) {
    System.out.println("Sayı pozitiftir.");
} else if (num < 0) {
    System.out.println("Sayı negatiftir.");
} else {
    System.out.println("Sayı sıfırdır.");
}
```

## `switch` Deyimi

`switch` deyimi, bir değişkenin değerine bağlı olarak farklı kod bloklarının çalıştırılmasını sağlar. `switch` deyimi, birden fazla durumu kontrol etmek için kullanılır.

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Salı");
        break;
    case 3:
        System.out.println("Çarşamba");
        break;
    case 4:
        System.out.println("Perşembe");
        break;
    case 5:
        System.out.println("Cuma");
        break;
    case 6:
        System.out.println("Cumartesi");
        break;
    case 7:
        System.out.println("Pazar");
        break;
    default:
        System.out.println("Geçersiz gün");
        break;
}
```

Koşullu ifadeler, programların akışını kontrol etmek için temel araçlardır ve doğru kullanıldığında kodun okunabilirliğini ve bakımını artırır.