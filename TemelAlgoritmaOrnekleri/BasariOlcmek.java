// 100 üzerinden 70 başarı notuyla, kullanıcının girdiği nota göre başarılı olup olmadığını gösteren program...

import java.util.*;

class BasariOlcmek {
  public class void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Not = ");
    double not = Double.valueOf(scanner.nextLine());
    if (not >= 70) {
      System.out.println("Sonuç = Başarılı");
    } else {
      System.out.println("Sonuç = Başarısız");
    }
  }
}
