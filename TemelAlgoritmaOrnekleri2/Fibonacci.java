// Fibonaççi dizisinin ilk 10 sayısını hesaplayarak ekrana yazdıran program...

class Fibonacci {
  public static void main(String[] Args) {
    int yeniSayi = 0, sayi1 = 0, sayi2 = 1;
    for (int i = 3; i <= 10; i++) {
      yeniSayi = sayi1 + sayi2;
      System.out.println(yeniSayi);
      sayi1 = sayi2;
      sayi2 = yeniSayi;
    }
  }
}
