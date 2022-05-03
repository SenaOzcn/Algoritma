// Deniz mili cinsinden verilen bir mesafenin kilometre cinsinden karşılığını bularak ekrana yazdıran program...

import java.util.*;

class MilKm {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Deniz mili cinsinden mesafesiyi giriniz : ");
    double mesafeMil = Double.valueOf(scanner.nextLine());
    double mesafeKm = mesafeMil * 1.852;
    System.out.println("Deniz mili cinsinden verilen " + mesafeMil + " mesafenin kilometre cinsinden karşılığı : " + mesafeKm);
  }
}
