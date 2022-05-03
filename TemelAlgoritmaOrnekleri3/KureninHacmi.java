// Yarıçapı verilen kürenin hacmini hesaplayarak ekrana yazdıran program...

import java.util.*;

class KureninHacmi {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Yarıçapı giriniz : ");
    double r = Double.valueOf(scanner.nextLine());
    double v = Math.PI * (Math.pow(r, 3)) * (4 / 3);
    System.out.println("Yarıçapı " + r + " olan bir kürenin hacmi " + v + " olarak hesaplanır.");
  }
}
