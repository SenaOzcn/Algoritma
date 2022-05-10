// Verilen 4x4'lük iki matrisin çarpımını bulan program...

class CarpimMatris {
    public static void main(String args[]) {
      int[][] BirinciMatris = new int[][] {{2, 4, 6, 8}, {1, 3, 5, 7}, {1, 2, 3, 4}, {9, 8, 7, 6}};
      int[][] IkinciMatris = new int[][] {{9, 8, 7, 6}, {1, 2, 3, 4}, {1, 3, 5, 7}, {2, 4, 6, 8}};
      int[][] CarpimMatris = new int[4][4];
      for (int i = 0; i <= 3; i++) {
        for (int j = 0; j <= 3; j++) {
          CarpimMatris[i][j] = BirinciMatris[i][j] * IkinciMatris[i][j];
        }
      }
      System.out.println("Çarpım matris : ");
      for (int i = 0; i <= 3; i++) {
        for (int j = 0; j <= 3; j++) {
          System.out.print(CarpimMatris[i][j] + "\t");
        }
        System.out.println();
      }
    } 
}
