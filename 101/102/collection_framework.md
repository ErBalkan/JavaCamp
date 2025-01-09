# Java Collection Framework

Java Collection Framework, veri yapıları ve algoritmalar için bir dizi sınıf ve arayüz sağlar. Bu framework, verileri depolamak, yönetmek ve işlemek için kullanılır. Bu rehberde, Java Collection Framework'ü başlangıç seviyesinden profesyonel seviyeye kadar örnek kodlarla anlatacağız.

## 1. List Interface

### ArrayList

ArrayList, dinamik boyutlu bir dizi uygulamasıdır. Eleman ekleme, çıkarma ve erişim işlemleri hızlıdır.

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

**Çıktı:**
```
Apple
Banana
Cherry
```

### LinkedList

LinkedList, çift yönlü bağlı liste uygulamasıdır. Eleman ekleme ve çıkarma işlemleri hızlıdır.

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Cow");

        for (String animal : list) {
            System.out.println(animal);
        }
    }
}
```

**Çıktı:**
```
Dog
Cat
Cow
```

## 2. Set Interface

### HashSet

HashSet, benzersiz elemanlar içeren bir koleksiyondur. Elemanların sırası garanti edilmez.

```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        for (String color : set) {
            System.out.println(color);
        }
    }
}
```

**Çıktı:**
```
Red
Green
Blue
```

### TreeSet

TreeSet, sıralı ve benzersiz elemanlar içeren bir koleksiyondur.

```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

**Çıktı:**
```
Apple
Banana
Orange
```

## 3. Map Interface

### HashMap

HashMap, anahtar-değer çiftleri içeren bir koleksiyondur. Anahtarlar benzersizdir.

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
```

**Çıktı:**
```
1 = One
2 = Two
3 = Three
```

### TreeMap

TreeMap, sıralı anahtar-değer çiftleri içeren bir koleksiyondur.

```java
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
```

**Çıktı:**
```
1 = One
2 = Two
3 = Three
```

## 4. Queue Interface

### PriorityQueue

PriorityQueue, öncelik sırasına göre elemanları tutan bir kuyruktur.

```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```

**Çıktı:**
```
1
3
5
```

Bu rehberde, Java Collection Framework'ün temel bileşenlerini ve kullanım örneklerini inceledik. Daha ileri seviye konular için Java'nın resmi dokümantasyonuna başvurabilirsiniz.