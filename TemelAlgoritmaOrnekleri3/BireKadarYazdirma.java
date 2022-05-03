// Kullanıcıdan bir sayı alıp, aldığı bu sayıdan 1'e kadar tersten sayarak ekrana yazdıran program...

import java.util.*;

class BireKadarYazdirma {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("Sayı => ");
      int sayi = Integer.valueOf(scanner.nextLine());
      for (int i = sayi; i >= 1; i--) {
        System.out.println(i);
      }
  }
}
