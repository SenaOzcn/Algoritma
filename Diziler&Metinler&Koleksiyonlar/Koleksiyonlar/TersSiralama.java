// Klavyeden girilen n tane kelimeyi alarak tersten sıralayıp, ekrana yazdıran program...

import java.util.*;
import java.util.ArrayList;

class TersSiralama {
  public static void main(String args[]) {
    ArrayList kelimeler = new ArrayList();
    String karakter = "";
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Kelime girin : ");
      karakter = scanner.nextLine();
      kelimeler.add(karakter);
    } while (!karakter.equals(""));
    Collections.reverse(kelimeler);
    System.out.println("Girmiş olduğunuz karakterlerin ters sıralanışı : ");
    for (i = 0; i < kelimeler.size(); i++) {
      System.out.println(kelimeler.get(i));
    }
  }
}
