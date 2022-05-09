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

## Kuyruk (QUEQUE) Yapısı

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
