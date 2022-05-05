/* Klavyeden girilen bir metni aşağıdaki örnekteki gibi ekrana yazdıran algoritmayı tasarlayın.
Örnek kelime : Algoritma
A
Al
Alg
Algo
Algor
Algori
Algorit
Algoritm
Algoritma 
*/

import java.util.*;

class ArtarakAltAltaYazdirma {
  public static void main(String args[]) {
    String metin = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Metin girin : ");
    metin = scanner.nextLine();
    for (int i = 1; i <= metin.length(); i++) {
      System.out.println(metin.substring(0,i));
    }
  }
}
