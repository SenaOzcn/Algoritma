# Metinler

Metin dediğimiz şey, bir **dizi** karakterden oluşur.
```
String "Algoritma"
Char ARRAY() ("A", "l", "g", "o", "r", "i", "t", "m", "a")
```
Bir metin değişkenindeki değerin kaç karakter olduğunu bulmak, bir metin içinden belirli bir endeksten başlayarak belirli sayıda karakter alabilmek, bir metnin tüm karakterlerini küçük ya da büyük harflere dönüştürmek gibi işlemler yapılabilmektedir.
```
Klavyeden girilen bir metnin karakterini büyük harfe çevirerek ekrana yazdıran algoritmayı tasarlayın.
```
Çözüm için kullanıcıdan bir metin almalı, metnin içindeki her bir karakteri büyük harfe dönüştürmeli ve sonucu ekrana yazmalıyız.
```
1. Başla
2. Matin = "", YeniMetin = ""
3. Al Metin
4. YeniMetin = BuyukHarf(Metin)
5. Yaz YeniMetin
6. Dur
```

Sözde Kod :
```
Metin = ""
YeniMetin = ""
DISPLAY "Metin girin : "
GET Metin
YeniMetin = UPPER(Metin)
DISPLAY YeniMetin
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Metinler/Images/BuyukHarfeDonusturme.png)

```
Klavyeden girilen bir metnin üçüncü karakterinden başlayarak 5 karakteri ekrana yazdıran algoritmayı tasarlayın.
```
Metin içinden alt metin çıkartma işlemi olduğunu net bir şekilde tespit edelim. Bir metnin içinden alt metin çıkartırken ihtiyacımız olan üç şey vardır:
1. Ana metin
2. Başlangıç karakteri (endeks)
3. Kaç karakter alınacağı (uzunluk)

Sözde Kod :
```
Metin = ""
YeniMetin = ""
DISPLAY "Metin girin : "
GET Metin
YeniMetin = SUBSTRING(Metin,3,5)
DISPLAY YeniMetin
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;
 
 ![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Metinler/Images/KarakterUcBes.png)
```
Klavyeden girilen bir metnin üçüncü karakterinden başlayarak 5 karakteri ekrana yazdıran algoritmayı tasarlayın. Eğer karakter sayısı 8'den azsa, kullanıcıya "Girilen metnin uzunluğu en az 8 karakter olmalıdır" mesajı verilsin.
```
Çözümün aşamaları aşağıdaki gibi olacaktır;

- Kullanıcıdan metin al
- Metnin karakter sayısını bul
- Karakter sayısı 8 ve daha fazlaysa işlemi yap
- Karakter sayısı 8'den küçükse mesaj ver.

Sözde Kod :
```
Metin = "", YeniMetin = ""
DISPLAY "Metin Girin : "
GET Metin
IF LEN(Metin) >= 8 THEN
   YeniMetin = SUBSTRING(3,5)
ELSE
   DISPLAY "Girilen metnin uzunluğu en az 8 karakter olmalıdır!"
ENDIF
DISPLAY YeniMetin
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;
 
![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Metinler/Images/KosulluKarakter.png)

```
Klavyeden girilen bir metnin karakterlerini alt alta ekrana yazdıran algoritmayı tasarlayın.
```
Sözde Kod :
```
Metin = ""
DISPLAY "Metin girin : "
GET Metin
FOR i = 0 TO LEN(Metin)
   DISPLAY SUBSTRING(Metin, i, 1)
ENDFOR
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;
 
![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Metinler/Images/AltAltaYazdirma.png)

```
Klavyeden girilen bir metni aşağıdaki örnekteki gibi ekrana yazdıran algoritmayı tasarlayın.
Örnek kelime : Algoritma
A
Al
Alg
Algo
Algor
Algori
Algorit
Algoritm
Algoritma
```
Yapılan işlem yine bir metiden alt metin çıkartma olduğu için, yine AltMetin fonksiyonunu kullanıyoruz.
```
A             AltMetin(Metin,0,1)
Al            AltMetin(Metin,0,2)
Alg           AltMetin(Metin,0,3)
Algo          AltMetin(Metin,0,4)
Algor         AltMetin(Metin,0,5)
Algori        AltMetin(Metin,0,6)
Algorit       AltMetin(Metin,0,7)
Algoritm      AltMetin(Metin,0,8)
Algoritma     AltMetin(Metin,0,9)
```
Sözde Kod :
```
Metin = ""
DISPLAY "Metin girin : "
GET Metin
FOR i = 1 TO LEN(Metin)
   DISPLAY SUBSTRING(Metin,0,i)
ENDFOR
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;
 
![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Metinler/Images/ArtarakAltAltaYazdirma.png)

Tersten okunuşu, normal okunuşuyla aynı olan kelime, cümle ya da sayılara **polindrom** denir.
```
Klavyeden girilen bir metnin palindrom olup olmadığını ekrana yazdıran algoritmayı tasarlayın.
```
Çözümü algoritmaya dökelim:
- Kullanıcıdan metin alma
- Metni terse çevirerek yeni bir metin oluşturma
- İki metin aynıysa *"polindrom"* yaz.
- İki metin aynı değilse *"polindron değil"* yaz.

Sözde Kod :
```
Metin = ""
TersMetin = ""
DISPLAY "Metin girin : "
GET Metin
FOR i = LEN(Metin) TO 0 STEP -1
   TersMetin= TersMetin + SUBSTRING(Metin,i,i+1)
ENDFOR
IF Metin = TersMetin
   DISPLAY "POLINDROM !"
ELSE
   DISPLAY "Polindrom değil."
ENDIF
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;
 
![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Metinler/Images/Polindrom.png)
