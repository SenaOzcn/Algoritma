// Verilen bir metin içindeki sesli harfleri sayan program...

import java.util.*;

class SesliHarf {
    public static void main(String args[]) {
      String metin = "";
      char karakter;
      int sayac = 0, i = 0;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Metin girin : ");
      metin = scanner.nextLine();
      for (i = 0; i < metin.length(); i++) {
        karakter = metin.charAt(i);
        if (karakter == 'a' || karakter == 'e' || karakter == 'ı' || karakter == 'i' || karakter == 'o' || karakter == 'ö' || karakter == 'u' || karakter == 'ü' ||
        karakter == 'A' || karakter == 'E' || karakter == 'I' || karakter == 'İ' || karakter == 'O' || karakter == 'Ö' || karakter == 'U' || karakter == 'Ü') {
          sayac++;
        }
      }
      System.out.println(sayac + " adet sesli harf vardır.");
