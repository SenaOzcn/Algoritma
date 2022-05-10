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
