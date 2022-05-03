// Kullanıcıdan bir sayı alarak, aldığı sayının 6 ile tam olarak bölünüp bölünmediğini ekrana yazdıran program...

import java.util.*;

class AltiyaTamBolunebilme {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı => ");
    int sayi = Integer.valueOf(scanner.nextLine());
    double mod = sayi %6;
    if (mod == 0) {
      System.out.println(sayi + " 6'ya tam olarak bölünebilir.");
    } else {
      System.out.println(sayi + " 6'ya bölümünden kalan " + mod + "'dır.");
    }
  }
}
