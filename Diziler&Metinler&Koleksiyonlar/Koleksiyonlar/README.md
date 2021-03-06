# Koleksiyonlar

Diziler belirli bir boyutta tanımlanabildiklerinden, uygulama içinde otomatik olarak genişleyebilmeleri mümkün olmamaktadır. Programlama yaparken bazen dizilere endeks *(index)* değil, anahtar ifadelerle erişmek ya da dinamik olarak genişleyebilen diziler kullanmak istenilebilir. Bu gibi durumlarda programlama dillerindeki koleksiyon *(collection)* adı verilen yapılar kullanılır.

## Liste Yapıları (ARRAYLIST)
Listeler, en temel koleksiyon **nesneleridir.** Listelerle, tek boyutlu dizilerle yapılan işlemler gerçekleştirilebilir. 
```
Klavyeden girilen n tane kelimeyi alarak tersten sıralayıp, ekrana yazdıran algoritmayı tasarlayın.
```
Bir problemin çözümünde dizi mi yoksa liste koleksiyonu mu kullanacağımızı belirlemenin anahtarı, eleman listesinin belli olup olmamasıdır.

Eleman sayısı belli ise, **dizi** kullanılır. Belli değilse, **liste yapısını** kullanarak çözeriz.
```
DISPLAY "Bir kelime girin : "
GET Kelime
Metinler.ADD(Kelime)
```
Tekrarlı yapıdan çıkış için bir formül bulalım. Problemde açıkça çıkış deyimi belirtilmediği için, kullanıcın kelime girme işlemini nasıl sonlandıracağına biz karar verelim. Çözümü bozmayacak bir çözüm olarak aklımıza ilk gelen, kullanıcının kelime girmeden **Enter** tuşuna basma durumu olabilir.

Böylece kullanıcının girdiği kelime boş metin "" olduğunda, tekrarlı yapıdan çıkmaya karar vermiş olduk.

Kullanıcının kaç adet kelime gireceği belli olmadığından **döngü** *(loop)* kullanılır.
```
LOOP [koşul]
   ... Tekrarlanacak işlemler
ENDLOOP
```
Yukarıdaki döngü, koşul *true* olduğu sürece çalışmaya devam eder. 
```
LOOP
   ... Tekrarlanacak işlemler
ENDLOOP [koşul]
```
Yukarıdaki döngü, koşul *false* olsa dahi döngüyü en az bir kez çalıştıracaktır.
```
karakter <> ""          Girilen boş metinden farklı mı?
Uzunluk(karakter) > 0   Girilen karakter sayısı 0'dan büyük mü?
```
Girilen karakterlerin ters sıralanması için;
```
Kelimeler.TersSıralama
```
Sözde Kod :
```
karakter = ""
Kelimeler Liste
LOOP
   DISPLAY "Kelime girin : "
   GET karakter
   Kelimeler.ADD(karakter)
ENDLOOP (karakter<>"")
kelimeler.Reverse
DISPLAY
DISPLAY "Girmiş olduğunuz karakterlerin ters sıralanışı : "
FOR i = 0 TO Kelimeler.Count - 1
   DISPLAY Kelimeler
ENDFOR
```

Çözümün Java ile programlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Koleksiyonlar/Images/TersSiralama.png)

```
Klavyeden girilen n tane kelimeyi alarak tersten sıralayıp, ekrana yazdıran algoritmayı tasarlayın.(Aynı kelime listede sadece bir kez yer almalıdır.)
```
Bir kelimenin listede sadece bir kez yer alması için, kullanıcının girdiği kelimeyi listeye eklemeden önce, o kelimenin listede olup olmadığını kontrol etmemiz gerekmektedir. Bu kontrol sırasında eğer kelime listede varsa, yeniden listeye eklenmez. Eğer kelime yoksa listeye eklenir.

```
Eğer (Kelimeler.Icerir(karakter) = Yanlış) Kelime.Ekle(karakter)
```
Bu yeni çözümde bir de kullanıcın en son girdiği boş metni siliyoruz. Bunun için yine liste yapısnın metodunu çalıştırmamız yeterli olacaktır.
```
Kelimeler.Sil("")
```
Sözde Kod :
```
karakter = ""
Kelimeler liste
LOOP
   DISPLAY "Bir kelime girin : "
   GET karakter
   IF (Kelimeler.CONTAINS(karakter) = False
      Kelimeler.ADD(karakter)
   ENDIF
ENDLOOP (karakter<>"")
Kelimeler.Remove("")
Kelimeler.Reverse
DISPLAY
DISPLAY "Girmiş olduğunuz karakterlerin ters sıralanışı : "
FOR i = 0 TO Kelimeler.Count - 1
   DISPLAY Kelimeler(i)
ENDFOR
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Koleksiyonlar/Images/TekrarsizTersSiralama.png)

## Yığın (Stack) Yapısı

Bu yapıya yeni bir eleman ekleyeceğimiz zaman, bu yeni eleman, dizinin en sonuna eklenir. Yığından bir şey alacağımız zaman da ancak en üsttekini alabiliriz.
```
                  C
            B     B     B     B
      A     A     A     A     A     A
1     2     3     4     5     6     7     8
```
1. Yığın tanımlanıyor.
2. Yığına eleman ekleniyor - "A"
3. Yığına eleman ekleniyor - "B"
4. Yığına eleman ekleniyor - "C"
5. Yığından eleman çekiliyor - "C"
6. Yığındaki en üste eleman değeri okunuyor - "B"
7. Yığından elemn çekiliyor - "B"
8. Yığından eleman çekiliyor - "A"

Son giren ilk çıkar **- Last In - First Out (LIFO)** mantığıyla çalışır.

```
Klavyeden girilen metnin karakterini tersten sıralı olarak alt alta ekrana yazdıran algoritmayı tasarlayın.
```
Sözde Kod :
```
harfler Yigin
i = 0
metin = ""
harf = ""
DISPLAY "Bir metin girin : "
GET metin
FOR i = 0 TO LEN(metin) - 1
   harf = SUBSTRING(metin,i,1)
   harfler.ADD(harf)
ENDFOR
FOR i = 0 TO harfler.COUNT - 1
   DISPLAY(harfler.GET)
ENDFOR
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Koleksiyonlar/Images/YiginReverse.png)

## Kuyruk (QUEUE) Yapısı

Kuyruk yapısı, ilk girine ilk çıkar **- First In - First Out (FIFO)** mantığıyla çalışan tek boyutlu bir liste yapısıdır. 
```
1
2   -> A ->
3   -> B | A ->
4   -> C | B | A ->
5   -> C | B ->
6   -> C | B ->
7   -> C ->
8
```
1. Kuyruk tanımlanıyor.
2. Kuyruğa eleman ekleniyor - *"A"*
3. Kuyruğa eleman ekleniyor - *"B"*
4. Kuyruğa eleman ekleniyor - *"C"*
5. Kuyruktan eleman çekiliyor - *"A"*
6. Kuyruğun önündeki eleman okunuyor - *"B"*
7. Kuyruktan eleman çekiliyor - *"B"*
8. Kuyruktan eleman çekiliyor - *"C"*
```
Klavyeden girilen dört işlemden oluşan bir ifadeyi hesaplayarak ekrana yazdıran algoritmayı tasarlayın. (İşlemler parantez içermeyecektir ve sayılar tek basamaklı olacaktır.)
```
- İlk karakter sayıdır.
- Son karakter sayıdır.
- 2, 4, 6, 8 no'lu karakterler işlem belirtir.
- 1, 3, 5, 7, 9 no'lu karakterler sayı belirtir.
- Çift sayılı elemanlar işlem(+, -, *, /) belirtir.
- Tek sayılı elemanlar sayı belirtir.

Girdi, çıktı ve değişkenlerimiz ;
```
Sayilar Yigin
Islemler Yigin
Karakter = ""
Ifade = ""
i = 0
```

*Tek endeksli karakterler sayı, çift endeksli karakterler işlemdir.* 

Normalde doğru olan bu ifadeler, sayaç *sıfırdan(0)* başladığı için tersine dönecektir.

```
Normal Endeks     1     2     3     4     5     6     7     8     9
Tek/Çift         Tek   Çift  Tek   Çift  Tek   Çift  Tek   Çift  Tek
Sayaçtaki Endeks  0     1     2     3     4     5     6     7     8
Tek/Çift         Çift  Tek  Çift   Tek   Çift  Tek   Çift  Tek   Çift
```
Bu nedenle endeks çift sayı olduğunda sayı, tek sayı olduğunda işlemlere atayacağız.
```
Sayac (i = 0 TO LEN(Ifade) - 1)
   Karakter = AltMetin(Ifade,i,1)
   Eğer
      (i MOD 2 = 0) Sayilar.Ekle(Karakter)
      (Değilse) ISlemler.Ekle(Karakter)
SayacSonu
```
Sözde Kod :
```
sayilar Kuyruk
islemler Kuyruk
ifade = ""
karakter = ""
i = 0
sayi1 = 0
sayi2 = 0
sonuc = 0
islem = ""
DISPLAY "Bir ifade girin : "
GET ifade
FOR (i = 0 TO LEN(ifade) - 1)
   karakter = SUBSTRING(ifade,i,1)
   IF i MOD 2 = 0 THEN
      sayilar.ADD(karakter)
   ELSE
      islemler.ADD(karakter)
   ENDIF
ENDFOR
sayi1 = sayilar.GET
FOR i = 0 TO sayilar.size()
   sayi2 = sayilar.GET
   islem = islemler.GET
   IF islem = "+" THEN
      sonuc = sayi1 + sayi2
   ELSE IF islem = "-" THEN
      sonuc = sayi1 - sayi2
   ELSE IF islem = "*" THEN
      sonuc = islem1 * islem2
   ELSE
      sonuc = sayi1 / sayi2
   ENDIF
   sonuc = sayi1
ENDFOR
DISPLAY sonuc
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Koleksiyonlar/Images/KuyrukIslem.png)

## Sözlük Yapısı

Bazı durumlarda bir elemanı anahtar bir değere bağlı olarak listeye eklemek gerekebilir. Örneğin; bir Türkçe - İngilizce sözlük yapacak olalım. Bu durumda kelimeleri listelediğimiz yapıda son kelimeyi almak, en üsttekini almak ya da belirli bir endekstekini almak çok anlamlı olmayacaktır. Böyle bir problemin çözümü için, listeden eleman alırken bir anahtar bilgisi verip, karşılığında belirli bir eleman içindeki değeri okuyabilmemiz gerekir.
```
kırmızı | red || beyaz | white || mavi | blue || siyah | black || sarı | yellow
```
*Türkçe sözcükler anahtar, ingilizce sözcükler ise değer bilgileridir.*

```
Endeks        0       1       2       3       4
Anahtar    kırmızı  beyaz    mavi   siyah    sarı
Değer        red    white    blue   black   yellow
```
Bir sözlüğü aşağıdaki gibi tanımlayabiliriz.
```
Renkler Sozluk
```
Sözlük yapısındaki bir koleksiyona yeni bir eleman eklerken, elemanın hem anahtar bilgisini hem de değerini vermemiz gerekir.
```
Renkler.Ekle("kırmızı", "red")
Renkler.Ekle("beyaz", "white")
Renkler.Ekle("mavi", "blue")
Renkler.Ekle("sarı", "yellow")
```
Dört elemanlı bir sözlüğümüz olmuş oldu. Sarı renginin ingilizce karşılığını bulmak için ;
```
Yaz Renkler("sarı")
```
Ekrana "yellow" değeri yazdırılacaktır.
```
Klavyeden girilen Türkçe bir rengin İngilizce karşılığını ekrana yazdıran algoritmayı tasarlayın.
Sözlük başlangıçta 5 Türkçe rengin İngilizce karşılığı yüklü olarak çalışacaktır.
Sözlükte karşığı olmayan bir kelime girildiğinde, kullanıcıya bu kelimenin sözlükte bulunmadığı bir mesajla iletilir.
```
Girdi, çıktı ve değerler;
```
Renkler ?
Turkcesi = ""
Ingilizcesi = ""
```
Sözde Kod :
```
turkcesi = ""
ingilizcesi = ""
renkler Sozluk
renkler.ADD("beyaz", "white")
renkler.ADD("kirmizi", "red")
renkler.ADD("mavi", "blue")
renkler.ADD("siyah", "black")
renkler.ADD("sari", "yellow")
DISPLAY "Renk ? "
GET turkcesi
IF renkler.CONTAINSKEY(turkcesi) = true
   ingilizcesi = renkler(turkcesi)
   DISPLAY ingilizcesi
ELSE
   DISPLAY "Renk bulunamadı."
ENDIF
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Koleksiyonlar/Images/Renkler.png)

```
Klavyeden girilen metni karakterlerine ayrıştırarak, hangi karakterlerin kaç kez kullanıldığını ekrana yazdıran algoritmayı tasarlayın.
```
Programın girdisi kullanıcıdan alınan metin, çıktısıysa bu metnin karakterleri ve bu karakterlerin kullanım sayıları olacaktır.

Örneğin, kullanıcı ekrandan *"programlama"* metnini girerse, çözümümüzün ekrana şöyle bir sonuç yazdırması gerekiyor.
```
p - 1
r - 2
o - 1
g - 1
a - 3
m - 2
l - 1
```
Bu çözüme ulaşmak için metnin karakterlerini ve bu karakterlerin kaç kez tekrar ettiği bilgisini birlikte tutacak bir yapıya ihtiyacımız vardır. Bu durumda açıkça sözlük yapısını kullanmamız gerektiğini görürüz.
```
Karakterler Sozluk
```
Şimdi girilen metnin karakterlerini sözlüğe ekleyelim. Bu ekleme işleminde, *metnin **harflerini sözlüğün anahtarı** olarak kullanacağız. **Harfin kaç kez kullanıldığını da değer** olarak ekleyeceğiz.* Bir karakterin sözlüğe ilk kez eklenirken, kullanılma sayısı olarak 1 ekleyeceğiz.
```
Karakterler.Ekle(karakter, 1)
```
Sözde Kod :
```
Metin = ""
Karakter = ""
Tekrar = 0
DISPLAY "Bir metin girin : "
GET Metin
FOR i = 0 TO Metin.Uzunluk - 1
   Karakter = SUBSTRING(Metin, i, 1)
   IF Karakterler.CONTAINSKEY(Karakter) = true THEN
      Tekrar = Karakterler(Karakter)
      Karakterler(karakter) = Tekrar + 1
   ELSE
      Karakterler.ADD(Karakter, 1)
   ENDIF
ENDFOR
FOR i = 0 TO Karakterler.SIZE()
   DISPLAY Karakterler.Keys(i)
   DISPLAY "-"
   DISPLAY Karakterler.Values(i)
ENDFOR
```
Çözümün Java ile programlanmış hali aşağıdaki gibidir;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Koleksiyonlar/Images/Karakter.png)
