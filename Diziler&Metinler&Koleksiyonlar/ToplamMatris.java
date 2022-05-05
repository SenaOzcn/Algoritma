// 2x3'lük iki matrisi toplayan ve sonucu ekrana yazdıran program...

class ToplamMatris {
  public static void main(String args[]) {
    int[][] birinciMatris = new int[][] {{2,3,4}, {5,4,3}};
    int[][] ikinciMatris = new int[][] {{6,2,7}, {2,9,8}};
    int[][] toplamMatris = new int[2][3];
    int i = 0, j = 0;
    for (i = 0; i <= 1; i++) {
      for (j = 0; j <= 2; j++) {
        toplamMatris[i][j] = birinciMatris[i][j] + ikinciMatris[i][j];
      }
    }
    System.out.println("Toplam matris");
    for (i = 0; i <= 1; i++) {
      for (j = 0; j <= 2; j++) {
        System.out.print(toplamMatris[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
