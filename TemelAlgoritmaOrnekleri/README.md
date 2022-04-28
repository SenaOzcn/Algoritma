# İki Sayıyı Toplamak

Kullanıcıdan iki sayıyı alıp toplayan programı sözde kod ile yazdıralım;

```
DISPLAY "Birinci sayıyı giriniz : "
GET Sayı1
DISPLAY "İkici sayıyı giriniz : "
GET Sayı2
Toplam = Sayı1 + Sayı2
DISPLAY "Girdiğiniz sayıların toplamı : " + Toplam
```
Kodu programa dönüştürelim.

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Algoritmalar%C4%B1Kodlamak/Images/Algoritma_KullaniciDegerToplami.java%20at%20MIT-License%20%C2%B7%20SenaOzcn_Algoritma%20-%20Brave%2028.04.2022%2020_34_59.png)

# İki Sayıyı Bölmek
```
Ekrana girilen iki sayıyı bölerek sonucu ekrana yazdıran algoritmayı tasarlayınız.
```

Algoritmamızı çözmeye, girdi ve çıktıları belirleyerek başlayalım. Bu çözümde de yine kullanıcıdan iki sayı alınarak işleme sokulduğuna göre iki girdimiz olacaktır.

```
Girdiler :
Sayı1
Sayı2
```

Problemin sonundaysa bölüm değerini ekrana yazdıracağımıza göre, bir çıktı olacaktır.

```
Çıktı
```

Algoritmayı tamamlayalım.

```
1. Başla
2. Yaz "Birinci sayıyı giriniz : "
3. Oku Sayı1
4. Yaz "İkinci sayıyı giriniz : "
5. Oku Sayı2
6. Bolum = Sayı1 / Sayı2
7. Yaz Bolum
8. Dur
```

Sözde kod;

```
DISPLAY "Birinci sayıyı giriniz : "
GET Sayı1
DISPLAY "İkinci sayıyı giriniz : "
GET Sayı2
Bolum = Sayı1 / Sayı2
DISPLAY "Bölüm sonucu = " + Bolum
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/Algoritma_TemelAlgoritmaOrnekleri_Images%20at%20MIT-License%20%C2%B7%20SenaOzcn_Algoritma%20-%20Brave%2028.04.2022%2022_02_11.png)

# Dikdörtgenin Çevresi ve Alanı

Yüksekliğin ve taban uzunluğunun toplamının iki katı, dikdörtgenin çevresini verir.

Taban uzunluğunun yükseklikle çarpımıysa dikdörtgenin alanını verecektir.

```
A ve B kenarları verilen bir dikdörtgenin çevresini ve alanını hesaplayarak ekrana yazdıran algoritmayı tasarlayınız.
```
Bu problemin çözümü için 2 adet girdi ve 2 adet çıktıya ihtiyacımız var.

```
Girdiler : 
A Kenarı
B Kenarı
```

```
Çıktılar : 
Dikdörtgenin Çevresi
Dikdörtgenin Alanı
```

```
Problemi çözerken kullanacağımız formüller : 
Alan = A * B
Cevre = 2 * (A + B)
```

Sözde Kod : 

```
DISPLAY "A kenarının uzunluğu = "
GET A
DISPLAY "B kenarının uzunluğu = "
GET B
Cevre = A * B
Alan = 2 * (A + B)
DISPLAY "Girmiş olduğunu dikdörtgenin çevresi = " + Cevre
DISPLAY "Girmiş olduğunuz dikdörtgenin alanı = " + Alan
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir:

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/dikdortgen.png)

# Üçgenin Alanı

Üçgenin alanı, bir kenarın uzunluğu ve bu kenara ait yüksekliğin çarpımıyla bulunur.

```
Tabanı ve yüksekliği verilen bir üçgenin alanını hesaplayarak ekrana yazdıran algoritmayı tasarlayınız.
```
Bu problemi çözerken,

- Kullanicidan değerleri al(Değer al)
- Aldığın değerlerle formülü işler(Hesapla)
- Sonucu ekrana yazdır(Sonuç göster)

adımlarını takip edeceğiz.

```
Çözümün girdileri : 
Taban uzunluğu
Yükseklik
```

```
Çıktı :
Alan
```

Sözde Kod : 

```
DISPLAY "Taban uzunluğunu = "
GET Taban uzunluğu
DISPLAY "Yükseklik = "
GET Yükseklik
alan = Taban uzunluğu * Yükseklik
DISPLAY "Girmiş olduğunuz üçgenin alanı = " + alan
```

Çözümün Java ile kodlanmış hali;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/ucgeninAlani.png)
