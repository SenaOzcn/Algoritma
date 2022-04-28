// Kullanıcıdan alınan değerlerle dikdörtgenin çevre ve alanının hesaplanması...

class Dikdortgen {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("A kenarının uzunluğu = ");
    double a = Double.valueOf(scanner.nextLine());
    System.out.print("B kenarının uzunluğu = ");
    double b = Double.valueOf(scanner.nextLine());
    double cevre = a * b;
    double alan = 2 * (a + b);
    System.out.println("Girmiş olduğunu dikdörtgenin çevresi = " + cevre);
    System.out.println("Girmiş olduğunuz dikdörtgenin alanı = " + alan);
  }
}
