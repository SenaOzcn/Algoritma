// Girilen bir sayıyı, değerinin iki katı kadar sayıda tekrar edecek şekilde ekrana yazdıran program...

import java.util.*;

class SayiTekrari {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı => ");
    double sayi = Double.valueOf(scanner.nextLine());
    for (int i = 1; i <= sayi * 2; i++) {
      System.out.println(sayi);
    }
  }
}
