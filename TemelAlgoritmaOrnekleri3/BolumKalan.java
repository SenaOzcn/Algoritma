// Girilen iki sayıdan birincisini ikincisine bölerek, bölüm ve kalanı ekrana yazdıran program...

import java.util.*;

class BolumKalan {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı1 => ");
    int sayi1 = Integer.valueOf(scanner.nextLine());
    System.out.print("Sayı2 => ");
    int sayi2 = Integer.valueOf(scanner.nextLine());
    double bolum = sayi1 / sayi2;
    double kalan = sayi1 % sayi2;
    System.out.println("Girdiğiniz sayıların bölümü = " + bolum + " kalanı = " + kalan);
  }
}
