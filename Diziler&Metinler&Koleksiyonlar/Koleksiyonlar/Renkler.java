// Klavyeden girilen Türkçe bir rengin İngilizce karşılığını ekrana yazdıran program...
// Sözlük başlangıçta 5 Türkçe rengin İngilizce karşılığı yüklü olarak çalışacaktır.
// Sözlükte karşığı olmayan bir kelime girildiğinde, kullanıcıya bu kelimenin sözlükte bulunmadığı bir mesajla iletilir.

import java.util.*;
import java.util.Hashtable;

class Renkler {
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      Hashtable renkler = new Hashtable();
      String turkcesi = "", ingilizcesi = "";
      renkler.put("beyaz", "white");
      renkler.put("kirmizi", "red");
      renkler.put("mavi", "blue");
      renkler.put("siyah", "black");
      renkler.put("sari", "yellow");
      System.out.print("Renk ? ");
      turkcesi = scanner.nextLine();
      if (renkler.containsKey(turkcesi) == true) {
        ingilizcesi = renkler.get(turkcesi).toString();
        System.out.println(ingilizcesi);
      } else {
        System.out.println("Renk bulunamadı.");
      }
  }
}
