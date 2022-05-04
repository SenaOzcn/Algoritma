// Kullanıcıdan 1-12 arasında bir değer alarak, aldığı değerlerin karşılığı olan ay adını ekrana yazdıran program...

import java.util.*;

class Aylar {
  public static void main(String args[]) {
    String[] aylar = new String[] {"Ocak" , "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
    String girilen = "";
    String ayAdi = "Ocak";
    System.out.print("Ay no : ");
    Scanner scanner = new Scanner(System.in);
    int ayNo = Integer.valueOf(scanner.nextLine());
    ayAdi = aylar[ayNo - 1];
    System.out.println(ayAdi);
  }
}
