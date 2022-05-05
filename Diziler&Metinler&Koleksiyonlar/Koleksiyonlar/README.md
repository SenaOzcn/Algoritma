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

