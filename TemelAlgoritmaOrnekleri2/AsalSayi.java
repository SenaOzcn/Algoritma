// Klavyeden girilen bir sayının asal sayı olup olmadığını ekrana yazdıran program...

import java.util.*;

class AsalSayi {
  public static void main(String[] Args) {
    boolean kontrol = true;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı => ");
    int sayi = Integer.valueOf(scanner.nextLine());
    for (int i = 2; i<= sayi - 1; i++) {
      if (sayi %i == 0) {
        kontrol = false;
      }
    }
    if (kontrol == true) {
        System.out.println("Sayı asaldır.");
     } else {
        System.out.println("Sayı asal değildir.");
    }
  }
}
