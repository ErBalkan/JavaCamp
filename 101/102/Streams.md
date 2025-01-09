# Java Streams

Java Streams API, Java 8 ile birlikte gelen ve koleksiyonlar üzerinde fonksiyonel programlama tarzında işlem yapmayı sağlayan bir yapıdır. Streams API, veri işlemlerini daha okunabilir ve daha az hata yapma olasılığı ile yazmayı sağlar.

## Temel Kavramlar

### Stream Nedir?
Stream, bir veri kaynağından (koleksiyon, dizi, I/O kanalı vb.) gelen verilerin ardışık bir şekilde işlenmesini sağlayan bir yapıdır. Stream'ler, veri kaynağını değiştirmezler ve genellikle lambda ifadeleri ile kullanılırlar.

### Stream Oluşturma
Stream oluşturmanın birkaç yolu vardır:
- Koleksiyonlardan
- Dizilerden
- Dosyalardan
- Fonksiyonel kaynaklardan

```java
List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

// Koleksiyonlardan Stream oluşturma
Stream<String> streamFromList = myList.stream();

// Dizilerden Stream oluşturma
Stream<String> streamFromArray = Stream.of("a1", "a2", "b1", "c2", "c1");

// Dosyalardan Stream oluşturma
Stream<String> streamFromFile = Files.lines(Paths.get("path/to/file.txt"));

// Fonksiyonel kaynaklardan Stream oluşturma
Stream<Integer> streamFromIterate = Stream.iterate(0, n -> n + 1).limit(10);
```

### Ara İşlemler (Intermediate Operations)
Ara işlemler, bir Stream üzerinde yapılan ve başka bir Stream döndüren işlemlerdir. Bu işlemler lazy (tembel) olarak değerlendirilir, yani sonlandırıcı bir işlem (terminal operation) çağrılana kadar gerçekleştirilmezler.

- `filter()`: Belirli bir koşulu sağlayan elemanları seçer.
- `map()`: Her elemanı başka bir elemana dönüştürür.
- `sorted()`: Elemanları sıralar.
- `distinct()`: Tekrarlanan elemanları çıkarır.
- `limit()`: İlk n elemanı alır.
- `skip()`: İlk n elemanı atlar.

```java
List<String> filteredList = myList.stream()
    .filter(s -> s.startsWith("c"))
    .collect(Collectors.toList());
```

### Sonlandırıcı İşlemler (Terminal Operations)
Sonlandırıcı işlemler, bir Stream üzerinde yapılan ve bir sonuç döndüren işlemlerdir. Bu işlemler Stream'i tüketir ve genellikle eager (hemen) olarak değerlendirilirler.

- `collect()`: Elemanları bir koleksiyona toplar.
- `forEach()`: Her eleman için bir işlem yapar.
- `reduce()`: Elemanları birleştirerek tek bir sonuç döndürür.
- `count()`: Eleman sayısını döndürür.
- `anyMatch()`, `allMatch()`, `noneMatch()`: Belirli bir koşulu sağlayan eleman olup olmadığını kontrol eder.

```java
long count = myList.stream()
    .filter(s -> s.startsWith("c"))
    .count();
```

### Paralel Stream'ler
Paralel Stream'ler, büyük veri setleri üzerinde daha hızlı işlem yapmayı sağlar. `parallelStream()` metodu ile oluşturulurlar.

```java
List<String> parallelList = myList.parallelStream()
    .filter(s -> s.startsWith("c"))
    .collect(Collectors.toList());
```

## Örnekler

### Örnek 1: İsimleri Büyük Harfe Çevirme ve Sıralama
```java
List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

List<String> sortedNames = names.stream()
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
```

### Örnek 2: Sayıların Karelerini Bulma ve Toplama
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

int sumOfSquares = numbers.stream()
    .map(n -> n * n)
    .reduce(0, Integer::sum);
```

### Örnek 3: Dosyadan Satırları Okuma ve Filtreleme
```java
try (Stream<String> lines = Files.lines(Paths.get("path/to/file.txt"))) {
    List<String> filteredLines = lines
        .filter(line -> line.contains("error"))
        .collect(Collectors.toList());
} catch (IOException e) {
    e.printStackTrace();
}
```

Java Streams API, veri işlemlerini daha basit ve okunabilir hale getirir. Fonksiyonel programlama prensiplerini kullanarak, daha az kod ile daha güçlü ve esnek veri işleme işlemleri gerçekleştirebilirsiniz.