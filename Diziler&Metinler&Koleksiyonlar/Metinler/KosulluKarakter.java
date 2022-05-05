//Klavyeden girilen bir metnin üçüncü karakterinden başlayarak 5 karakteri ekrana yazdıran program... 
// Eğer karakter sayısı 8'den azsa, kullanıcıya "Girilen metnin uzunluğu en az 8 karakter olmalıdır" mesajı verilsin.

import java.util.*;

class KosulluKarakter {
  public static void main(String args[]) {
    String metin = "", yeniMetin = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Metin girin : ");
    metin = scanner.nextLine();
    if (metin.length() >= 8) {
      yeniMetin = metin.substring(3,5);
    } else {
      System.out.println("Girilen metnin uzunluğu en az 8 karakter olmalıdır!");
    }
    System.out.println(yeniMetin);
  }
}
