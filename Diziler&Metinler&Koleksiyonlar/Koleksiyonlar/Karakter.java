//  Klavyeden girilen metni karakterlerine ayrıştırarak, hangi karakterlerin kaç kez kullanıldığını ekrana yazdıran program...

import java.util.*;
import java.util.Hashtable;

class Karakter {
  public static void main(String args[]) {
      Hashtable Karakterler = new Hashtable();
      Scanner scanner = new Scanner(System.in);
      String metin = "", karakter = "";
      int tekrar = 0;
      System.out.print("Bir metin girin : ");
      metin = scanner.nextLine();
      for (int i = 0; i < metin.length(); i++) {
        karakter = metin.substring(i, i + 1);
        if (Karakterler.containsKey(karakter) == true) {
          tekrar = (Integer)Karakterler.get(karakter);
          Karakterler.put(karakter, tekrar + 1);
        } else {
          Karakterler.put(karakter, 1);
        }
        Enumeration anahtarlar = Karakterler.keys();
        while (anahtarlar.hasMoreElements()) {
          Object anahtar = anahtarlar.nextElement();
          Object deger = Karakterler.get(anahtar);
          System.out.print(anahtar);
          System.out.print("-");
          System.out.println(deger);
        }
      }
  }
}
