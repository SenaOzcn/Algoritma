// 10 kişilik bir isim listesi içerisinden çekiliş yaparak birinci, ikinci ve üçüncü talihliyi belirleyip ekrana yazdıran program...

import java.util.*;
import java.util.Random;
import java.util.ArrayList;

class Cekilis {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    ArrayList katilimcilar = new ArrayList();
    System.out.print("Sayı1 => ");
    int sayi1 = scanner.nextInt();
    System.out.print("Sayı2 => ");
    int sayi2 = scanner.nextInt();
    System.out.print("Sayı3 => ");
    int sayi3 = scanner.nextInt();
    System.out.print("Sayı4 => ");
    int sayi4 = scanner.nextInt();
    System.out.print("Sayı5 => ");
    int sayi5 = scanner.nextInt();
    System.out.print("Sayı6 => ");
    int sayi6 = scanner.nextInt();
    System.out.print("Sayı7 => ");
    int sayi7 = scanner.nextInt();
    System.out.print("Sayı8 => ");
    int sayi8 = scanner.nextInt();
    System.out.print("Sayı9 => ");
    int sayi9 = scanner.nextInt();
    System.out.print("Sayı10 => ");
    int sayi10 = scanner.nextInt();
    Random rasgele = new Random();
    int endeks = 0, i = 0;
    String[] kazananlar = new String[3];
    for (i = 0; i <= 2; i++) {
      endeks = rasgele.nextInt(katilimcilar.size() - 1);
      kazananlar[i] = katilimcilar.get(endeks).toString();
      katilimcilar.remove(endeks);
    }
    for (i = 0; i <= 2; i++) {
      System.out.println(i + 1 + ". talihli : " + kazananlar[i]];
    }
  }
}
