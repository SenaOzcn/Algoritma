# Alıştırmalar

### 1) Kullanıcıdan iki sayı alıp, bu iki sayının toplamını ve çarpımını ekrana yazdıran algoritmayı tasarlayınız.

Problemin çözümü için iki adet girdi ve iki adet çıktı kullacağız.

```
Girdi : 
Sayı1
Sayı2
```

```
Çıktı : 
Toplamları
Çarpımları
```
Sözde Kod : 

```
DISPLAY "Sayı1 => "
GET Sayı1
DISPLAY "Sayı2 => "
GET Sayı2
Toplam = Sayı1 + Sayı2
Çarpım = Sayı1 * Sayı2
DISPLAY "Toplamları = " + Toplam
DISPLAY "Çarpımları = " + Çarpım
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/Toplam%26Carpim.png)

### 2) Kullanıcıdan bir kenarı alınan karenin alanını hesaplayarak ekrana yazdıran algoritmayı tasarlayınız.

Karelerin kenar uzunluğuna a dendiği zaman tüm kenarları eşit olduğu için bütün kenarlar a olacaktır.

```
Karenin alanı = a * a = a ^ 2
```
Problemin çözümü için bir adet girdi ve ve bir adet çıktı kullanılacaktır.

```
Girdi : 
a (Karenin bir kenarının uzunluğu)
```

```
Çıktı : 
Alan
```

Sözde Kod :
```
DISPLAY "a => "
GET a
DISPLAY "Alan = " a ^ 2
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/KareAlan.png)

### 3) Kullanıcıdan yaşını alıp, girilen değer 65'e eşitse ya da 65'ten büyükse ekrana "Emekli olabilirsiniz.", girilen değer 65'ten küçükse "Emekliliğinize x yıl var." yazan algoritmayı tasarlayın.

Problemin çözümü için bir adet girdi ve bir adet çıktı kullanılacaktır.

```
Girdi : 
Yaş
```
```
Çıktı :
Emeklilik durumu
```

Sözde Kod : 

```
DISPLAY "Yaşınızı Girin = "
GET yas
IF (yas >= 65)
DISPLAY "Emekli olabilirsiniz."
ELSE
DISPLAY "Emekliliğinize " + (65 - yas) + " yıl var."
ENDIF
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/Emeklilik.png)

### 4) Kullanıcıdan bir sayı alıp, aldığı bu sayıdan 1'e kadar tersten sayarak ekrana yazdıran algoritmayı tasarlayınız.

Problemin çözmek için bir adet girdi ve bir adet çıktı kullanılacaktır.

```
Girdi : 
Sayı
```

```
Çıktı :
Sayı TO 1
```

Sözde Kod :

```
DISPLAY "Sayı => "
GET sayı
FOR (i = sayi TO 1)
DISPLAY i
ENDFOR
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/BireKadarYazdirma.png)

### 5) Kullanıcıdan bir sayı alarak, aldığı sayının 6 ile tam olarak bölünüp bölünmediğini ekrana yazdıran algoritmayı tasarlayın.

Problemin çözmek için bir adet girdi ve bir adet çıktı kullanılacaktır.

```
Girdi : 
Sayı
```

```
Çıktı :
MOD 6
```

Sözde Kod :

```
DISPLAY "Sayı => "
GET sayı
mod = sayı %6
IF (mod == 0)
DISPLAY sayı + " 6'ya tam olarak bölünebilir."
ELSE
DISPLAY sayı + " 6'ya bölümünden kalan " + mod + "dır."
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/AltiyaTamBolunebilme.png)

### 6) Kullanıcıdan 5 adet sayı alarak, bu sayıların çarpımını ekrana yazdıran algoritmayı tasarlayın.

Problemin çözümü için 5 adet girdi ve 1 adet çıktı kullanılacaktır.

```
Girdi :
Sayı1
Sayı2
Sayı3
Sayı4
Sayı5
Sayı6
```
```
Çıktı :
Çarpım
```
Sözde Kod :

```
DISPLAY "Sayı1 => "
GET sayi1
DISPLAY "Sayı2 => "
GET sayi2
DISPLAY "Sayı3 => "
GET sayi3
DISPLAY "Sayı4 => "
GET sayi4
DISPLAY "Sayı5 => "
GET sayi5
carpim = sayi1 * sayi2 * sayi3 * sayi4 * sayi5
DISPLAY "Girmiş olduğunuz sayıların çarpımı = " + carpim
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/BesSayiCapimi.png)

### 7) Ekrana girilen iki sayının farkını(pozitif, yani mutlak değer olarak) ekrana yazdıran algoritmayı tasarlayınız.

Problemin çözümü için iki adet girdi ve bir adet çıktı kullanılacaktır.

```
Girdi :
Sayı1
Sayı2
```

```
Çıktı :
Sonuç
```

Sözde Kod :

```
DISPLAY "Sayı1 => "
GET sayi1
DISPLAY "Sayı2 => "
GET sayi2
sonuc = sayi1 - sayi2
DISPLAY "Sonuç = " + |sonuc|
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/MutlakDeger.png)

### 8) Yarıçapı verilen kürenin hacmini hesaplayarak ekrana yazdıran algoritmayı tasarlayınız.

Problemin çözümü için bir adet girdi ve bir adet çıktı kullanılacaktır.

```
Girdi :
Yarıçap (r)
```
```
Çıktı :
Hacim (v)
```
Kürenin hacim formülü;

```
Kürenin Hacmi (v) = π * r ^ 3 * (4 / 3)
```

Sözde Kod :

```
DISPLAY "Yarıçapı giriniz : "
GET r
hacim (v) = π * r ^ 3 * (4 / 3)
DISPLAY "Yarıçapı " + r + " olan bir kürenin hacmi " + v + " olarak hesaplanır."
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/KureninHacmi.png)

### 9) Deniz mili cinsinden verilen bir mesafenin kilometre cinsinden karşılığını bularak ekrana yazdıran algoritmayı tasarlayınız.

Problemin çözümü için bir adet girdi ve bir adet çıktı kullanılacaktır.

```
Girdi :
mesafeMil
```
```
Çıktı :
mesafeKm
```

Sözde Kod :
```
DISPLAY "Deniz mili cinsinden mesafesiyi giriniz : "
GET mesafeMil
mesafeKm = mesafeMil * 1.852
DISPLAY "Deniz mili cinsinden verilen" + mesafeMil + " mesafenin kilometre cinsinden karşılığı : " + mesafeKm
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/Mil%26Km.png)

### 10) Kelvin olarak verilmiş bir sıcaklık değerini santigrada dönüştürerek ekrana yazdıran algoritmayı tasarlayın.

Formül :
```
C = K - 273.15
```

Problemin çözümü için bir girdi ve bir çıktı kullanılacaktır.

```
Girdi :
Kelvin (k)
```
```
Santigrat (c)
```
Sözde Kod :
```
DISPLAY "Kelvin (k) cinsinden sıcaklığı giriniz : "
GET k
c = k - 273.15
DISPLAY "Girmiş olduğunuz " + k + " kelvin sıcaklık değerinin santigrat değeri = " + c
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri3/Images/KelvinSantigrat.png)
