import java.util.Scanner;

public class Prueba{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Cuadrado magico de orden:");
    int orden = scan.nextInt();
    Backtracking cuadradoMagico = new Backtracking(orden);
  }
}
