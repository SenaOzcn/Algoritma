// Kullanıcıdan yaşını alıp, girilen değer 65'e eşitse ya da 65'ten büyükse ekrana "Emekli olabilirsiniz.", girilen değer 65'ten küçükse "Emekliliğinize x yıl var." yazan program...

import java.util.*;

class Emeklilik {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Yaşınızı girin = ");
    int yas = Integer.valueOf(scanner.nextLine());
    if (yas >= 65) {
      System.out.println("Emekli olabilirsiniz.");
    } else {
      System.out.println("Emekliliğinize " +  (65 - yas) + " yıl var.");
    }
  }
}
