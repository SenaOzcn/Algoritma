// Kullanıcıdan 5 adet sayı alarak, bu sayıların çarpımını ekrana yazdıran program

import java.util.*;

class BesSayiCapimi {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı1 => ");
    int sayi1 = Integer.valueOf(scanner.nextLine());
    System.out.print("Sayı2 => ");
    int sayi2 = Integer.valueOf(scanner.nextLine());
    System.out.print("Sayı3 => ");
    int sayi3 = Integer.valueOf(scanner.nextLine());
    System.out.print("Sayı4 => ");
    int sayi4 = Integer.valueOf(scanner.nextLine());
    System.out.print("Sayı5 => ");
    int sayi5 = Integer.valueOf(scanner.nextLine());
    int carpim = sayi1 * sayi2 * sayi3 * sayi4 * sayi5;
    System.out.println("Girmiş olduğunuz sayıların çarpımı = " + carpim);
  }
}
