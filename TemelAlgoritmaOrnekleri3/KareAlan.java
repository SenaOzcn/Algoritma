// Kullanıcıdan bir kenarı alınan karenin alanını hesaplayarak ekrana yazdıran program...

import java.util.*;

class KareAlan {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("a => ");
    double a = Double.valueOf(scanner.nextLine());
    System.out.println("Alan = " + (Math.pow(a, 2)));
  }
}
