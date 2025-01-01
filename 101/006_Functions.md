# Java'da Fonksiyonlar

## Giriş
Java'da fonksiyonlar, belirli bir görevi yerine getirmek için yazılmış kod bloklarıdır. Fonksiyonlar, kodun tekrar kullanılabilirliğini artırır ve programın daha düzenli ve okunabilir olmasını sağlar.

## Fonksiyon Tanımlama
Java'da bir fonksiyon tanımlamak için `returnType` (dönüş tipi), `functionName` (fonksiyon adı) ve `parameters` (parametreler) belirtilir. Örnek bir fonksiyon tanımı şu şekildedir:

```java
public int toplama(int a, int b) {
    return a + b;
}
```

## Fonksiyon Çağırma
Tanımlanan bir fonksiyon, fonksiyon adı ve gerekli parametreler kullanılarak çağrılır:

```java
int sonuc = toplama(5, 3);
System.out.println(sonuc); // Çıktı: 8
```

## Parametreler ve Dönüş Tipleri
Fonksiyonlar, farklı türde parametreler alabilir ve farklı türde değerler döndürebilir. İşte bazı örnekler:

### Parametresiz Fonksiyon
```java
public void merhabaDunya() {
    System.out.println("Merhaba Dünya!");
}
```

### Farklı Dönüş Tipleri
```java
public String selamVer(String isim) {
    return "Merhaba, " + isim;
}
```

## Overloading (Aşırı Yükleme)
Java'da aynı isimde birden fazla fonksiyon tanımlanabilir. Bu işleme "overloading" denir. Overloading, fonksiyonların farklı parametre türleri veya sayıları ile tanımlanmasıyla gerçekleştirilir.

```java
public int carpma(int a, int b) {
    return a * b;
}

public double carpma(double a, double b) {
    return a * b;
}
```

## Recursive Fonksiyonlar
Recursive fonksiyonlar, kendilerini çağıran fonksiyonlardır. Bu tür fonksiyonlar genellikle matematiksel hesaplamalar ve algoritmalar için kullanılır.

```java
public int faktoriyel(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * faktoriyel(n - 1);
    }
}
```

## Lambda İfadeleri ve Fonksiyonel Programlama
Java 8 ile birlikte gelen lambda ifadeleri, fonksiyonel programlama konseptini destekler. Lambda ifadeleri, anonim fonksiyonlar oluşturmak için kullanılır.

```java
List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5);
sayilar.forEach(n -> System.out.println(n));
```

## Sonuç
Java'da fonksiyonlar, programlamanın temel yapı taşlarından biridir. Fonksiyonlar, kodun modülerliğini ve tekrar kullanılabilirliğini artırır. Profesyonel seviyede fonksiyon kullanımı, kodun daha temiz, bakımı kolay ve verimli olmasını sağlar.