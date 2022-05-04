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

