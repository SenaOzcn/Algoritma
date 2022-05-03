// Kullanıcıdan iki sayı alıp, bu iki sayının toplamını ve çarpımını ekrana yazdıran program...

import java.util.*;

class ToplamCarpim {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı1 => ");
    int sayi1 = Integer.valueOf(scanner.nextLine());
    System.out.print("Sayı2 => ");
    int sayi2 = Integer.valueOf(scanner.nextLine());
    int toplam = sayi1 + sayi2;
    int carpim = sayi1 * sayi2;
    System.out.println("Toplamları = " + toplam);
    System.out.println("Çarpımları = " + carpim);
  }
}
