// Yarıçapı verilen dairenin çevresi ve alanının hesaplanması...

import java.util.*;

class DaireninCevresiAlani {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Yarıçap = ");
    double r = Double.valueOf(scanner.nextLine());
    double PI = Math.PI;
    double cevre = 2 * PI * r;
    double alan = PI * Math.pow(r, 2);
    System.out.println("Dairenin çevresi = " + cevre);
    System.out.println("Dairenin alanı = " + alan);
  }
}
