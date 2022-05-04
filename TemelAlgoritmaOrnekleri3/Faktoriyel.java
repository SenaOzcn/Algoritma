// Klavyeden girilen bir sayının hangi sayının faktöriyeli olduğunu bularak ekrana yazdıran program...

import java.util.*;

class Faktoriyel {
  public static void main(String args[]) {
      int x = 1, i = 1;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Sayı => ");
      int sayi = Integer.valueOf(scanner.nextLine());
      for (i = 1; i <= sayi; i++) {
         x = x * i;
      }
      System.out.println(x + " = " + sayi + "!");
  }
}
