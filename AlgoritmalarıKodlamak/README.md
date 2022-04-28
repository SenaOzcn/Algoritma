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
