# Alıştırmalar

### 1) Verilen bir dizideki elemanları ayırarak, tek ve çift sayılar için iki ayrı diziye kopyalayın.

Sözde Kod :
```
DISPLAY "Kaç adet sayı girineceksiniz ? : "
GET sayi_adeti
Sayilar liste
CiftSayilar liste
TekSayilar liste
FOR i = 0 TO sayi_aderi STEP 1
   DISPLAY "Bir sayı girin = "
   GET sayi
   IF sayi MOD 2 = 0
      CiftSayilar[i] = sayi
      DISPLAY CiftSayilar[i] + "\t"
   ELSE
      TekSayilar[i] = sayi
      DISPLAY TekSayilar[i] + "\t"
   ENDIF
ENDFOR
DISPLAY
DISPLAY "Girdiğiniz sayılar : "
FOR i = 0 TO sayi_adeti STEP 1
   DISPLAY Sayilar[i] + "\t"
ENDFOR
DISPLAY "Girmiş olduğunuz çift sayılar : "
FOR i = 0 TO sayi_adeti STEP 1
   DISPLAY CiftSayilar[i] + "\t"
ENDFOR
DISPLAY "Girmiş olduğunuz tek sayılar : "
FOR i = 0 TO sayi_adeti STEP 1
   DISPLAY TekSayilar[i] + "\t"
ENDFOR
```
Çözümün Java ile programlanmış hali ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Al%C4%B1stirmalar/Images/CiftTekSayilar.png)

### 2) Eşit uzunluktaki iki dizinin aynı endeksli elemanlarını toplayarak yeni bir diziye kopyalayın.

Sözde Kod :
```
BirinciMatris(3, 4) = (1, 4, 2, 3), (3, 4, 7, 9), (2, 1, 8, 7)
IkinciMatris(3, 4) = (4, 1, 3, 2), (2, 1, -2, -4), (3, 4, -3, -2)
ToplamMatris ARRAY(2, 3)
satir(i) = 0, sutun(j) = 0
FOR i = 0 TO 2 STEP 1
   FOR j = 0 TO 3 STEP 1
      ToplamMatris(i, j) = BirinciMatris(i, j) + IkinciMatris(i, j)
   ENDFOR
ENDFOR
FOR i = 0 TO 2 STEP 1
   FOR j = 0 TO 3 STEP 1
      DISPLAY ToplamMatris(i, j) + "\t"
   ENDFOR
   DISPLAY(NEWLINE)
ENDFOR
```
