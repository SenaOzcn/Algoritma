// Yarıçapı ve yüksekliği alınan koninin hacmini bulan program...

import java.util.*;

class KonininHacmi {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Yarıçapı = ");
    double r = Double.valueOf(scanner.nextLine());
    System.out.print("Yükseklik = ");
    double PI = Math.PI;
    double h = Double.valueOf(scanner.nextLine());
    double hacim = PI * Math.pow(r, 2) / h;
    System.out.println("Değerleri verilen koninin hacmi = " + hacim);
  }
}
