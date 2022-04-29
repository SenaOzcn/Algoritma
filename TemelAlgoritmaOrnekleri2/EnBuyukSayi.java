// Klavyeden girilen 5 tane sayının en büyüğünü bularak ekrana yazdıran program...

import java.util.*;

class EnBuyukSayi {
  public static void main(String[] Args) {
    int enBuyuk = 0;
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= 5; i++) {
      System.out.print(i + ". sayı = ");
      int sayi = Integer.valueOf(scanner.nextLine());
      if (sayi > enBuyuk) {
        enBuyuk = sayi;
      }
    }
    System.out.println("En Büyük Sayı = " + enBuyuk);
  }
}
