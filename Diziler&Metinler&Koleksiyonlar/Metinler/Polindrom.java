// Klavyeden girilen bir metnin palindrom olup olmadığını ekrana yazdıran program...

import java.util.*;

class Polidrom {
  public static void main(String args[]) {
    String metin = "", tersMetin = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Metin girin : ");
    metin = scanner.nextLine();
    for (int i = metin.length() - 1; i >= 0; i += -1) {
      tersMetin = tersMetin + metin.substring(i,i + 1);
    }
    if (metin.equals(tersMetin)) {
      System.out.println("POLINDROM !");
    } else {
      System.out.println("Polindrom değil.");
    }
  }
}
