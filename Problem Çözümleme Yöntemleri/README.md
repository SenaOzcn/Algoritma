## Rasgele Sayı Üretmek

Kuralar, çekilişler, oyunlar vb. gibi birçok durumda rasgeleüretilecek bilgilere ihtiyaç duyulur. Örneğin; bir tavla oyunu yazacağımızı düşünelim. Bu durumda kullanıcının zar atmasının **benzeşimine** *(simulation)* ihtiyacımız olacaktır. Yani 1 ile 6 arasında rasgele iki ayrı değer üretebilmeliyiz.

Rasgele sayı üretmek ile ilgili geliştirilmiş birçok algoritma vardır. 

Günümüzde kullanılan C#, Java, VB.NET gibi birçok programlama dili, rasgele sayı üreten bir fonksiyona ya da sınıfa sahiptir.
```
Kullanıcının tavla oyunundaki zar atışının benzeşimini gerçekleştirerek, atılan zarı ekrana yazdıran algoritmayı tasarlayın.
```
Tavla oyunundaki zar atışının benzeşimini yapmak demek, iki kez 1 ile 6 arasında rasgele bir sayı üretmek demektir. Bu işlem için kullanıcıdan alınacak bir girdi yoktur.

Çözümün çıktısı şöyledir ;
```
Zar1
Zar2
```
Sözde Kod :
```
Zar1 = RND(1, 6)
Zar2 = RND(1, 6)
DISPLAY Zar1 + " - " + Zar2
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Problem%20%C3%87%C3%B6z%C3%BCmleme%20Y%C3%B6ntemleri/Images/RasgeleSayi.png)

Rasgele değer üreterek geliştirilen çözümlerle ilgili birkaç temel yöntem vardır.

Bunlar aşağıdaki gibidir.

- Çekileni geri ekleyerek çekiliş yapma
- Çekileni listeden çıkartarak çekiliş yapma

1 ile 6 arasındaki rakamları birer kağıda yazıp, kağıtları katlayarak rakamlar görünmeyecek şekilde bir kavanoza koyduğumuzu ve daha sonra buradan bir kağıt çekerek rakamı okuduğumuzu düşünün. *"birinci zarı atma"* işlemi...

Şimdi ikinci zarı atma işlemine geçelim. İkinci zar için çekiliş yaparken, kavanozdan çıkarttığımız kağıdı katlayarak tekrar kavanoza koymalıyız. Aksi halde zar atmada hata alırız. Şimdi kavanozdaki kağıtları karıştırarak yeniden bir kağıt çekelim. Çekileni geri ekleyerek zar atma işlemi...

*"Çekileni listeden çıkartarak çekiliş yapma"* işlemiyse, daha çok piyango vb. işlemlerin çözümünde kullanılır.

```
10 kişilik bir isim listesi içerisinden çekiliş yaparak birinci, ikinci ve üçüncü talihliyi belirleyip ekrana yazdıran algoritmayı tasarlayın.
```
Çözümün girdisi;
```
isim1
isim2
isim3
isim4
isim5
isim6
isim7
isim8
isim9
isim10
```
Çözümün çıktısı;
```
Birinci
Ikinci
Ucuncu
```
Sözde Kod :
```
Endeks = 0, i = 0
kazananlar ARRAY
katilimcilar Liste
DISPLAY "isim1 => "
GET isim1
DISPLAY "isim2 => "
GET isim2
DISPLAY "isim3 => "
GET isim3
DISPLAY "isim4 => "
GET isim4
DISPLAY "isim5 => "
GET isim5
DISPLAY "isim6 => "
GET isim6
DISPLAY "isim7 => "
GET isim7
DISPLAY "isim8 => "
GET isim8
DISPLAY "isim9 => "
GET isim9
DISPLAY "isim10 => "
GET isim10
katilimcilar.ADDRANGE (isim1, isim2, isim3, isim4, isim5, isim6, isim7, isim8, isim9, isim10)
FOR i = 0 TO 2 STEP 1
   endeks = RND(0, katilimcilar.Count - 1)
   kazananlar(i) = katilimcilar(endeks)
   katilimcilar.RemoveAt(endeks)
ENDFOR
FOR i = 0 TO 2
   DISPLAY ((i + 1) + ". talihli : " + kazananlar(i)
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Problem%20%C3%87%C3%B6z%C3%BCmleme%20Y%C3%B6ntemleri/Images/Cekilis.png)

## Sonsuz Tekrarlı Yapılar ve Çıkış Komutları

Tekrarlı yapının adımları içinde bir yerde bir koşula bakarak çıkış komutu kullanılır.
```
Sayac
   Eğer(...) Sayaçtan çık
SayacSonu
```
```
Kullanıcıdan sayı alarak, aldığı sayılardan tek olanları toplama ekleyip çift olanları toplamdan çıkartan bir uygulama yazın.
Uygulama toplam 100 olduğunda ya da 100'ü geçtiğinde, kullanıcı rakam girmeden Enter tuşuna bastığında ya da kullanıcının girdiği rakam 0 ise sonlansın ve girilen sayıların sonucunu ekrana yazdırsın.
```
Problem, kullanıcıdan bilinmeyen sayıda girdi alan bir çözüm gerektiriyor. Bu da bize hemen tekrarlı yapıyı çağrıştıryor.

Sözde Kod :
```
toplam = 0
girilen = ""
LOOP
   DISPLAY "Bir sayı girin = "
   GET girilen
      IF girilen = "" EXIT
      IF girilen = 0 EXIT
      IF girilen MOD 2 = 0
         toplam = toplam - girilen
      ELSE
         toplam = toplam + girilen
      ENDIF
      IF toplam >= 100 EXIT
ENDLOOP (1=1)
DISPLAY "Toplam = " + toplam
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Problem%20%C3%87%C3%B6z%C3%BCmleme%20Y%C3%B6ntemleri/Images/KosulluTekrarYapisi.png)

## Yer Değiştirme İşlemi

Bir dizideki elemanların ya da iki değişkendeki değerlerin yer değiştirme işlemleridir.

```
Bir dizinin elemanlarını ters çevirerek ekrana yazdıran algoritmayı tasarlayın.
```
Yeni bir dizi tanımlayıp, eski dizinin elemanlarını tersten listeleyen bir döngü içinde yeni diziye aktaracağız.
```
FOR i = EskiDizi.ElemanSayisi - 1 TO 0 STEP 1
  YeniDizi(EskiDizi.ElemanSayisi - 1 - i) = EskiDizi(i)
ENDFOR
```
```
           Eski Dizi   1   2   3   4
Adım 1
           Yeni Dizi   4
           
           Eski Dizi   1   2   3   4
Adım 2
           Yeni Dizi   4   3
           
           Eski Dizi   1   2   3   4
Adım 3
           Yeni Dizi   4   3   2
           
           Eski Dizi   1   2   3   4
Adım 4
           Yeni Dizi   4   3   2   1
```
