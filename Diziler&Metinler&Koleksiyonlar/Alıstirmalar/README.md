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
Çözümün Java ile programlanmış hali ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Al%C4%B1stirmalar/Images/ToplamMatris.png)

### 3) Verilen 4x4'lük iki matrisin çarpımını bulan algoritmayı tasarlayın.

Sözde Kod :
```
BirinciMatris(4, 4) = (2, 4, 6, 8), (1, 3, 5, 7), (1, 2, 3, 4), (9, 8, 7, 6)
İkinciMatris(4, 4) = (9, 8, 7, 6), (1, 2, 3, 4), (1, 3, 5, 7), (2, 4, 6, 8)
CarpimMatris ARRAY(4, 4)
satir(i) = 0, sutun(j) = 0
FOR i = 0 TO 3 STEP1
   FOR j = 0 TO 3 STEP 1
      CarpimMatris(i, j) = BirinciMatris(i, j) * IkınciMatris(i, j)
   ENDFOR
ENDFOR
DISPLAY "Çarpım Matris : "
FOR i = 0 TO 3 STEP 1
   FOR j = 0 TO 3 STEP 1
      DISPLAY CarpimMatris(i, j) + "\t"
   ENDFOR
   DISPLAY(NEWLINE)
ENDFOR
```
Çözümün Java ile programlanmış hali ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Al%C4%B1stirmalar/Images/CarpimMatris.png)

### 4) Verilen bir metin içindeki sesli harfleri sayan algoritmayı tasarlayın.

Sözde Kod :
```
Metin = ""
char karakter
sayac = 0
i = 0
DISPLAY "Metin girin : "
GET Metin
FOR i = 0 TO LEN(Metin) STEP 1
   karakter = Metin.charAt(i)
   IF (karakter = 'a' || karakter = 'e' || karakter = 'ı' || karakter = 'i' || karakter = 'o' || karakter = 'ö' || karakter = 'u' || karakter = 'ü' ||
   karakter = 'A' || karakter = 'E' || karakter = 'I' || karakter = 'İ' || karakter = 'O' || karakter = 'Ö' || karakter = 'U' || karakter = 'Ü')
      sayac++
   ENDIF
ENDFOR
DISPLAY sayac + " adet sesli harf vardır."
```
Çözümün Java ile programlanmış hali ;

![gorsel](https://github.com/SenaOzcn/Algoritma/blob/MIT-License/Diziler%26Metinler%26Koleksiyonlar/Al%C4%B1stirmalar/Images/SesliHarf.png)
