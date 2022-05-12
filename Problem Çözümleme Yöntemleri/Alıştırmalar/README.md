# Alıştırmalar

### 1) Sayısal loto için rasgele sayılarla loto kuponu hazırlayan algoritmayı tasarlayın.

**Sayısal Loto**, ilk olarak Lothar Lammers tarafından yaratılan, *49 sayı içerisinde seçilecek 6 sayıyı* bilme üzerine dayalı şans oyunudur. Oynayan kişi bu kümeden istediği 6 sayıyı seçerek, Sayısal Loto oynayabiliyor.

Sayısal Loto oyununda, 6, 5, 4 ve 3 tane sayıyı doğru tahmin eden kişilere ikramiye ödenir. 6 sayıyı bilen kişiler, kaç kişi olurlarsa olsunlar (sadece 1 kişi olabilir) büyük ikramiye sahibi olurlar.

![gorsel](https://i2.wp.com/www.yazilimbilisim.net/wp-content/uploads/2016/03/sanstopu.jpg?resize=1024%2C609&ssl=1)

Sözde Kod :
```
DISPLAY "Kaç kolon oynayacaksınız ? (1/8) "
GET kolonsayisi
int[][] kolon
FOR i = 0 TO kolonsayisi STEP 1
   FOR j = 0 TO 6 STEP 1
      RANDOM rnd
      sayi = 1 + rdn.nextInt(49)
      IF sayi != kolon[i][j]
         kolon[i][j] = sayi
      ENDIF
   ENDFOR
ENDFOR
DISPLAY "Oynanan kolonlar : "
FOR i = 0 TO kolonsayisi STEP 1
   DISPLAY ""
   FOR j = 0 TO 6 STEP 1
      DISPLAY kolon[i][j] + " "
   ENDFOR
ENDFOR
```
Çözümün Java ile kodlanmış hali aşağıdaki gibidir ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Problem%20%C3%87%C3%B6z%C3%BCmleme%20Y%C3%B6ntemleri/Al%C4%B1%C5%9Ft%C4%B1rmalar/Images/SayisalLoto.png)
