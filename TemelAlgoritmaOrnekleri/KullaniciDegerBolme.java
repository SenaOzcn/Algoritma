// Kullanıcıdan alınan iki sayının bölme işlemi...

import java.util.Scanner;

class KullaniciDegerBolme {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bölünecek sayıyı giriniz : ");
    double sayi1 = Double.valueOf(scanner.nextLine());
    System.out.print("Bölen sayısını giriniz : ");
    double sayi2 = Double.valueOf(scanner.nextLine());
    double bolum = sayi1 / sayi2;
    System.out.println("Bölme sonucu = " + bolum);
  }
}
