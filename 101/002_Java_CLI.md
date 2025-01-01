# Java CLI (Command Line Interface)

Java CLI, Java programlarını komut satırından derlemek ve çalıştırmak için kullanılan araçları içerir. Bu araçlar, Java Development Kit (JDK) ile birlikte gelir ve genellikle `javac` ve `java` komutlarıyla kullanılır.

## `javac` Komutu

`javac` komutu, Java kaynak dosyalarını (`.java` dosyaları) bayt kodu dosyalarına (`.class` dosyaları) derlemek için kullanılır.

### Kullanım

```sh
javac DosyaAdi.java
```

### Örnek

```sh
javac HelloWorld.java
```

Bu komut, `HelloWorld.java` dosyasını derleyerek `HelloWorld.class` dosyasını oluşturur.

## `java` Komutu

`java` komutu, derlenmiş Java bayt kodu dosyalarını çalıştırmak için kullanılır.

### Kullanım

```sh
java SinifAdi
```

### Örnek

```sh
java HelloWorld
```

Bu komut, `HelloWorld.class` dosyasını çalıştırır ve programın çıktısını komut satırında gösterir.

## Çevre Değişkenleri

Java CLI araçlarını kullanabilmek için JDK'nın kurulu olduğu dizinin `PATH` çevre değişkenine eklenmesi gerekir.

### Windows İçin

1. Denetim Masası'ndan "Sistem ve Güvenlik" > "Sistem" > "Gelişmiş sistem ayarları"na gidin.
2. "Ortam Değişkenleri"ni tıklayın.
3. "Sistem değişkenleri" bölümünde `Path` değişkenini bulun ve düzenleyin.
4. JDK'nın `bin` dizinini (`C:\Program Files\Java\jdk-XX\bin`) ekleyin.

### macOS/Linux İçin

`~/.bash_profile` veya `~/.zshrc` dosyasına aşağıdaki satırı ekleyin:

```sh
export PATH=/path/to/jdk/bin:$PATH
```

Değişiklikleri uygulamak için terminalde aşağıdaki komutu çalıştırın:

```sh
source ~/.bash_profile
```

## Sonuç

Java CLI araçları, Java programlarını derlemek ve çalıştırmak için temel araçlardır. `javac` komutu kaynak kodunu derlerken, `java` komutu derlenmiş kodu çalıştırır. Bu araçları kullanabilmek için JDK'nın `PATH` değişkenine eklenmesi gerekmektedir.