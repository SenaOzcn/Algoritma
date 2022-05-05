// Klavyeden girilen bir metnin karakterini büyük harfe çevirerek ekrana yazdıran program...

import java.util.*;

class BuyukHarfeDonusturme {
  public static void main(String args[]) {
    String metin = "", yeniMetin = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Metin girin : ");
    metin = scanner.nextLine();
    yeniMetin = metin.toUpperCase();
    System.out.println(yeniMetin);
  }
}
