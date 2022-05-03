// Kullanıcıdan sırasıyla başlangıç, bitiş ve artış değerlerini alarak, başlangıçtan bitişe kadar artış değerinde artarak saydırıp ekrana yazdıran program...

import java.util.*;

class BaslangicBitisArtis {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Başlangıç değerini giriniz : ");
    int baslangic = Integer.valueOf(scanner.nextLine());
    System.out.print("Bitiş değerini giriniz : ");
    int bitis = Integer.valueOf(scanner.nextLine());
    System.out.print("Artış değerini giriniz : ");
    int artis = Integer.valueOf(scanner.nextLine());
    for (int i = baslangic; i <= bitis; i+=artis) {
      System.out.println(i);
    }
  }
}
