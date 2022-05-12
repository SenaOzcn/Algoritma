# Diziler

Bazen, bir problemin çözümünde çok fazla sayıda değerle ve değişkenle çalışmamız gerekebilir. Örneğin; bir sınıftaki öğrencilerin listesi üzerinden, kura ile üç öğrenciyi belirleyecek bir uygulama geliştirmemiz gereksin. Bu durumda tanımlayacağımız değişken sayısı en azından sınıftaki öğrenci sayısı kadar olacaktır. Sınıfta 30 öğrenci olduğunu varsayarsak, 30 tane değişken tanımlamamız gerekebilir.

```
öğrenci 1
öğrenci 2
...
öğrenci 29
öğrenci 30
```

Bellekte birbiri peşi sıra dizilen(sıralanan) özel değişken tipi kullanılır. Bu değişken tipi, **dizi**'dir.

Dizi, aynı verş tipinden bir dizi değişkenin, tek bir ad ile temsil edilmesiyle oluşmuş bir değişkendir. Böylece bu değişken içinde birçok eleman olan bir listeyi temsil edecektir. Dizi içindeki her bir elemana, dizi içindeki sırasını ifade eden endeks *(index)* ile ulaşılır.

Öğrenci adında bir dizi tanımladığımızda, bu dizinin ilk elemanına Ogrenci(0), ikinci elemanına Ogrenci(1) ifadeleriyle ulaşabiliriz. Dizilerde ilk eleman index değeri 0 ile başlar.
```
Ogrenci 1 = Ogrenci(0)
Ogrenci 2 = Ogrenci(1)
...
Ogrenci 30 = Ogrenci(29)
```
Bundan sonra yapılacak işlem dizi elemanlarına değerler atamak, gerektiğinde de bu değerleri okumaktır.
```
Ogrenci(0) = 3535
Ogrenci(1) = 3536
...
DISPLAY Ogrenci(0)
DISPLAY Ogrenci(1)
```
Bir dizinin tüm elemanları aynı veri tipinde olur.

Diziler tek boyutlu olmanın dışında, iki boyutlu matrisler ve çok boyutlu yapılar olarak da kullanılabilirler.

## Tek Boyutlu Diziler

Liste şeklinde belirli sayıda aynı veri tipinde eleman barındıran dizilere tek boyutlu diziler denir. 
```
Kullanıcıdan 1-12 arasında bir değer alarak, aldığı değerlerin karşılığı olan ay adını ekrana yazdıran algoritmayı tasarlayın.
```
12 elemanlı ve tek boyutlu bir dizi tanımlayarak bu problemi çözebiliriz.

Şimdi girdimizi, listemizi ve çıktımızı tanımlayalım.
```
AyNo
Aylar Dizi(12)
AyAdi
```
Şimdi dizi içindeki her bir elemanın değerini atayalım.
```
Aylar(0) = "Ocak"
Aylar(1) = "Şubat"
Aylar(2) = "Mart"
...
Aylar(10) = "Kasım"
Aylar(11) = "Aralık"
```
Bir dizinin elemanlarına değer atamanın pratik bir yolu da asağıdaki gibidir;
```
Aylar Dizi(12) = "Ocak", "Şubat", "Mart",..., "Kasım", "Aralık"
```
Sözde Kod :
```
Aylar ARRAY(12) = "Ocak" , "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"
DISPLAY "Ay no : "
GET AyNo
AyAdi = Aylar(AyNo - 1)
DISPLAY AyAdi
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Images/Aylar.png)

```
Kullanıcıdan 10 adet sayı alıp, aldığı sayıları sırasıyla ekrana yazdıran algoritmayı tasarlayın.
```
Yapmamız gereken, her adımda alınan değeri(sayıyı) ayrı bir değişkene, yani dizi içindeki ayrı bir elemana atamak. Böylece sayaç işleminin sonunda, kullanıcının girdiği bütün sayılar elimizde olacaktır. Bunu sağlamak için 0 no'lu indexten başlayan ve indexi sayacın her dımında bir arttırarak dizinin sırasıyla her bir elemanına girilen değeri yükleyeceğiz.
```
Sayac (x = 0 TO 9 STEP 1)
DISPLAY Sayi
Sayilar(x) = Sayi
SayacSonu
```
Sözde Kod :
```
Sayilar ARRAY(10)
Sayi = 0
DISPLAY "10 adet sayı girin : "
FOR x = 0 TO 9
GET Sayi
Sayilar(x) = Sayi
ENDFOR
DISPLAY
DISPLAY "Girdiğiniz Sayılar "
FOR x = 0 TO 9
DISPLAY Sayilar(x)
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Images/Sayilar.png)

## Çift Boyutlu Diziler

Tek boyutlu diziler, listelerle çözülmesi gereken problemlerde kullanılırken, satır ve sütunlardan oluşan matris yapılarıyla çözülmesi gereken problemler için iki boyutlu diziler kullanılır.

Matriste, bir elemana ulaşmak için, tek boyutlu dizilerden farklı olaraki iki tane endeks *(index)* kullanılır.

![matrix](https://he-s3.s3.amazonaws.com/media/uploads/873c255.png)

Bu endekslerden birincisi matrisin satırını belirlerke, ikincisi de sütununu belirler. Bu iki endeksin kesişim noktası, matrisin ilgili elemanını verecektir.

Matrislerde de tek boyutlu dizilerde olduğu gibi satır ve sütun endeksleri sıfırdan(0) başlar. Örneğin yukarıdaki matriste 8 değerini taşıyan eleman için satır indexi 1 ve sütun indexi 2 olur. Matris(1,2) ifadesiyle erişilir.

İki boyutlu bir dizi tanımlanırken, önce satır eleman sayısı sonra sütun eleman sayısı belirtilir.
```
Dizi(4,6)
```
İfadesi 4 satır 6 sütundan oluşan bir matrisi tanımlar.

Bir matrisle çalışırken, tek boyutlu dizilerde olduğu gibi sayaç yapıları kullanılır. Ancak matrislerde iki boyut olduğundan, matrislerle çalışırken iç içe iki sayaç kullanılır.
```
Sayac (Satir = 0 TO 3 STEP 1)
   Sayac (Sutun = 0 TO 5 STEP 1)
   SayacSonu
SayacSonu
```
Yukardaki iç içe ikili sayaç yapısı, 24 adım işleterek, matrisin her bir elemanıyla çalışmamızı sağlar.
### Harfler(3,4)

| Endeks | 0 | 1 | 2 | 3 |
| --- | --- | --- | --- | --- |
| 0 | A | J | H | P |
| 1 | Ü | C | D | S |
| 2 | K | İ | L | T |

```
Sayac (Satir = 0 TO 2 STEP 1)
   Sayac (Sutun = 0 TO 3 STEP 1)
   DISPLAY Harfler(Satir, Sutun)
   SayacSonu
SayacSonu
```
Şimdi örnek problem çözerek beceri elde edelim.
```
2x3'lük sıfır matrisi oluşturan ve matrisi ekrana yazdıran algoritmayı tasarlayın.
```
**Sıfır matrisi** tüm elemanları sıfırdan oluşan matrislere denir.

2x3'lük matris ise, 2 satır ve 3 sütundan oluşan matrisdir.
```
SifirMatrisi(2,3)
```
Sıfır matrisi elde etmek için, matrisn tüm satır va sütunlarına teker teker 0 değerini atamamız gerekir. Bunun için *iç içe ikili sayaç yapısı* kullanılacaktır.
```
Sayac (Satir = 0 TO 1 STEP 1)
   Sayac (Sutun = 0 TO 2 STEP 1)
      SifirMatrisi(Satir,Sutun) = 0
   SayacSonu
SayacSonu
```

Sözde Kod :
```
SifirMatrisi(2,3)
Satir = 0, Sutun = 0
FOR Satir = 0 TO 1
   FOR Sutun = 0 TO 2
      SifirMatrisi(Satir,Sutun) = 0
   ENDFOR
ENDFOR
FOR Satir = 0 TO 1
   FOR Sutun = 0 TO 2
      DISPLAY SifirMatrisi(Satir,Sutun)
   ENDFOR
   DISPLAY (NEWLINE)
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Images/SifirMatris.png)

```
2x3'lük iki matrisi toplayan ve sonucu ekrana yazdıran algoritmayı tasarlayın.
(BirinciMatris((2,3,4),(5,4,3)), IkinciMatris((6,2,7),(2,9,8)))
```
Problemin çözümü için ilk olarak girdilere bakalım.

Elimizde iki adet 2x3 boyutlarında matris var. Bu matrisleri tanımlayalım.
```
BirinciMatris(2,3) = (2,3,4), (5,4,3)
IkinciMatris(2,3) = (6,2,7), (2,9,8)
```
Toplam için de bir matris tanımlayalım.
```
ToplamMatris(2,3)
```
Aynı satır ve sütun değerleri için birinci ve ikinci matristen eleman değerlerini okuyup, bu iki elemanı toplayarak bulacağımız değeri, toplam matrisin ilgili elemanına yükleriz.
```
ToplamMatris[satir,sutun) = BirinciMatris(satir,sutun) + IkinciMatris(satir,sutun)
```
Sözde Kod :
```
BirinciMatris(2,3) = (2,3,4), (5,4,3)
İkinciMatris(2,3) = (6,2,7), (2,9,8)
ToplamMatris ARRAY(2,3)
int satir(i) = 0, sutun(j) = 0
FOR i = 0 TO 1 STEP 1
   FOR j=0 TO 2 STEP 1
      ToplamMatris(i,j) = BirinciMatris(i,j) + IkınciMatris(i,j)
   ENDFOR
ENDFOR
FOR i = 0 TO 1 STEP 1
   FOR j = 0 TO 2 STEP 1
      DISPLAY ToplamMatris(i,j) + "\t"
   ENDFOR
   DISPLAY (NEWLINE)
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Images/ToplamMatris.png)
