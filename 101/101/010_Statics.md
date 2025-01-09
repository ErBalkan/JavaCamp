# Java'da Statikler

Java'da `static` anahtar kelimesi, bir sınıfın üyelerine (değişkenler ve metotlar) sınıf düzeyinde erişim sağlamak için kullanılır. `static` üyeler, sınıfın herhangi bir örneği oluşturulmadan kullanılabilir. İşte Java'da `static` anahtar kelimesinin kullanımı hakkında bazı önemli noktalar:

## Static Değişkenler

Static değişkenler, sınıf düzeyinde tanımlanır ve tüm sınıf örnekleri arasında paylaşılır. Bir sınıfın tüm örnekleri aynı static değişkeni paylaşır.

```java
public class MyClass {
    public static int staticVariable = 10;
}
```

## Static Metotlar

Static metotlar, sınıf düzeyinde tanımlanır ve sınıfın herhangi bir örneği oluşturulmadan çağrılabilir. Static metotlar, yalnızca static değişkenlere ve diğer static metotlara erişebilir.

```java
public class MyClass {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
```

## Static Bloklar

Static bloklar, sınıf yüklenirken bir kez çalıştırılır ve genellikle static değişkenlerin başlatılması için kullanılır.

```java
public class MyClass {
    public static int staticVariable;

    static {
        staticVariable = 10;
    }
}
```

## Static İç Sınıflar

Static iç sınıflar, dış sınıfın bir örneği olmadan kullanılabilir. Static iç sınıflar, dış sınıfın static üyelerine doğrudan erişebilir.

```java
public class OuterClass {
    static class InnerClass {
        public void display() {
            System.out.println("This is a static inner class.");
        }
    }
}
```

## Örnek Kullanım

```java
public class Main {
    public static void main(String[] args) {
        // Static değişkene erişim
        System.out.println(MyClass.staticVariable);

        // Static metoda erişim
        MyClass.staticMethod();

        // Static iç sınıfa erişim
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.display();
    }
}
```

Java'da `static` anahtar kelimesi, sınıf üyelerine sınıf düzeyinde erişim sağlamak için güçlü bir araçtır ve doğru kullanıldığında kodunuzu daha verimli hale getirebilir.