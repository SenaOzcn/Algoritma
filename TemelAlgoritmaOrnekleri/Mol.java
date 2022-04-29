// Klavyeden kütlesi ve molekül ağırlığı girilen maddenin mol sayısını hesaplayarak ekrana yazdıran program...

import java.util.*;

class Mol {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Kütle = ");
    double kutle = Double.valueOf(scanner.nextLine());
    System.out.print("Molekül Ağırlığı = ");
    double molekulAgirligi = Double.valueOf(scanner.nextLine());
    double mol = kutle / molekulAgirligi;
    System.out.println("Mol Sayısı = " + mol);
  }
}
