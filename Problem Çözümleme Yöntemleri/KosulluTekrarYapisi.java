// Kullanıcıdan sayı alarak, aldığı sayılardan tek olanları toplama ekleyip çift olanları toplamdan çıkartan bir uygulama yazın.
// Uygulama toplam 100 olduğunda ya da 100'ü geçtiğinde
// Kullanıcı rakam girmeden Enter tuşuna bastığında ya da kullanıcının girdiği rakam 0 ise sonlansın
// Girilen sayıların sonucunu ekrana yazdırsın.

import java.util.*;
import java.util.Random;

class KosulluTekrarYapisi {
  public static void main(String args[]) {
    int toplam = 0 sayi = 0;
    String girilen = "";
    Random rasgele = new Random();
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Bir sayı girin = ");
      girilen = scanner.nextLine();
      if (girilen.equals("")) {
        break;
      }
      sayi = Integer.parseInt(girilen);
      if (sayi == 0) {
        break;
      }
      if (sayi %2 == 0) {
        toplam = toplam - girilen;
      } else {
        toplam = toplam + girilen;
      }
      if (toplam >= 100) {
        break;
      }
    } while (true);
    System.out.println("Toplam = " + toplam);
  }
}
