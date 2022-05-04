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
DISPLAY "Girdiğiniz Sayılar "
FOR x = 0 TO 9
DISPLAY Sayilar(x)
ENDFOR
```
