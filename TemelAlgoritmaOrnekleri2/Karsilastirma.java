// Girilen iki sayıyı karşılaştırıp, büyüklük, küçüklük ve eşitlik durumlarını ekrana yazdıran program...

import java.util.*;

class Karsilastirma {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı1 => ");
    double sayi1 = Double.valueOf(scanner.nextLine());
    System.out.print("Sayı2 => ");
    double sayi2 = Double.valueOf(scanner.nextLine());
    if (sayi1 > sayi2) {
      System.out.println("Sayı1, Sayı2'den büyüktür.");
    } else if ( sayi1 < sayi2) {
      System.out.println("Sayı1, Sayı2'den küçüktür.");
    } else {
      System.out.println("Sayı1 ve Sayı2 eşittir.");
    }
  }
}
