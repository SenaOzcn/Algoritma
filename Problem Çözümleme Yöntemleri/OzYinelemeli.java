// Klavyeden girilen bir sayının faktöriyelini özyinelemeyle çözerek ekrana yazdıran program...

import java.util.*;

class OzYinelemeli {
  public static void main(String[] args) {
    int sayi = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Faktöriyeli bulunacak sayıyı girin = " );
    sayi = scanner.nextInt();
    System.out.println(FaktoriyelHesapla(sayi));
  }
  public static int FaktoriyelHesapla(int sayi) {
    if (sayi > 1) {
      return sayi * FaktoriyelHesapla(sayi - 1);
    } else {
      return 1;
    }
  }
}
