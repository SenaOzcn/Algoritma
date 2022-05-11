// Ekrana girilen bir metni kelimelere ayırarak her bir kelimenin ilk karakterini büyük, diğer karakterini küçük harfe çevirerek ekrana yazdıran program...
// Metin içindeki kelimeler boşluk karakteri esas alınarak ayrıştırılacaktır.

import java.util.*;

class Fonksiyon {
  public static void main(String[] args) {
    String metin = "";
    String hamKelime = "";
    String[] kelimeler = null;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bir metin girin : ");
    metin = scanner.nextLine();
    kelimeler = metin.split("[ ]", -1);
    for (int i = 0; i <= kelimeler.length - 1; i++) {
      hamKelime = kelimeler[i];
      System.out.println(BaslikBicimi(hamKelime));
    }
  }
  public static String BaslikBicimi(String kelime) {
    String ilkKarakter = "";
    String kucukHarfler = "";
    String yeniKelime = "";
    ilkKarakter = kelime.substring(0,1);
    kucukHarfler = kelime.substring(1, kelime.length());
    yeniKelime = ilkKarakter.toUpperCase() + kucukHarfler.toLowerCase();
    return yeniKelime;
  }
}
