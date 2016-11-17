import java.util.Scanner;

public class Prueba{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int matriz[][] = {
      {1,3,6,9,12,20},
      {4,7,12,13,15,21},
      {5,10,13,14,16,22},
      {6,12,14,15,17,23}
    };
    imprimir(matriz);
    System.out.println("Elemento: ");
    int elemento = scan.nextInt();
    DyV prueba = new DyV(matriz, elemento);
  }
  public static void imprimir(int[][] matriz){
    for(int i = 0; i <= matriz.length-1; i++){
      for(int j = 0; j <= matriz[i].length-1; j++){
        System.out.print(matriz[i][j]);
        if(matriz[i][j]<10) System.out.print("  ");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
