# Java'da Array ve ArrayList

## Array
Array, aynı türden verileri saklamak için kullanılan sabit boyutlu bir veri yapısıdır. Array'ler, Java'da `[]` sembolü ile tanımlanır ve indeksleme 0'dan başlar.

### Array Tanımlama ve Kullanma
```java
// Array tanımlama
int[] sayilar = new int[5];

// Array'e değer atama
sayilar[0] = 10;
sayilar[1] = 20;
sayilar[2] = 30;
sayilar[3] = 40;
sayilar[4] = 50;

// Array'den değer okuma
int ilkSayi = sayilar[0];
System.out.println("İlk sayı: " + ilkSayi);
```

### Array'in Özellikleri
- Sabit boyutludur.
- Aynı türden verileri saklar.
- Hızlı erişim sağlar.

## ArrayList
ArrayList, dinamik boyutlu bir veri yapısıdır ve `java.util` paketinde bulunur. ArrayList, eleman ekleme ve çıkarma işlemlerinde daha esnektir.

### ArrayList Tanımlama ve Kullanma
```java
import java.util.ArrayList;

// ArrayList tanımlama
ArrayList<Integer> sayilarListesi = new ArrayList<>();

// ArrayList'e değer ekleme
sayilarListesi.add(10);
sayilarListesi.add(20);
sayilarListesi.add(30);

// ArrayList'ten değer okuma
int ilkSayi = sayilarListesi.get(0);
System.out.println("İlk sayı: " + ilkSayi);

// ArrayList'ten değer çıkarma
sayilarListesi.remove(1); // 20 değerini çıkarır
```

### ArrayList'in Özellikleri
- Dinamik boyutludur.
- Farklı türden verileri saklayabilir (Generic kullanılarak tür belirlenir).
- Eleman ekleme ve çıkarma işlemleri kolaydır.

### Array ve ArrayList Karşılaştırması
| Özellik         | Array                | ArrayList           |
|-----------------|----------------------|---------------------|
| Boyut           | Sabit                | Dinamik             |
| Performans      | Daha hızlı           | Daha yavaş          |
| Esneklik        | Daha az esnek        | Daha esnek          |
| Tür             | Aynı türden veriler  | Farklı türden veriler|
