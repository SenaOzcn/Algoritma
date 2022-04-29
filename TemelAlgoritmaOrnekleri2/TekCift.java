// 1'den 10'a kadar olan sayıları, yanlarına tek/çift yazdırılarak ekranda gösteren program...

class TekCift {
  public static void main(String[] Args) {
    for (int i = 1; i <= 10; i++) {
      if (i %2 == 0) {
        System.out.println(i + " Çift");
      } else {
        System.out.println(i + " Tek");
      }
    }
  }
}
