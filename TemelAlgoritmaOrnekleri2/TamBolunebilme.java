// Girilen iki sayıdan ilkinin ikincisine tam bölünüp bölünmediğini bularak sonucu ekrana yazan program...

import java.util.*;

class TamBolunebilme {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı1 => ");
    double sayi1 = Double.valueOf(scanner.nextLine());
    System.out.print("Sayı2 => ");
    double sayi2 = Double.valueOf(nextLine());
    double mod = sayi1 % sayi2;
    if (mod == 0) {
      System.out.println("Sayı1 Sayı2'ye tam bölünür.");
    } else {
      System.out.println("Sayı1 Sayı2'ye tam bölünemez.");
    }
  }
}
