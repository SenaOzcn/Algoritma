// İnç cinsinden verilen bir uzunluğun santimetre cinsinden karşılığını bulan program...

import java.util.*;

class InctenCm {
  public class void main(String[] Args) {
    Scanner  scanner = new Scanner(System.in);
    System.out.print("Uzunluk (inç) = ");
    double iUzunluk = Double.valueOf(scanner.nextLine());
    double cmUzunluk = iUzunluk * 2.54;
    System.out.println("Uzunluk (CM) = " + cmUzunluk);
  }
}
