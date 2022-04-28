# Sözde Kodlar

Bilgisayarda bir programlama dili olarak çalışmayan, ancak yazı/konuşma dilinden çok programlama dillerine yakın algoritma ifadelerine **sözde kod** *(pseudo-code)* denir.

Bir sözde kod yapısal olarak dört temel öğeye sahiptir.

**1. Okuma/Yazma İşlemleri :** READ, GET, WRITE, DISPLAY gibi komutlarla temel okuma ve yazma işlemleri gerçekleştirilir.

**2. İşlemler :** Sözde kod içerisinde gerçekleştirilen aritmetiksel ve diğer işlemler, bir değişkene değer atanması gibi olaylardır.

**3. Karar Yapıları :** Bir koşulu kontrol edip, bir alternatifin işletilip işletilmeyeceğine ya da birden fazla alternatiften hangisinin işetileceğine karar veren mekanizmalardır.

**4. Tekrarlı Yapılar :** Program içinde bir koşula bağlı olarak ya da belirli bir sayıda tekrar edecek işlemler için kullanılırlar. 

```
LOOP [koşul]
      ... Tekrarlanacak işlemler
ENDLOOP
```
Aşağıdaki koşula bağlı tekrarlı yapıdaysa, koşulun durumu her ne olursa olsun, tekrarlı yapı içindeki kod en az bir kez çalıştırılacaktır.

```
LOOP
     ... Tekrarlanacak işlemler
ENDLOOP [koşul]
```

Sayaç tipi tekrarlı yapılarda, belirli bir sayıdan başlanarak, belirli bir hedefe kadar sayılır. Sayma işleminde artışın ne kadar olacağını STEP deyimi belirtir.

```
FOR Sayac  ([başlangıç değeri] TO [Hedef Sayı] STEP [artış])
     ... Tekrarlanacak işlemler
ENDFOR
```

# Satır Algoritmalardan Sözde Kod Oluşturma

Bir satır algoritmayı sözde koda dönüştürürken aşağıdaki adımları izleriz:

1. Girdi ve çıktıları (değişkenleri) belirlemek.
2. Sıralı adımları, karar yapılarını, tekrarlı yapıları ve işlemleri belirlemek.
3. Yapı, işlem ve adımları uygun şekilde düzenlemek.

İlk olarak ekrana sırasıyla 1, 2 ve 3 değerlerini yazdıran algoritmanın sözde kodunu yazalım.

```
1. Başla
2. Yaz 1
3. Yaz 2
4. Yaz 3
5. Dur
```
Sözde kod yazarken, yukarıdaki gibi Başla ve Dur komutlarını yazmıyoruz.  Bunun nedeni; sözde kodu bir program olarak düşündüğümüzden, zaten ilk satırla başlayacak ve son satırla bitecektir.

```
2. Yaz 1
3. Yaz 2
4. Yaz 3
```

Sözde kodda, çıktı işlemleri için **DISPLAY** ve **WRITE** ifadeleri kullanılır. Bir bilgiyi ekranda göstermek için **DISPLAY**, veritabanı ya da dosyaya yazdırmak için **WRITE** kullanılır.

```
DISPLAY 1
DISPLAY 2
DISPLAY 3
```

Oku için **GET**, Yaz için **DISPLAY** komutlarını kullanalım.

```
GET A
GET B
C = A + B
DISPLAY C
```

Kullanıcının girdiği yaş 18 yaşında ve 18 yaşından büyükse "Reşitsiniz!", değilse "Reşit değilsiniz..." yazısını gösterecek algoritmayı sözde koda dönüştürelim.

```
DISPLAY "Yaşınız ? : "
GET Y
IF Y >= 18 THEN
DISPLAY "Reşitsiniz!"
ELSE
DISPLAY "Reşit değilsiniz..."
ENDIF
```
 Eğer koşul *doğru/true* döndürürse *IF* deyiminden sonra gelen blok, eğer *yanlış/false* döndürürse *ELSE* deyiminden sonraki blok işletilecektir.
 
 Şimdi ekrana 1'den 100'e kadar olan sayıların toplamını sözde kod ile yazdıralım.
 ```
 Toplam = 0
 FOR (X = 1 TO 100 STEP 1)
     Toplam += X
 ENDFOR
 DISPLAY Toplam
 ```
 
 Ekrana sırasıyla 1, 2 ve 3 yazdıran **JAVA** programı aşağıdaki gibidir.
 
 ![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Algoritmalar%C4%B1Kodlamak/Images/Algoritma_EkranaYazdirma.java%20at%20MIT-License%20%C2%B7%20SenaOzcn_Algoritma%20-%20Brave%2028.04.2022%2018_19_45.png)
 
 Java'da ekranda bilgi göstermek için **System.out.println()** kullanılır.
 
 Yaşını giren kullanıcının reşit olup olmadığını Java ile ekrana yazdıralım.
 
 ![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Algoritmalar%C4%B1Kodlamak/Images/resitlik.png)
 
 Java'da kullanıcıdan bilgi almak için öncelikle bir **Scanner** nesnesi tanımlanır. Ardından bu tanımlanan nesnenin uygun metodu çağrılarak kullanıcın girdiği bilgi alınır.
 
 1'den 100'e kadar olan sayma sayılarını toplayalım.
 
 ```
 1. Başla
 2. Toplam = 0, Sayi = 1
 3. Sayac (X = 1 TO 100 STEP 1)
 4. Oku "Bir sayı girin : " Sayı
 5. Toplam += Sayı
 6. Sayac Sonu
 7. Yaz Toplam
 8. Dur
 ```

İlk olarak değişikenleri belirleyelim. İşlem sonuçta toplam çıktısı vereceği için, 1'den 100'e kadar olan sayıların toplamını tutacak bir **Toplam** değişkenine ihtiyacımız var. İkincisi **for** yapısı bir *sayaç* değişkenine (yani X) ihtiyaç duyar.
