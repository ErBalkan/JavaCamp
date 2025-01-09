# Java'da Sabitler

Java'da sabitler (constants), programın çalışması sırasında değeri değişmeyen değişkenlerdir. Sabitler, genellikle `final` anahtar kelimesi kullanılarak tanımlanır. Sabitler, kodun okunabilirliğini artırır ve yanlışlıkla değerlerin değiştirilmesini engeller.

## Sabitlerin Tanımlanması

Java'da bir sabit tanımlamak için `final` anahtar kelimesi kullanılır. Sabitler genellikle büyük harflerle yazılır ve kelimeler arasına alt çizgi (_) konulur.

```java
public class Sabitler {
    public static final int MAX_DEGER = 100;
    public static final String MESAJ = "Merhaba, Dünya!";
}
```

Yukarıdaki örnekte, `MAX_DEGER` ve `MESAJ` sabitleri tanımlanmıştır. Bu sabitlerin değerleri programın hiçbir yerinde değiştirilemez.

## Sabitlerin Kullanımı

Sabitler, genellikle sınıf seviyesinde tanımlanır ve `static` anahtar kelimesi ile birlikte kullanılır. Bu sayede, sabitlere sınıf adı üzerinden erişilebilir.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Sabitler.MAX_DEGER);
        System.out.println(Sabitler.MESAJ);
    }
}
```

Yukarıdaki örnekte, `Sabitler` sınıfında tanımlanan sabitlere `Sabitler.MAX_DEGER` ve `Sabitler.MESAJ` şeklinde erişilmiştir.

## Neden Sabit Kullanmalıyız?

- **Okunabilirlik**: Sabitler, kodun daha okunabilir olmasını sağlar. Değerlerin anlamını açıklayan isimler kullanarak kodun ne yaptığını anlamak kolaylaşır.
- **Bakım Kolaylığı**: Sabitler, değerlerin merkezi bir yerde tanımlanmasını sağlar. Bu sayede, bir değeri değiştirmek gerektiğinde sadece sabitin tanımlandığı yeri değiştirmek yeterlidir.
- **Hata Önleme**: Sabitler, yanlışlıkla değerlerin değiştirilmesini engeller. Bu, özellikle büyük projelerde hata yapma olasılığını azaltır.

Java'da sabitler, kodun daha güvenli, okunabilir ve bakımı kolay olmasını sağlar. Bu nedenle, sabitleri kullanmak iyi bir programlama pratiğidir.