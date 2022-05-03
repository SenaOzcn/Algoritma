// Klavyeden girilen 10 tane sayının en küçüğünü bularak ekrana yazdıran program...

import java.util.*;
import java.util.Collections;

class Siralama {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      List list = new ArrayList();
      System.out.print("Sayı1 => ");
      int sayi1 = Integer.valueOf(scanner.nextLine());
      list.add(sayi1);
      System.out.print("Sayı2 => ");
      int sayi2 = Integer.valueOf(scanner.nextLine());
      list.add(sayi2);
      System.out.print("Sayı3 => ");
      int sayi3 = Integer.valueOf(scanner.nextLine());
      list.add(sayi3);
      System.out.print("Sayı4 => ");
      int sayi4 = Integer.valueOf(scanner.nextLine());
      list.add(sayi4);
      System.out.print("Sayı5 => ");
      int sayi5 = Integer.valueOf(scanner.nextLine());
      list.add(sayi5);
      System.out.print("Sayı6 => ");
      int sayi6 = Integer.valueOf(scanner.nextLine());
      list.add(sayi6);
      System.out.print("Sayı7 => ");
      int sayi7 = Integer.valueOf(scanner.nextLine());
      list.add(sayi7);
      System.out.print("Sayı8 => ");
      int sayi8 = Integer.valueOf(scanner.nextLine());
      list.add(sayi8);
      System.out.print("Sayı9 => ");
      int sayi9 = Integer.valueOf(scanner.nextLine());
      list.add(sayi9);
      System.out.print("Sayı10 => ");
      int sayi10 = Integer.valueOf(scanner.nextLine());
      list.add(sayi10);

      Collections.sort(list);
      System.out.println(list);
   }
      
}
