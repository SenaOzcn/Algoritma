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

Çözümün Java ile kodlanmış haki aşağıdaki gibidir; 

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
