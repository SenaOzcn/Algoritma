# Algoritma

**Algoritma**, belli bir problemi çözmek veya belirli bir amaca ulaşmak için tasarlanan yol. Matematikte ve bilgisayar biliminde bir işi yapmak için tanımlanan, bir başlangıç durumundan başladığında, açıkça belirlenmiş bir son durumunda sonlanan, sonlu işlemler kümesidir. Genellikle bilgisayar programlamada kullanılır ve tüm programlama dillerinin temeli algoritmaya dayanır. Aynı zamanda algoritma tek bir problemi çözecek davranışın, temel işleri yapan komutların veya deyimlerin adım adım ortaya konulmasıdır ve bu adımların sıralamasına dikkat edilmelidir. Bir problem çözülürken algoritmik ve sezgisel (herustic) olmak üzere iki yaklaşım vardır. Algoritmik yaklaşımda da çözüm için olası yöntemlerden en uygun olan seçilir ve yapılması gerekenler adım adım ortaya konulur. Algoritmayı belirtmek için; metinsel olarak düz ifade ve akış diyagramı olmak üzere 2 yöntem kullanılır. Algoritmalar bir programlama dili vasıtasıyla bilgisayarlar tarafından işletilebilirler.

# Algoritma Yazımı

Algoritmayı yazılı hale getirmenin üç yönetmi vardır:

- Satır Algoritma
- Akış Diyagramı
- **Sözde Kod**(*Pseudo-Code)

# Satır Algoritma

Satır algoritmalar, problem çözümünü günlük yazı/konuşma diliyle ifade ederek ve sıra numarasıyla yazılarak oluşturulur.

![ornek1](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Main.java%20-%20javapatikasi%20-%20Visual%20Studio%20Code%2028.04.2022%2016_22_45.png)

# Akış Diyagramı

Akış diyagramı, algoritmanın belirli grafikler kullanılarak ifade edilen şeklidir. Aşağıda bu şekiller ve açıklamaları bulunmaktadır.

![gorsel](https://www.muhammettopcu.com/wp-content/uploads/2019/06/Flowchart-tan%C4%B1mlar%C4%B1-1.png)

Örnek göstermi;

![gorsel](https://upload.wikimedia.org/wikipedia/commons/a/ac/LampFlowchart_tr.svg)

# İki Alternatifli Koşul Yapıları

Bazı durumlarda basit koşul yapıları işimizi görse de bazen akışın ikiye ayrılıp, ya birinden ya diğerinden devam etmesi gerekebilir. Bu gibi durumlarda iki alternatifli koşul yapısı kullanmak gerekecektir.

![ornek2](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Visual%20Studio%20Code%2028.04.2022%2016_38_49.png)

Yukarıdaki akışta duruma göre ya 3.1 no'lu satır ya da 3.2 no'lu satır işletilir. Bu iki satırdan hangisinin işletileceğini de Y >= 18 koşulu belirler. Böylece program duruma göre 3.1 ya da 3.2 numaralı satırın işletilmesine karar vermiş olur.

# Çok Alternatifli Koşul Yapıları

Uygulama akışının geldiği yerde, ikiden fazla alternatif yoldan biriyle ilerlemesi gerektiği durumlardır.

![ornek3](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/soru.3.png)

Bir önceki örnekte iki farklı yol olduğundan veya birisi ya da diğeri tercih edileceğinden, bir tek koşula bakmak yeterliydi. Yani girilen yaş 18'e eşit ya da büyükse "Reşitsiniz", değilse "Reşit değilisiniz." yazdırılmıştı. Ancak yeni problem biraz farklı. Sayının üç farklı durumu söz konusu olabilir.

- Sayı > 0 ise, sayı pozitiftir.
- Sayı < 0 ise, sayı negatiftir.
- Sayı = 0 ise, sayı sıfırdır.

Yukarıdaki algoritmada program işletilirken 3, 4 ve 5 numaralı satırlardaki koşullar sırasıyla sınanır. Sayı, bu üç koşuldan sadece birine uygun olabileceğinden dolayı; 3, 4 veya 5 numaralı adımlardan sadece biri çalışmış olur.

# İç İçe Koşul Yapıları

Aynı problemin bir başka çözümü de iç içe koşul yapısı uygulamaktır. Bu tip yapılarda, koşul yapısının içinde bir başka koşul yapısı daha yer alır.

![ornek4](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/algoritma4.png)
