// Kelvin olarak verilmiş bir sıcaklık değerini santigrada dönüştürerek ekrana yazdıran program...

import java.util.*;

class KelvinSantigrat {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Kelvin (k) cinsinden sıcaklığı giriniz : ");
    double k = Double.valueOf(scanner.nextLine());
    double c = k - 273.15;
    System.out.println("Girmiş olduğunuz " + k + " kelvin sıcaklık değerinin santigrat değeri = " + c + "C");
  }
}
