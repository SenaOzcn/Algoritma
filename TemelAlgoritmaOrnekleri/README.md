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

Ekrana girilen iki sayıyı bölerek sonucu ekrana yazdıran algoritmayı tasarlayınız.

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
