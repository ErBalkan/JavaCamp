# Java'da Metotlar

Java'da metotlar, belirli bir görevi yerine getirmek için yazılan kod bloklarıdır. Metotlar, kodun tekrar kullanılabilirliğini artırır ve programın daha düzenli ve okunabilir olmasını sağlar. İşte Java'da metotlar hakkında bilmeniz gereken temel bilgiler:

## Metot Tanımlama

Bir metot tanımlamak için aşağıdaki sözdizimini kullanırız:

```java
erişimBelirleyici dönüşTipi metotAdı(parametreListesi) {
    // Metot gövdesi
}
```

### Örnek

```java
public class Main {
    public static void main(String[] args) {
        selamVer();
    }

    public static void selamVer() {
        System.out.println("Merhaba, dünya!");
    }
}
```

Yukarıdaki örnekte, `selamVer` adında bir metot tanımlanmış ve `main` metodu içinde çağrılmıştır.

## Parametreler ve Dönüş Değeri

Metotlar, parametre alabilir ve bir değer döndürebilir. İşte bir örnek:

```java
public class Main {
    public static void main(String[] args) {
        int sonuc = topla(5, 3);
        System.out.println("Toplam: " + sonuc);
    }

    public static int topla(int a, int b) {
        return a + b;
    }
}
```

Bu örnekte, `topla` metodu iki parametre alır ve bu parametrelerin toplamını döner.

## Metot Aşırı Yükleme

Java'da aynı isimde birden fazla metot tanımlayabilirsiniz, ancak bu metotların parametre listeleri farklı olmalıdır. Buna metot aşırı yükleme denir.

### Örnek

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(topla(5, 3));
        System.out.println(topla(5.0, 3.0));
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static double topla(double a, double b) {
        return a + b;
    }
}
```

Bu örnekte, `topla` metodu hem `int` hem de `double` parametrelerle aşırı yüklenmiştir.

## Sonuç

Metotlar, Java programlamada önemli bir rol oynar. Kodunuzu daha modüler, okunabilir ve bakım yapılabilir hale getirirler. Metotları doğru bir şekilde kullanarak, daha etkili ve verimli programlar yazabilirsiniz.