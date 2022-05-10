  // Kullanıcının tavla oyunundaki zar atışının benzeşimini gerçekleştirerek, atılan zarı ekrana yazdıran program...

import java.util.Random;

class RasgeleSayi {
  public static void main(String args[]) {
    Random rasgele = new Random();
    int zar1 = 0, zar2 = 0;
    zar1 = rasgele.nextInt(5) + 1;
    zar2 = rasgele.nextInt(5) + 1;
    System.out.println(zar1 + " - " + zar2);
  }
}
