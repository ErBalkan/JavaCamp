
# Java Date and Time

Java'da tarih ve saat işlemleri için `java.time` paketi kullanılır. Bu paket, tarih ve saat ile ilgili işlemleri kolaylaştıran sınıflar içerir. Bu rehberde, temel tarih ve saat işlemlerinden profesyonel seviyeye kadar örnekler ve çıktıları ile birlikte anlatılacaktır.

## Temel Tarih ve Saat İşlemleri

### LocalDate

`LocalDate` sınıfı, sadece tarih bilgisi tutar (yıl, ay, gün).

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Bugünün tarihi: " + today);
    }
}
```

**Çıktı:**
```
Bugünün tarihi: 2023-10-05
```

### LocalTime

`LocalTime` sınıfı, sadece saat bilgisi tutar (saat, dakika, saniye, nanosaniye).

```java
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Şu anki saat: " + now);
    }
}
```

**Çıktı:**
```
Şu anki saat: 14:30:15.123456789
```

### LocalDateTime

`LocalDateTime` sınıfı, tarih ve saat bilgilerini birlikte tutar.

```java
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Şu anki tarih ve saat: " + now);
    }
}
```

**Çıktı:**
```
Şu anki tarih ve saat: 2023-10-05T14:30:15.123456789
```

## İleri Seviye Tarih ve Saat İşlemleri

### ZonedDateTime

`ZonedDateTime` sınıfı, tarih ve saat bilgilerini zaman dilimi ile birlikte tutar.

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("İstanbul'daki tarih ve saat: " + zonedDateTime);
    }
}
```

**Çıktı:**
```
İstanbul'daki tarih ve saat: 2023-10-05T14:30:15.123456789+03:00[Europe/Istanbul]
```

### DateTimeFormatter

`DateTimeFormatter` sınıfı, tarih ve saat bilgilerini belirli bir formata göre biçimlendirmek için kullanılır.

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Biçimlendirilmiş tarih ve saat: " + formattedDateTime);
    }
}
```

**Çıktı:**
```
Biçimlendirilmiş tarih ve saat: 05-10-2023 14:30:15
```

### Period ve Duration

`Period` sınıfı, iki tarih arasındaki farkı gün, ay ve yıl cinsinden hesaplar. `Duration` sınıfı ise iki zaman arasındaki farkı saat, dakika ve saniye cinsinden hesaplar.

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println("Başlangıç ve bitiş tarihi arasındaki fark: " + period.getYears() + " yıl, " + period.getMonths() + " ay, " + period.getDays() + " gün");

        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.now();
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Başlangıç ve bitiş saati arasındaki fark: " + duration.toHours() + " saat, " + duration.toMinutes() % 60 + " dakika, " + duration.getSeconds() % 60 + " saniye");
    }
}
```

**Çıktı:**
```
Başlangıç ve bitiş tarihi arasındaki fark: 3 yıl, 9 ay, 4 gün
Başlangıç ve bitiş saati arasındaki fark: 4 saat, 30 dakika, 15 saniye
```

Bu örnekler, Java'da tarih ve saat işlemlerini profesyonel seviyede kullanmanıza yardımcı olacaktır.