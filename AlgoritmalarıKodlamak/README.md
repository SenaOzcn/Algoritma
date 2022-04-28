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
