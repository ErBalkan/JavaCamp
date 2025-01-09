# Java'da Paketler

Java'da paketler, sınıfları ve arayüzleri organize etmek için kullanılan bir yapıdır. Paketler, benzer işlevleri olan sınıfları bir araya getirerek kodun daha düzenli ve yönetilebilir olmasını sağlar. Ayrıca, isim çakışmalarını önlemek ve erişim kontrolü sağlamak için de kullanılırlar.

## Paket Tanımlama

Bir paketi tanımlamak için `package` anahtar kelimesi kullanılır. Paket tanımı, dosyanın en üstünde yer almalıdır. Örneğin:

```java
package com.example.myapp;
```

Bu örnekte, `com.example.myapp` adında bir paket tanımlanmıştır.

## Paket Kullanımı

Başka bir paketteki sınıfı kullanmak için `import` anahtar kelimesi kullanılır. Örneğin:

```java
import com.example.myapp.MyClass;
```

Bu satır, `com.example.myapp` paketindeki `MyClass` sınıfını kullanmak için gerekli olan bildirimi yapar.

## Varsayılan Paket

Eğer bir sınıf herhangi bir pakete dahil edilmezse, varsayılan pakette yer alır. Ancak, varsayılan paket kullanımı büyük projelerde önerilmez çünkü isim çakışmalarına ve yönetim zorluklarına yol açabilir.

## Paketlerin Avantajları

- **Düzen ve Organizasyon:** Kodun daha düzenli ve okunabilir olmasını sağlar.
- **Erişim Kontrolü:** Farklı erişim seviyeleri ile sınıfların ve üyelerin görünürlüğünü kontrol eder.
- **İsim Çakışmalarını Önleme:** Aynı isimde farklı sınıfların kullanılabilmesini sağlar.

## Örnek

Aşağıda, iki farklı pakette tanımlanmış sınıfların nasıl kullanılacağını gösteren bir örnek bulunmaktadır:

```java
// com/example/util/Utility.java
package com.example.util;

public class Utility {
    public static void printMessage(String message) {
        System.out.println(message);
    }
}

// com/example/app/Main.java
package com.example.app;

import com.example.util.Utility;

public class Main {
    public static void main(String[] args) {
        Utility.printMessage("Merhaba, Dünya!");
    }
}
```

Bu örnekte, `Utility` sınıfı `com.example.util` paketinde tanımlanmış ve `Main` sınıfı `com.example.app` paketinde bu sınıfı kullanmıştır.
