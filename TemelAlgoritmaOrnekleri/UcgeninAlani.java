// Kullanıcıdan taban ve yüksekliği alınan üçgenin alanını hesaplama...

import java.util.Scanner;

class UcgeninAlani {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Taban uzunluğu = ");
    double tabanUzunlugu = Double.valueOf(scanner.nextLine());
    System.out.print("Yükseklik = ");
    double yukseklik = Double.valueOf(scanner.nextLine());
    double alan = tabanUzunlugu * yukseklik;
    System.out .println("Girmiş olduğunuz üçgenin alanı = " + alan);
  }
}
