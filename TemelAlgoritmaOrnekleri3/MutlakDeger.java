// Ekrana girilen iki sayının farkını(pozitif, yani mutlak değer olarak) ekrana yazdıran program...

import java.util.*;

class MutlakDeger {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı1 => ");
    int sayi1 = Integer.valueOf(scanner.nextLine());
    System.out.print("Sayı2 => ");
    int sayi2 = Integer.valueOf(scanner.nextLine());
    int sonuc = sayi1 - sayi2;
    System.out.println("Sonuç " + Math.abs(sonuc));
  }
}
