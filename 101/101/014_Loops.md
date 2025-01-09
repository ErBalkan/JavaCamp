# Java'da Döngüler

Java programlama dilinde döngüler, belirli bir kod bloğunu birden fazla kez çalıştırmak için kullanılır. Java'da üç ana döngü türü vardır: `for`, `while` ve `do-while` döngüleri.

## `for` Döngüsü

`for` döngüsü, belirli bir sayıda tekrarlanması gereken işlemler için kullanılır. Genel yapısı şu şekildedir:

```java
for (başlangıç; koşul; artış) {
    // çalıştırılacak kod
}
```

Örnek:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Bu örnekte, `i` değişkeni 0'dan başlayarak 5'e kadar (5 dahil değil) artar ve her adımda `i` değeri ekrana yazdırılır.

## `while` Döngüsü

`while` döngüsü, belirli bir koşul doğru olduğu sürece kod bloğunu tekrarlar. Genel yapısı şu şekildedir:

```java
while (koşul) {
    // çalıştırılacak kod
}
```

Örnek:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

Bu örnekte, `i` değişkeni 0'dan başlayarak 5'e kadar artar ve her adımda `i` değeri ekrana yazdırılır.

## `do-while` Döngüsü

`do-while` döngüsü, en az bir kez çalıştırılması gereken kod blokları için kullanılır. Genel yapısı şu şekildedir:

```java
do {
    // çalıştırılacak kod
} while (koşul);
```

Örnek:

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

Bu örnekte, `i` değişkeni 0'dan başlayarak 5'e kadar artar ve her adımda `i` değeri ekrana yazdırılır.

## Sonuç

Java'da döngüler, belirli işlemleri tekrar etmek için güçlü araçlardır. `for`, `while` ve `do-while` döngüleri, farklı senaryolarda kullanılmak üzere tasarlanmıştır ve programcıların işini büyük ölçüde kolaylaştırır.