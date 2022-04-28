// Kullanıcıdan yaşını alıp, yaş 18 ve büyükse ekrana "Reşitsiniz!" yazısını, değilse "Reşit değilsiniz..." yazdıran Java Programı...

import java.util.Scanner;

class Resitlik {
  public static void main(String[] Args) {
    // Kullanıcıdan bilgi almak için Scanner kullanılır.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Yaşınız ? : ");
    int yas = Integer.valueOf(scanner.nextLine());
    
    if (yas >= 18) {
      System.out.println("Reşitsiniz!");
    } else {
      System.out.println("Reşit değilsiniz...");
    }
  }
}
