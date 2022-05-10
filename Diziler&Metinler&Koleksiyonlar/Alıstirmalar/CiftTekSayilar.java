// Verilen bir dizideki elemanları ayırarak, tek ve çift sayılar için iki ayrı diziye kopyalayın.

import java.util.*;

class CiftTekSayilar {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      System.out.print ("Kaç adet sayı girineceksiniz ? : ");
      int sayi_adeti = Integer.valueOf(scanner.nextLine());
      int[] Sayilar = new int[sayi_adeti + 1];
      int[] CiftSayilar = new int[sayi_adeti + 1];
      int[] TekSayilar = new int[sayi_adeti + 1];
      for (int i = 0; i < sayi_adeti; i++) {
        System.out.print("Bir sayi girin = ");
        int sayi = Integer.valueOf(scanner.nextLine());
        Sayilar[i] = sayi;
        if (sayi %2 == 0) {
          CiftSayilar[i] = sayi;
          System.out.print(CiftSayilar[i] + "\t");
        } else {
          TekSayilar[i] = sayi;
          System.out.print(TekSayilar[i] + "\t");
        }
      }
      System.out.println();
      System.out.println("Girdiğiniz sayılar : ");
      for (int i = 0; i < sayi_adeti; i++) {
        System.out.print(Sayilar[i] + "\t");
      }
      System.out.println();
      System.out.println("Girmiş olduğunuz çift sayılar : ");
      for (int i = 0; i < sayi_adeti; i++) {
        System.out.print(CiftSayilar[i] + "\t");
      }
      System.out.println();
      System.out.println("Girmiş olduğunuz tek sayılar : ");
      for (int i = 0; i < sayi_adeti; i++) {
        System.out.print(TekSayilar[i] + "\t");
      }
    } 
}
