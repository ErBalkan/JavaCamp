# Java'da Thread Konusu

Java'da thread, aynı anda birden fazla işlemi gerçekleştirmek için kullanılan bir programlama yapısıdır. Thread'ler, bir programın daha küçük parçalara bölünmesini ve bu parçaların paralel olarak çalışmasını sağlar. Bu, özellikle büyük ve karmaşık programlarda performansı artırmak için önemlidir.

## Thread Oluşturma

Java'da thread oluşturmanın iki temel yolu vardır:
1. `Thread` sınıfını genişletmek
2. `Runnable` arayüzünü uygulamak

### 1. Thread Sınıfını Genişletmek

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread çalışıyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

### 2. Runnable Arayüzünü Uygulamak

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable çalışıyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
```

## Thread Metotları

Java'da thread'lerle çalışırken kullanabileceğiniz bazı önemli metotlar şunlardır:
- `start()`: Thread'i başlatır.
- `run()`: Thread'in çalıştırılacak kodunu tanımlar.
- `sleep(long millis)`: Thread'in belirtilen süre boyunca uyumasını sağlar.
- `join()`: Başka bir thread'in bitmesini bekler.
- `interrupt()`: Thread'i kesintiye uğratır.

## Örnek Kullanım

```java
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " çalışıyor.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        thread1.start();
        thread2.start();
    }
}
```

Bu örnekte, iki ayrı thread oluşturulmuş ve her biri 5 kez çalıştırılmıştır. Her bir thread, çalışması sırasında bir saniye uyur ve ardından tekrar çalışır.
