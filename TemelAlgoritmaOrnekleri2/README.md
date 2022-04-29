# Tam Bölünebilirlik

```
Girilen iki sayıdan ilkinin ikincisine tam bölünüp bölünmediğini bularak sonucu ekrana yazan algoritmayı tasarlayınız.
```

Problemin çözümü için iki girdi ve bir çıktı kullanacağız.

```
Girdiler : 
Sayı1
Sayı2
```

```
Çıktı : 
Kalan
```

Bir sayının diğerine bölümünden kalanı bulmak için **Modüler Aritmetik Operatörü(MOD)** kullanılır.Mod kullanmak için '%' kullanılır. Sonuç 0 ise tam bölünebilir demektir.

```
DISPLAY "Sayı1 = "
GET Sayı1
DISPLAY  "Sayı2 = "
GET Sayı2
mod = Sayı1 % Sayı2
IF mod = 0 THEN
DISPLAY "Sayı1 Sayı2'ye tam bölünür."
ELSE
DISPLAY "Sayı1 Sayı2'ye tam bölünemez."
ENDIF
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir; 

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/TamBolunebilme.png)

# İki Sayıyı Karşılaştırmak

```
Girilen iki sayıyı karşılaştırıp, büyüklük, küçüklük ve eşitlik durumlarını ekrana yazdıran algoritmayı tasarlayınız.
```
Problemin çözümü için iki adet girdi ve bir adet karşılaştırma çıktısı kullanacağız.

```
Girdi : 
Sayı1
Sayı2
```

```
Çıktı : 
Karşılaştırma
```

Sözde Kod :

```
DISPLAY "Sayı1 => "
GET Sayı1
DISPLAY "Sayı2 => "
GET Sayı2
IF (Sayı1 > Sayı2) THEN
DISPLAY "Sayı1, Sayı2'den büyüktür."
ELSE IF (Sayı1 < Sayı2) THEN
DISPLAY "Sayı1, Sayı2'den küçüktür."
ELSE
DISPLAY "Sayı1 ve Sayı2 eşittir.
ENDIF
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/Karsilastirma.png)

# Algoritma Öğreniyorum!

```
Ekrana 10 kere "Algoritma Öğreniyorum!" yazdıran algoritmayı tasarlayınız.
```

Problemin çözümü için kullanıcıdan bir girdi alınmayacaktır. Bu yüzden girdi olmayaca ama çıktı olarak ekrana 10 kere "Algoritma Öğreniyorum!" yazılacaktır.

```
Çıktı : 
Mesaj...
```

Sayaç yapılarında, üç temel faktör vardır : 

1. Sayacın başlangıç değeri
2. Sayacın hedef değeri, yani nereye kadar tekrar edeceği
3. Sayacın artış miktarı

```
Başlangıç değeri = 1
Hedef değeri = 10
Artış miktarı = 1
```

Sözde Kod :

```
FOR i = 1 TO 10
DISPLAY "Algoritma Öğreniyorum!"
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/AlgoritmaOgreniyorum.png)

# Sayıyı Tekrarlatarak Yazdırmak

```
Girilen bir sayıyı, değerinin iki katı kadar sayıda tekrar edecek şekilde ekrana yazdıran algoritmayı tasarlayınız.
```

Problemin çözümünde bir girdi ve bir çıktı kullanacağız.

```
Girdi : 
Sayı
```
```
Çıktı : 
2 * Sayı
```

Sözde Kod :
```
DISPLAY "Sayı => "
GET Sayı
FOR i = 1 TO 2 * Sayı
DISPLAY Sayı
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/SayiTekrari.png)

# Üçer Üçer Saydırmak

```
5'ten başlayıp 20'ye kadar 3'er 3'er artarak sayıları ekrana yazdıran algoritmayı tasarlayınız.
```

Kullanıcıdan herhangi bir değer alınmayacağı için sadece çıktı olarak ekrana sayıları yazdıracağız.

```
i = 5 TO 20 STEP 3
```

Sözde Kod :

```
FOR i = 5 TO 20 STEP 3
DISPLAY i
ENDFOR
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/UcerUcerSaydirma.png)

# Dörder Dörder Tersten Saydırmak

```
20'den başlayıp, 1'e kadar 4'er 4'er geriye doğru sayarak ekrana yazdıran algoritmayı tasarlayınız.
```

```
i = 20 TO 1 STEP -4
```

Sözde Kod :

```
FOR i = 20 TO 1 STEP -4
DISPLAY i
ENDFOR
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/DorderDorderTers.png)
