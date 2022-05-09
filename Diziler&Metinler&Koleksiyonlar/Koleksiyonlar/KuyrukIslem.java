// Klavyeden girilen dört işlemden oluşan bir ifadeyi hesaplayarak ekrana yazdıran program...
// İşlemler parantez içermeyecektir ve sayılar tek basamaklı olacaktır.

import java.util.*;
import java.util.Queue;

class KuyrukIslem {
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      Queue Sayilar = new LinkedList();
      Queue islemler = new LinkedList();
      String ifade = "", karakter = "", islem = "";
      int i = 0, sayi1 = 0, sayi2 = 0, sonuc = 0;
      System.out.print("Bir ifade girin : ");
      ifade = scanner.nextLine();
      for (i = 0; i < ifade.length(); i++) {
        karakter = ifade.substring(i,i + 1);
        if ( i %2 == 0) {
          Sayilar.add(karakter);
        } else {
          islemler.add(karakter);
        }
      }
      sayi1 = (Double)Sayilar.poll();   // poll() metodu ile kuyrukta ilk eklenen veriyi alıp, ilgili veriyi kuyrutan çıkarabilirsiniz.
        for (i = 0; i < Sayilar.size(); i++) {
          sayi2 = (Double)Sayilar.poll();
          islem = islemler.poll().toString();
          if (islem.equals("+")) {
            sonuc = sayi1 + sayi2;
          } else if (islem.equals("-")) {
            sonuc = sayi1 - sayi2;
          } else if (islem.equals("*")) {
            sonuc = sayi1 * sayi2;
          } else {
            sonuc = sayi1 / sayi2;
          }
          sayi1 = sonuc;
        }
      System.out.println(sonuc);
  }
}
