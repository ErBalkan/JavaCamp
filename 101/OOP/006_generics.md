# Java Generics

Java Generics, Java programlama dilinde tür güvenliğini sağlamak ve kodun yeniden kullanılabilirliğini artırmak için kullanılan bir özelliktir. Generics, sınıfların, arayüzlerin ve metodların belirli bir türle çalışmasını sağlar.

## Generics'in Avantajları

1. **Tür Güvenliği**: Derleme zamanında tür hatalarını yakalar ve çalışma zamanında oluşabilecek hataları önler.
2. **Kodun Yeniden Kullanılabilirliği**: Aynı kodu farklı türlerle kullanmanıza olanak tanır.
3. **Daha Az Kod Tekrarı**: Aynı işlevi gören kodları farklı türler için tekrar yazmak zorunda kalmazsınız.

## Generics Kullanımı

### Generic Sınıflar

```java
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
```

### Generic Metodlar

```java
public <T> void printArray(T[] inputArray) {
    for (T element : inputArray) {
        System.out.printf("%s ", element);
    }
    System.out.println();
}
```

### Bounded Type Parameters

```java
public <T extends Number> void printNumbers(T[] numbers) {
    for (T number : numbers) {
        System.out.println(number);
    }
}
```

Generics, Java'da daha güvenli ve esnek kod yazmanıza yardımcı olur. Tür parametreleri ile çalışarak, kodunuzu daha genel ve yeniden kullanılabilir hale getirebilirsiniz.