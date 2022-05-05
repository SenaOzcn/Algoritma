// 2x3'lük sıfır matrisi oluşturan ve matrisi ekrana yazdıran program...

class SifirMatris {
  public static void main(String args[]) {
    int[][] sifirMatrisi = new int[2][3];
    int satir = 0, sutun = 0;
    for (satir = 0; satir < 2; satir++) {
      for (sutun = 0; sutun < 3; sutun++) {
        sifirMatrisi[satir][sutun] = 0;
      }
    }
    for (satir = 0; satir < 2; satir++) {
      for (sutun = 0; sutun < 3; sutun++) {
        System.out.print("\t" + sifirMatrisi[satir][sutun]);
      }
      System.out.println();
    }
  }
}
