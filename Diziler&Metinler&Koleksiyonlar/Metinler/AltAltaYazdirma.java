// Klavyeden girilen bir metnin karakterlerini alt alta ekrana yazdıran program...

import java.util.*;

class AltAltaYazdirma {
  public static void main(String args[]) {
    String metin = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Metin girin : ");
    metin = scanner.nextLine();
    for (int i = 0; i < metin.length(); i++) {
      System.out.println(metin.substring(i,i+1));
    }
  }
}
