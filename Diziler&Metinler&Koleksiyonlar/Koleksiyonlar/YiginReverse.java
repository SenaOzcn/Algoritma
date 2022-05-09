// Klavyeden girilen metnin karakterini tersten sıralı olarak alt alta ekrana yazdıran program...

import java.util.*;
import java.util.Stack;

class YiginReverse {
  public static void main(String args[]) {
    Stack harfler = new Stack();
    int i = 0;
    String metin = "";
    String harf = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bir metin girin : ");
    metin = scanner.nextLine();
    for (i = 0; i < metin.length(); i++) {
      harf = metin.substring(i,i+1);
      harfler.push(harf);
    }
    for (i = 0; i < harfler.size(); i++) {
      System.out.println(harfler.pop());
    }
  }
}
