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
