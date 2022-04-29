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

# Dairenin Çevresi ve Alanı

Bir dairenin çevrisini ve alanını hesaplamak için, o dairenin yarıçapını bilmek yeterlidir.

Formüller : 
```
Çevre = 2 * PI * Yarıçap
Alan = PI * Yarıçap
```
Sözde Kod :

```
DISPLAY "Yarıçap = "
GET Yarıçap
Cevre = 2 * PI *Yarıçap
Alan = PI * Yarıçap * Yarıçap
DISPLAY "Dairenin çevresi " + Cevre
DISPLAY "Dairenin alanı " + Alan
```

Çözümün Java ile kodlanmış hali;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/dairecevrealan.png)

# Koninin Hacmi

Koni şeklindeki bir cismin hacmini hesaplamak için aşağıdaki formül kullanılır.

```
Koni Hacmi = PI * r * r / h
```

```
Yarıçapı ve yüksekliği verilen bir koninin hacmini hesaplayarak sonucu ekrana yazdıran algoritmayı tasarlayınız.
```
Problemin çözümü için iki adet girdi ve bir adet çıktı kullanacağız.

```
Girdiler : 
Yarıçap
Yükseklik
```

```
Çıktı : 
Koninin Hacmi
```

Sözde Kod :

```
DISPLAY "Yarıçap(r) = "
GET r
DISPLAY "Yükseklik(h) = "
GET h
Hacim = PI * r * r / h
DISPLAY "Koninin Hacmi = " + Hacim
```

Çözümün Java ile kodlanmış hali;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/KoninHacmi.png)

# Uzunluğu İnçten Santimetreye Dönüştürmek

```
İnç cinsinden verilen bir uzunluğun santimetre cinsinden karşılığını bularak ekrana yazdıran algoritmayı tasarlayınız.
```
1 inç = 2.54 cm olduğuna göre fomülümüz : 
cm uzunluk = inç uzunluk * 2.54

Problemin çözümü için bir adet girdi ve bir adet çıktı kullanacağız.

```
Girdi : 
Uzunluk_Inc
```

```
Çıktı : 
Uzunluk_Cm
```

Sözde Kod : 

```
DISPLAY "Uzunluk (inç) = "
GET iUzunluk
cmUzunluk = iUzunluk * 2.54
DISPLAY "Uzunluk (CM) = " + cmUzunluk
```
Çözümün Java ile kodlanmış hali;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/Inctencmye.png)

# Sıcaklığı Fahrenhayttan Santigrada Dönüştürmek

```
Fahrenhayt olarak verilmiş bir sıcaklık değerini Santigrad'a dönüştürerek ekrana yazdıran algoritmayı tasarlayın.
```

Problemin çözümü için bir adet girdi ve bir adet çıktı kullanacağız.

```
Girdi :
F_Sıcaklık
```

```
Çıktı : 
S_Sıcaklık
```

Formül ise ;

```
C = (F - 32) / 1.8
```

Sözde Kod : 

```
DISPLAY F_Sıcaklık
GET F_Sıcaklık
S_Sıcaklık = (F_Sıcaklık - 32) / 1.8
DISPLAY "Sıcaklık (C) = " + S_Sıcaklık
```
Çözümün Java ile kodlanmış hali;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/FSicaklikSSicaklik.png)

# Mol Sayısı Hesaplamak

```
Klavyeden kütlesi ve molekül ağırlığı girilen maddenin mol sayısını hesaplayarak ekrana yazdıran algoritmayı tasarlayın.
```

Kütlesi verilen bir molekülün mol sayısı fomülü;

```
Mol = Kütle / Molekül Ağırlığı
```

Problemin çözümü için iki adet girdi ve bir adet çıktı kullanacağız.

```
Girdiler : 
Kütle
Molekül Ağırlığı
```

```
Çıktı : 
Mol
```

Sözde Kod : 

```
DISPLAY "Kütle = "
GET Kütle
DISPLAY "Molekül Ağırlığı = "
GET Molekül Ağırlığı
Mol = Kütle / Molekül Ağırlığı
DISPLAY "Mol Sayısı = " + Mol
```

Çözümün Java ile kodlanmış hali;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/Mol.png)

# Birinci Dereceden Denklem Çözmek

Denklem çözmek formül işlemekten biraz farklıdır. Ancak söz konusu birinci dereceden denklemler olunca, denklemin çözümünü formüle dönüştürmek mümkündür.

```
Katsayıları verilen birinci dereceden bir denklemin köklerini hesaplayarak ekrana yazdıran algoritmayı tasarlayınız.
```
ax + b = 0
X = -b / a

Problemin çözümü için iki adet girdi ve bir adet çıktı kullanacağız.

```
Girdiler : 
a
b
```

```
Çıktı : 
X
```

Sözde Kod : 

```
DISPLAY "X'in katsayısı = "
GET a
DISPLAY "b sayısı = "
GET b
X = -b / a
DISPLAY " X = " + X
```

Çözümün Java ile kodlanmış hali;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri/Images/BirinciDeredenDenklem.png)
