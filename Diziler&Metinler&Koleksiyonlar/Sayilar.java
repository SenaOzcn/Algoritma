// Kullanıcıdan 10 adet sayı alıp, aldığı sayıları sırasıyla ekrana yazdıran program...

import java.util.*;

class Sayilar {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int[] sayilar = new int[11];
    String girilen = "";
    int sayi = 0;
    int x = 0;
    System.out.println("10 adet sayı giriniz : ");
    for (x = 0; x < 10; x++) {
      sayi = scanner.nextInt();
      sayilar[x] = sayi;
    }
    System.out.println();
    System.out.println("Girdiğiniz sayılar ");
    for (x = 0; x < 10; x++) {
      System.out.println(sayilar[x]);
    }
  }
}
