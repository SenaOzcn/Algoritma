// 1'den 100'e kadar olan sayma sayılarının toplamını yazdıran Java Programı.

class BirdenYuzeKadarSayilarinToplami {
 public static void main(String[] Args) {
  int toplam = 0, x = 0;
   for (x = 1; x <= 100; x++) {
      toplam += x;
   }
   System.out.println(toplam);
 }
}
