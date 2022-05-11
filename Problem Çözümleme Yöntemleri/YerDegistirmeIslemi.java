// Bir dizinin elemanlarını ters çevirerek ekrana yazdıran program...

class YerDegistirmeIslemi {
  public static void main(String args[]) {
    int sayi = 0, hedef = 0, gecici = 0;
    int[] dizi = {1, 2, 3, 4};
    hedef = (dizi.length / 2) - 1;
    for (int i = 0; i <= hedef; i++) {
      gecici = dizi[dizi.length - 1 - i];
      dizi[dizi.length - 1 - i] = dizi[i];
    }
    for (int i = 0; i <= dizi.length - 1; i++) {
      System.out.println(dizi[i]);
    }
  }
}
