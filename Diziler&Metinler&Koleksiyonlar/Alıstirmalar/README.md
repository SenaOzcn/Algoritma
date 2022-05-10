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
