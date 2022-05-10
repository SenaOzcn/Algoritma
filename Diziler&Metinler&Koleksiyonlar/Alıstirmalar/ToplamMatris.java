// Eşit uzunluktaki iki dizinin aynı endeksli elemanlarını toplayarak yeni bir diziye kopyalayın.

class ToplamMatris {
    public static void main(String args[]) {
      int[][] BirinciMatris = new int[][] {{1, 4, 2, 3}, {3, 4, 7, 9}, {2, 1, 8, 7}};
      int[][] IkinciMatris = new int[][] {{4, 1, 3, 2}, {2, 1, -2, -4}, {3, 4, -3, -2}};
      int[][] ToplamMatris = new int[3][4];
      for (int i = 0; i <= 2; i++) {
        for (int j = 0; j <= 3; j++) {
          ToplamMatris[i][j] = BirinciMatris[i][j] + IkinciMatris[i][j];
        }
      }
      System.out.println("Toplam matris : ");
      for (int i = 0; i <= 2; i++) {
        for (int j = 0; j <= 3; j++) {
          System.out.print(ToplamMatris[i][j] + "\t");
        }
        System.out.println();
      }
    } 
}
