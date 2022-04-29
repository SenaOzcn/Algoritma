// Katsayıları verilen birinci dereceden bir denklemin köklerini hesaplayarak ekrana yazdıran

import java.util.*;

class BirinciDerecedenDenklem {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("X'in katsayısı = ");
    double a = Double.valueOf(scanner.nextLine());
    System.out.print("b değeri = ");
    double b = Double.valueOf(scanner.nextLine());
    double X = -b / a;
    System.out.println("X = " + X);
  }
}
