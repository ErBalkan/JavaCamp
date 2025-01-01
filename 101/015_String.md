# Java'da String Konusu

Java'da `String` sınıfı, karakter dizilerini temsil eder ve `java.lang` paketinde bulunur. `String` nesneleri değişmezdir (immutable), yani oluşturulduktan sonra değiştirilemezler.

## String Oluşturma

```java
String str1 = "Merhaba";
String str2 = new String("Dünya");
```

## String Metotları

### length()
Bir `String`'in uzunluğunu döner.

```java
int uzunluk = str1.length();
```

### charAt()
Belirtilen indeksdeki karakteri döner.

```java
char karakter = str1.charAt(0); // 'M'
```

### substring()
Bir alt dize döner.

```java
String altDize = str1.substring(0, 3); // "Mer"
```

### equals()
İki `String`'in eşit olup olmadığını kontrol eder.

```java
boolean esitMi = str1.equals(str2);
```

### toUpperCase() ve toLowerCase()
Tüm karakterleri büyük veya küçük harfe çevirir.

```java
String buyuk = str1.toUpperCase(); // "MERHABA"
String kucuk = str1.toLowerCase(); // "merhaba"
```

### trim()
Baştaki ve sondaki boşlukları kaldırır.

```java
String kirpilmis = str1.trim();
```

### replace()
Bir karakteri veya karakter dizisini başka bir karakter veya karakter dizisi ile değiştirir.

```java
String yeniStr = str1.replace('a', 'e'); // "Merhebe"
```

## String Birleştirme

### concat()
İki `String`'i birleştirir.

```java
String birlesik = str1.concat(" ").concat(str2); // "Merhaba Dünya"
```

### + Operatörü
`+` operatörü ile de `String` birleştirme yapılabilir.

```java
String birlesik = str1 + " " + str2; // "Merhaba Dünya"
```

## StringBuilder ve StringBuffer

`String` nesneleri değişmez olduğundan, çok fazla `String` işlemi yapıldığında performans sorunları yaşanabilir. Bu durumlarda `StringBuilder` veya `StringBuffer` kullanılabilir.

```java
StringBuilder sb = new StringBuilder();
sb.append("Merhaba");
sb.append(" ");
sb.append("Dünya");
String sonuc = sb.toString(); // "Merhaba Dünya"
```
