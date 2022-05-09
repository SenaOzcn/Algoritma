// Klavyeden girilen n tane kelimeyi alarak tersten sıralayıp, ekrana yazdıran algoritmayı tasarlayın.
// Aynı kelime listede sadece bir kez yer almalıdır.

import java.util.*; 
import java.util.ArrayList;

class TekrarsizTersSiralama {
  public static void main(String args[]) {
        String karakter = "";
        int i = 0;
        ArrayList kelimeler = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        do {
          System.out.print("Bir kelime girin : ");
          karakter = scanner.nextLine();
          if (kelimeler.contains(karakter) == false) {
            kelimeler.add(karakter);
          } 
        }  while (!karakter.equals(""));
          kelimeler.remove("");
          Collections.reverse(kelimeler);
          System.out.println();
          System.out.println("Girmiş olduğunuz karakterlerin ters sıralanışı : ");
          for (i = 0; i < kelimeler.size(); i++) {
            System.out.println(kelimeler.get(i));
          }
  }
}
