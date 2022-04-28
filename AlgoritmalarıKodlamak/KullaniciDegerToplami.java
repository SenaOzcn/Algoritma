// Kullanıcıdan alınan 2 değeri toplayan program

import java.util.Scanner;

class KullaniciDegerToplami{
  public static void main(String[] Args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("birinci sayıyı giriniz : ");
     int a = Integer.valueOf(scanner.nextLine());
     System.out.print("ikinci sayıyı giriniz : ");
     int b = Integer.valueOf(scanner.nextLine());
     int c = a + b;
     System.out.println("Girmiş olduğunuz iki sayının toplamı : " + c);
  }
}
