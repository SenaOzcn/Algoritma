// Girilen bir sayının faktöriyelini hesaplayarak ekrana yazdıran program...

import java.util.*;

class Faktoriyel {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bir sayı giriniz : ");
    int sayi = Integer.valueOf(scanner.nextLine());
    int faktoriyel = 1;
    for (int i = sayi; i >= 1; i--) {
      faktoriyel *= sayi;
    }
    System.out.println(sayi + "! = " + faktoriyel);
  }
}
