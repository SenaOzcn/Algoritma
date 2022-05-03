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

Sayaç : 

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

# Sayıların Küplerini Yazdırmak

```
1'den 10'a kadar olan sayıların küplerini ekrana yazdıran algoritmayı tasarlayınız.
```

Bu algoritmada yine kullanıcıdan girdi almadığımız için bir çözüm tasarlıyoruz.

Sayının küpünü aşağıdaki gibi hesaplayabiliriz : 

```
Sayının küpü = sayı * sayı * sayı
```

Sözde Kod : 

```
FOR i = 1 TO 10
DISPLAY i * i * i
ENDFOR
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/KupAlma.png)

# Tek/Çift Sayılar

```
1'den 10'a kadar olan sayıları, yanlarına tek/çift yazdırılarak ekranda gösteren algoritmayı tasarlayınız.
```

Sayaç : 
```
i = 1 TO 10
```

Şimdi tek mi çift mi olduğunu bulalım. Bunun için MOD2'yi kullanacağız. Kalan 0 ise çift, değilse tek sayıdır.

```
i MOD2 = 0
```
Bir sayı ya tektir, ya da ç,fttir. Yani iki altertaif mevcuttur. İki alternatifli karar yapısını kullanacağız.

Sözde Kod : 

```
FOR i = 1 TO 10
IF i %2 == 0
DISPLAY i + " Çift"
ELSE
DISPLAY i + " Tek"
ENDIF
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/TekCift.png)

# En Büyük Sayı

```
Klavyeden girilen 5 tane sayının en büyüğünü bularak ekrana yazdıran algoritmayı tasarlayınız.
```

5 sayı sayı girdisi ve içlerinden en büyüğü çıktı olarak kullanılacaktır.

```
Girdi : 
5 tane sayı
```
```
Çıktı :
Girilen sayılardan en büyüğü
```
ilk olarak 1'den 5'e kadar sayan sayacı yapalım.

Sayaç : 
```
i = 1 TO 5
...
Sayac Sonu
```

Şimdi de bu sayaç içine kullanıcıdan sayıları alacak olan kodu yerleştirelim.

```
i = 1 TO 5
DISPLAY i + ". sayı : "
GET Sayı
...
Sayaç Sonu
```

Sözde Kod :

```
EnBuyuk = 0
FOR i = 1 TO 5
DISPLAY i + ". sayı = "
GET Sayı
IF Sayı > EnBuyuk THEN
EnBuyuk = Sayı
ENDIF
ENDFOR
DISPLAY "En büyük sayı = " + EnBuyuk
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/EnBuyukSayi.png)

# Ortalama Bulmak

```
Klavyeden girilecek X adet sayının aritmetik ortalamasını bularak ekrana yazdıran algoritmayı tasarlayınız. (X sayısı kullanıcıdan alınacaktır.)
```
Problemi çözerken iki adet girdi ve bir adet çıktı kullanılacaktır.

```
Girdi :
Sayı adeti
Kullanıcıdan alınacak sayılar
```
```
Çıktı :
Ortalama
```
Formül : 

```
Ortalama = sayı1 + sayı2 + ... / sayı adeti
```

Sayaç : 

```
i = 1 TO Adet
...
Sayaç Sonu
```

Sözde Kod : 

```
DISPLAY" Ortalaması alınacak sayı adetini girin : "
GET Sayı adeti
FOR i = 1 TO Sayı adeti
DISPLAY i + ". sayı = "
GET Sayı
Toplam += Sayı
ENDFOR
DISPLAY"Ortalama = " + (Toplam / Sayı adeti)
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/Ortanca_Sayi.png)

# Faktöriyel Hesabı

 ```
 Girilen bir sayının faktöriyelini hesaplayarak ekrana yazdıran algoritmayı tasarlayınız.
 ```
 
 Problemin çözümü için kullanıcıdan bir sayı alıp, bu sayıdan bire kadar geriye doğru sayıyoruz. Bu sayma işleminin her bir adımında, sayaç değerini bir önceki sayaç değeriyle çarpıyoruz. Böylece girilen sayıdan 1'e kadar tüm sayaç değerlerini birbiriyle çarpmış oluruz.
 
 Burada dikkat etmemiz gereken şeylerden biri, çarpma işleminin sonucunu tutacak değişkenin başlangıç değeri 0 değil 1 olması gerektiğidir.
 
 Dikkat etmemiz gereken bir diğer şey de, sayacın girilen sayıdan 1'e doğru birer birer eksilterek saydırılması gerekliliğidir.
 
 Sözde Kod : 
 
 ```
 Faktoriyel = 1
 DISPLAY "Sayı = "
 GET Sayı
 FOR i = Sayı TO 1 STEP -1
 Faktoriyel = Faktoriyel * i
 ENDFOR
 DISPLAY Sayı + "! = " + Faktoriyel
 ```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/Faktoriyel.png)

# Fibonaççi Sayı Dizisi

Fibonaççi sayı dizisi 0, 1, 1, 2, 3, 5, 8, 13, 21, 24, 34, 55, 89, ... dizilişindeki sayılaran oluşan bir dizidir. Dizideki ilk sayı (0, 1) sabittir. Sonra gelen sayılar önceki iki sayının toplamıdır.

```
Fibonaççi dizisinin ilk 10 sayısını hesaplayarak ekrana yazdıran algoritmayı tasarlayınız.
```

Dizinin ilk iki sayısı, elimizde olarak işe başlıyoruz. Sonrasında sayaç devreye giriyor. İlk iki sayıyı zaten baştan aldığımız için, 10 sayıdan oluşan diziyi oluşturmak için sayacın 8 kez sayması yeterli olacaktır.

```
Sayaç (i = 3 TO 10)
...
Sayaç Sonu
```

Başlangıç da dahil tekrarlı işlemin her bir adımında elimizde fibonaççi dizisinin önceki iki sayısı olacaktır.Bizim yapmamız gereken önceki iki sayıyı toplayıp dizinin yeni elemanını bulmak.

```
Sayı3 = Sayı2 + Sayı1
```

Sözde Kod : 

```
YeniSayı = 0
DISPLAY Sayı1
GET Sayı1
DISPLAY Sayı2
GET Sayı2
FOR i = 3 TO 10
YeniSayı = Sayı1 + Sayı2
DISPLAY YeniSayı
Sayı1 = Sayı2
YeniSayı = Sayı2
ENDFOR
```

Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/TemelAlgoritmaOrnekleri2/Images/fibonacci.png)
