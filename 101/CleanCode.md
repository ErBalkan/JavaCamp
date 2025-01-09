# Java'da Clean Code Yazma Sanatı

Clean code, yazılım geliştirme sürecinde okunabilir, sürdürülebilir ve bakımı kolay kod yazma pratiğidir. Java dilinde clean code yazmak, yazılımın kalitesini artırır ve ekip içi işbirliğini kolaylaştırır. İşte Java'da clean code yazma sanatının temel prensipleri:

## 1. Anlamlı İsimler Kullanın
Değişken, fonksiyon ve sınıf isimleri, ne işe yaradıklarını açıkça belirtmelidir. Anlamlı ve açıklayıcı isimler, kodun okunabilirliğini artırır.

```java
// Kötü örnek
int d; // Bu değişkenin ne anlama geldiği belirsiz

// İyi örnek
int daysSinceLastUpdate; // Değişkenin amacı açıkça belirtilmiş
```

## 2. Fonksiyonları Küçük ve Tek Bir İş Yapar Hale Getirin
Her fonksiyon, yalnızca tek bir işi yapmalı ve bu işi iyi yapmalıdır. Fonksiyonlar küçük tutulmalı ve gerektiğinde daha küçük parçalara bölünmelidir.

```java
// Kötü örnek
public void processOrder(Order order) {
    validateOrder(order);
    calculateTotal(order);
    saveOrder(order);
    sendConfirmationEmail(order);
}

// İyi örnek
public void processOrder(Order order) {
    validateOrder(order);
    calculateTotal(order);
    saveOrder(order);
    sendConfirmationEmail(order);
}

private void validateOrder(Order order) {
    // Sipariş doğrulama işlemleri
}

private void calculateTotal(Order order) {
    // Toplam hesaplama işlemleri
}

private void saveOrder(Order order) {
    // Sipariş kaydetme işlemleri
}

private void sendConfirmationEmail(Order order) {
    // Onay e-postası gönderme işlemleri
}
```

## 3. Yorumları Azaltın ve Kodla Anlatın
Kodun kendisi yeterince açıklayıcı olmalıdır. Gereksiz yorumlar yerine, kodun kendisini açıklayıcı hale getirin.

```java
// Kötü örnek
// Kullanıcı adı kontrol ediliyor
if (userName.length() > 0) {
    // Kullanıcı adı geçerli
}

// İyi örnek
if (isUserNameValid(userName)) {
    // Kullanıcı adı geçerli
}

private boolean isUserNameValid(String userName) {
    return userName.length() > 0;
}
```

## 4. Magic Number Kullanımından Kaçının
Magic number, kod içinde doğrudan kullanılan sabit sayılardır. Bu sayılar yerine anlamlı sabitler kullanın.

```java
// Kötü örnek
if (age > 18) {
    // Yetişkin
}

// İyi örnek
private static final int ADULT_AGE = 18;

if (age > ADULT_AGE) {
    // Yetişkin
}
```

## 5. Tek Sorumluluk Prensibini Uygulayın
Her sınıf ve fonksiyon, yalnızca tek bir sorumluluğa sahip olmalıdır. Bu prensip, kodun daha modüler ve test edilebilir olmasını sağlar.

```java
// Kötü örnek
public class User {
    private String name;
    private String email;

    public void save() {
        // Kullanıcıyı veritabanına kaydetme işlemleri
    }

    public void sendEmail() {
        // Kullanıcıya e-posta gönderme işlemleri
    }
}

// İyi örnek
public class User {
    private String name;
    private String email;

    // Kullanıcı ile ilgili işlemler
}

public class UserRepository {
    public void save(User user) {
        // Kullanıcıyı veritabanına kaydetme işlemleri
    }
}

public class EmailService {
    public void sendEmail(User user) {
        // Kullanıcıya e-posta gönderme işlemleri
    }
}
```

Clean code yazma sanatı, sürekli pratik ve dikkat gerektirir. Bu prensipleri uygulayarak, daha okunabilir, sürdürülebilir ve kaliteli Java kodları yazabilirsiniz.