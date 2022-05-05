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
