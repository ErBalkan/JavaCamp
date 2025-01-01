# Java Nedir ve Nasıl Çalışır?

## Java Nedir?
Java, Sun Microsystems tarafından geliştirilen, nesne yönelimli, platform bağımsız bir programlama dilidir. 1995 yılında piyasaya sürülmüştür ve günümüzde Oracle Corporation tarafından geliştirilmektedir. Java, "Write Once, Run Anywhere" (Bir Kez Yaz, Her Yerde Çalıştır) sloganıyla bilinir, çünkü yazılan kodlar herhangi bir platformda çalışabilir.

## Java Nasıl Çalışır?
Java programları, Java Virtual Machine (JVM) adı verilen bir ortamda çalışır. Java'nın çalışma süreci şu adımlardan oluşur:

1. **Kaynak Kodun Yazılması**: Java programları `.java` uzantılı dosyalarda yazılır.
2. **Derleme**: Yazılan kaynak kod, `javac` derleyicisi kullanılarak bytecode adı verilen ara koda dönüştürülür. Bu bytecode `.class` uzantılı dosyalarda saklanır.
3. **Çalıştırma**: Bytecode, JVM tarafından yorumlanarak çalıştırılır. JVM, bytecode'u her platformda çalıştırabilecek şekilde tasarlanmıştır.

## Java'nın Avantajları
- **Platform Bağımsızlığı**: Java programları, JVM sayesinde herhangi bir işletim sisteminde çalışabilir.
- **Nesne Yönelimli Programlama**: Java, nesne yönelimli programlama prensiplerini destekler.
- **Güvenlik**: Java, güvenli bir programlama dili olarak tasarlanmıştır ve çeşitli güvenlik özelliklerine sahiptir.
- **Geniş Kütüphane Desteği**: Java, zengin bir standart kütüphane setine sahiptir.

## Örnek Java Kodu
```java
public class MerhabaDunya {
    public static void main(String[] args) {
        System.out.println("Merhaba, Dünya!");
    }
}
```

Bu örnek, ekrana "Merhaba, Dünya!" yazdıran basit bir Java programıdır.
