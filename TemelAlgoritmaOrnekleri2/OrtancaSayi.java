// Klavyeden girilecek X adet sayının aritmetik ortalamasını bularak ekrana yazdıran program... 
// (X sayısı kullanıcıdan alınacaktır.)

import java.util.*;

class OrtancaSayi {
  public static void main(String[] Args) {
    int toplam = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ortalaması alınacak sayı adeti : ");
    int sayiAdeti = Integer.valueOf(scanner.nextLine());
    for (int i = 1; i <= sayiAdeti; i++) {
      System.out.println(i + ".sayı = ");
      int sayi = Integer.valueOf(scanner.nextLine());
      toplam +=  sayi;
    }
    System.out.println("Ortalama = " + (toplam / sayiAdeti));
  }
}
