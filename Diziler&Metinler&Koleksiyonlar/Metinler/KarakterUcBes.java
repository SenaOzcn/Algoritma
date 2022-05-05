// Klavyeden girilen bir metnin üçüncü karakterinden başlayarak 5 karakteri ekrana yazdıran program...

import java.util.*;

class KarakterUcBes {
  public static void main(String args[]) {
    String metin = "", yeniMetin = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Metin girin : ");
    metin = scanner.nextLine();
    yeniMetin = metin.substring(3,5);
    System.out.println(yeniMetin);
  }
}
