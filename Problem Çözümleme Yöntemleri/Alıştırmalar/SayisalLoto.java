// Sayısal loto için rasgele sayılarla loto kuponu hazırlayan program...

import java.util.*;
import java.util.Random;

class SayisalLoto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Kaç kolon oynayacaksınız ? (1/8) ");
    int kolonsayisi = scanner.nextInt();
    int[][] kolon = new int[8][6];
    for (int i = 0; i < kolonsayisi; i++) {
      for (int j = 0; j < 6; j++) {
        Random rnd = new Random();
        int sayi = 1 + rnd.nextInt(49);
        if (sayi!= kolon[i][j]) {
          kolon[i][j] = sayi;
        }
      }
    }
    System.out.println("Oynanan kolonlar : ");
    for (int i = 0; i < kolonsayisi; i++) {
      System.out.println("");
      for (int j = 0; j < 6; j++) {
        System.out.print(kolon[i][j] + " ");
      }
    }
  }
}
