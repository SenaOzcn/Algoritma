# Algoritma

**Algoritma**, belli bir problemi çözmek veya belirli bir amaca ulaşmak için tasarlanan yol. Matematikte ve bilgisayar biliminde bir işi yapmak için tanımlanan, bir başlangıç durumundan başladığında, açıkça belirlenmiş bir son durumunda sonlanan, sonlu işlemler kümesidir. Genellikle bilgisayar programlamada kullanılır ve tüm programlama dillerinin temeli algoritmaya dayanır. Aynı zamanda algoritma tek bir problemi çözecek davranışın, temel işleri yapan komutların veya deyimlerin adım adım ortaya konulmasıdır ve bu adımların sıralamasına dikkat edilmelidir. Bir problem çözülürken algoritmik ve sezgisel (herustic) olmak üzere iki yaklaşım vardır. Algoritmik yaklaşımda da çözüm için olası yöntemlerden en uygun olan seçilir ve yapılması gerekenler adım adım ortaya konulur. Algoritmayı belirtmek için; metinsel olarak düz ifade ve akış diyagramı olmak üzere 2 yöntem kullanılır. Algoritmalar bir programlama dili vasıtasıyla bilgisayarlar tarafından işletilebilirler.

# Algoritma Yazımı

Algoritmayı yazılı hale getirmenin üç yönetmi vardır:

1. Satır Algoritma
2. Akış Diyagramı
3. **Sözde Kod**(*Pseudo-Code)

# Satır Algoritma

Satır algoritmalar, problem çözümünü günlük yazı/konuşma diliyle ifade ederek ve sıra numarasıyla yazılarak oluşturulur.

```
Ekrana sırasıyla 1, 2 ve 3 değerlerini yazdıran algoritmayı tasarlayın.

1. Başla
2. Yaz "1"
3. Yaz "2"
4. Yaz "3"
5. Dur
```

# Akış Diyagramı

Akış diyagramı, algoritmanın belirli grafikler kullanılarak ifade edilen şeklidir. Aşağıda bu şekiller ve açıklamaları bulunmaktadır.

![gorsel](https://www.muhammettopcu.com/wp-content/uploads/2019/06/Flowchart-tan%C4%B1mlar%C4%B1-1.png)

Örnek göstermi;

![gorsel](https://upload.wikimedia.org/wikipedia/commons/a/ac/LampFlowchart_tr.svg)

# İki Alternatifli Koşul Yapıları

Bazı durumlarda basit koşul yapıları işimizi görse de bazen akışın ikiye ayrılıp, ya birinden ya diğerinden devam etmesi gerekebilir. Bu gibi durumlarda iki alternatifli koşul yapısı kullanmak gerekecektir.

```
Kullanıcının girdiği yaş 18 yaşında ve 18 yaşından büyükse "Reşitsiniz!", değilse "Reşit değilsiniz..." yazısını gösterecek algoritmayı tasarlayın.

1. Başla
2. Oku "Yaşınız ? : " (Y)
3. Eğer
3.1.1. (Y >= 18) Yaz "Reşitsiniz!"
3.1.2. (Değilse) Yaz "Reşit değilsiniz..."
4. Dur
```

Yukarıdaki akışta duruma göre ya 3.1 no'lu satır ya da 3.2 no'lu satır işletilir. Bu iki satırdan hangisinin işletileceğini de Y >= 18 koşulu belirler. Böylece program duruma göre 3.1 ya da 3.2 numaralı satırın işletilmesine karar vermiş olur.

# Çok Alternatifli Koşul Yapıları

Uygulama akışının geldiği yerde, ikiden fazla alternatif yoldan biriyle ilerlemesi gerektiği durumlardır.

```
Kullanıcıdan bir sayı alarak, aldığı sayının pozitif ya da negatif olduğunu ekrana yazdıran algoritmayı tasarlayınız. (Eğer sayı sıfır ise, ekrana sıfır yazdırılacaktır.)

1. Başla
2. Oku "Bir sayı giriniz : " (Sayı)
3. Eğer (Sayı > 0) Yaz ("Girdiğiniz sayı pozitiftir.")
4. Eğer (Sayı < 0) Yaz("Girğiniz sayı negatiftir.")
5. Eğer Yaz ("Girdiğiniz sayı sıfırdır")
6. Dur
```

Bir önceki örnekte iki farklı yol olduğundan veya birisi ya da diğeri tercih edileceğinden, bir tek koşula bakmak yeterliydi. Yani girilen yaş 18'e eşit ya da büyükse "Reşitsiniz", değilse "Reşit değilisiniz." yazdırılmıştı. Ancak yeni problem biraz farklı. Sayının üç farklı durumu söz konusu olabilir.

- Sayı > 0 ise, sayı pozitiftir.
- Sayı < 0 ise, sayı negatiftir.
- Sayı = 0 ise, sayı sıfırdır.

Yukarıdaki algoritmada program işletilirken 3, 4 ve 5 numaralı satırlardaki koşullar sırasıyla sınanır. Sayı, bu üç koşuldan sadece birine uygun olabileceğinden dolayı; 3, 4 veya 5 numaralı adımlardan sadece biri çalışmış olur.

# İç İçe Koşul Yapıları

Aynı problemin bir başka çözümü de iç içe koşul yapısı uygulamaktır. Bu tip yapılarda, koşul yapısının içinde bir başka koşul yapısı daha yer alır.

```
1. Başla
2. Oku "Bir sayı giriniz : " (Sayı)
3. Eğer
3.1. (Sayı > 0) Yaz ("Girdiğiniz sayı pozitiftir.")
3.2. (Değilse)
3.2.1.1 (Sayı < 0) Yaz ("Girdiğiniz sayı negatiftir.")
3.2.1.2. Değilse Yaz ("Girdiğiniz sayı sıfırdır.")
4. Dur
```

# Tekrarlı Yapılar İçin Algoritma Geliştirmek

Program yazarken sıklıkla karşılaştığımız durumlardan biri de, belirli bir işi tekrarlamaktır. Örneğin; kullanıcıdan 100 adet sayı alıp, bunların toplamını ekrana yazdıracak bir programın algoritmasını yazalım. 

![ornek](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/4.png)

Algoritmaya dikkat bakacak olursak, satırlar sürekli aynı şeyi tekrar ediyor. Eğer bir algoritmda tekrar eden algoritmalar varsa, bu noktada tekrarlı yapılar kullanılır.

# Sayaç Yapıları

Kullanıcıdan 100 adet sayı alıp, bu sayıların toplamını ekrana yazdıran programı tekrar ele alalım. Bu problemin çözümündeki adımlardan kullanıcıdan sayı alma ve alınan sayıyı toplama ekleme işlemleri 100 kez tekrar edilmektedir. Tekrar sayısı **net** olan bu işlemde, sayaç mantığı kullanılarak işlem 100 kez tekrarlanır. 

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/5.png)
