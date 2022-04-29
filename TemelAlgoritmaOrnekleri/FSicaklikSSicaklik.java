// Fahrenhayt'tan Santigrat'a dönüştüren porgram...

import java.util.*;

class FSicaklikSSicaklik {
  publis static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sıcaklık (F) = ");
    double F_Sicaklik = Double.valueOf(scanner.nextLine());
    double S_Sicaklik = (F_Sicaklik - 32) / 1.8;
    System.out.println("Sıcaklık (C) = " + S_Sicaklik);
  }
}
