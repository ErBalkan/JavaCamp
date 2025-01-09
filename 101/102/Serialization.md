# Java Serialization

## Giriş
Java'da serialization, bir nesnenin durumunu byte stream olarak kaydetme ve bu byte stream'i daha sonra yeniden nesne olarak oluşturma işlemidir. Bu, nesnelerin dosyalara, veritabanlarına veya ağ üzerinden iletilmesine olanak tanır.

## Temel Kavramlar

### Serializable Arayüzü
Serialization işlemi için bir sınıfın `java.io.Serializable` arayüzünü implement etmesi gerekir. Bu arayüz herhangi bir metot içermez, sadece işaretleyici (marker) bir arayüzdür.

```java
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    // Getter ve Setter metodları
}
```

### ObjectOutputStream ve ObjectInputStream
Serialization ve deserialization işlemleri için `ObjectOutputStream` ve `ObjectInputStream` sınıfları kullanılır.

```java
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## Gelişmiş Konular

### `transient` Anahtar Kelimesi
Bazı alanların serialization işlemine dahil edilmemesi istenebilir. Bu durumda `transient` anahtar kelimesi kullanılır.

```java
public class Person implements Serializable {
    private String name;
    private transient int age; // Bu alan serialize edilmeyecek

    // Getter ve Setter metodları
}
```

### `serialVersionUID`
Her Serializable sınıfının bir `serialVersionUID` alanı olmalıdır. Bu, sınıfın sürümünü belirtir ve farklı sürümler arasında uyumluluğu sağlar.

```java
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    // Getter ve Setter metodları
}
```

### Özelleştirilmiş Serialization
Bazı durumlarda, varsayılan serialization işlemi yeterli olmayabilir. Bu durumda `writeObject` ve `readObject` metodları override edilerek özelleştirilmiş serialization yapılabilir.

```java
private void writeObject(ObjectOutputStream out) throws IOException {
    out.defaultWriteObject();
    // Özelleştirilmiş işlemler
}

private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    // Özelleştirilmiş işlemler
}
```

## Sonuç
Java'da serialization, nesnelerin durumunu kalıcı hale getirmek ve yeniden oluşturmak için güçlü bir mekanizmadır. Temel kavramlardan başlayarak, gelişmiş konulara kadar bu rehber, serialization işlemlerini profesyonel seviyede anlamanıza yardımcı olacaktır