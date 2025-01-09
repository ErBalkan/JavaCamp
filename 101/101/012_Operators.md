# Java'da Aritmetiksel ve Mantıksal Operatörler

## Aritmetiksel Operatörler
Java'da aritmetiksel operatörler, sayısal değerler üzerinde matematiksel işlemler yapmak için kullanılır. İşte temel aritmetiksel operatörler:

- `+` (Toplama): İki değeri toplar.
- `-` (Çıkarma): Bir değeri diğerinden çıkarır.
- `*` (Çarpma): İki değeri çarpar.
- `/` (Bölme): Bir değeri diğerine böler.
- `%` (Modül): Bir değerin diğerine bölümünden kalanı verir.

Örnek:
```java
int a = 10;
int b = 5;
int toplam = a + b; // 15
int fark = a - b; // 5
int carpim = a * b; // 50
int bolum = a / b; // 2
int kalan = a % b; // 0
```

## Mantıksal Operatörler
Mantıksal operatörler, boolean (doğru/yanlış) değerlerle çalışır ve genellikle koşullu ifadelerde kullanılır. İşte temel mantıksal operatörler:

- `&&` (Mantıksal VE): Her iki operand da doğruysa, sonuç doğrudur.
- `||` (Mantıksal VEYA): Operandlardan en az biri doğruysa, sonuç doğrudur.
- `!` (Mantıksal DEĞİL): Operandın değerini tersine çevirir.

Örnek:
```java
boolean x = true;
boolean y = false;
boolean sonuc1 = x && y; // false
boolean sonuc2 = x || y; // true
boolean sonuc3 = !x; // false
```

Bu operatörler, Java programlarında matematiksel ve mantıksal işlemleri gerçekleştirmek için yaygın olarak kullanılır.