import java.util.Scanner;

public class DyV{
  public DyV(){
    Scanner scan = new Scanner(System.in);
    int matriz[][] = {
      {1,3,6,99,12,20},
      {4,7,12,13,15,21},
      {5,10,13,14,16,22},
      {6,12,14,15,17,23}
    };
    for(int i = 0; i <= matriz.length-1; i++){
      for(int j = 0; j <= matriz[i].length-1; j++){
        System.out.print(matriz[i][j]);
        if(matriz[i][j]<10) System.out.print("  ");
        else System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("Elemento: ");
    int elemento = scan.nextInt();
    if(contiene(matriz, elemento))
      System.out.println("Elemento " + elemento + " encontrado en la matriz");
    else System.out.println("Elemento " + elemento + " NO encontrado en la matriz");
  }
  public boolean contiene(int[][] matriz, int elemento){
    Booleano encontrado = new Booleano(false);
    return contieneAux(matriz, 0, matriz.length-1, 0, matriz[0].length-1, elemento, encontrado);
  }
  public boolean contieneAux(int[][] matriz, int f0, int fN, int c0, int cN, int elemento, Booleano encontrado){
    int pivoteF;
    int pivoteC;
    System.out.println("f0 fN c0 cN");
    System.out.println(f0 +"  "+fN +"  "+c0 +"  "+cN);
    for(int i = f0; i <= fN; i++){
      for(int j = c0; j <= cN; j++){
        System.out.print(matriz[i][j]);
        if(matriz[i][j]<10) System.out.print("  ");
        else System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println();


    if((f0 >= fN) && (c0 >= cN)){
      encontrado.setValor(matriz[f0][c0] == elemento || matriz[fN][cN] == elemento);                          //este es el caso en el que no se puede dividir mas el array
      return encontrado.getValor();
    }
    if (encontrado.getValor() == true){
      return encontrado.getValor();
    }
    else{
      pivoteF = ((f0+fN)/2) + 1;         //+ 1 es para en la dividir la funcion no llame a pase pivoteF+1
      pivoteC = ((c0+cN)/2) + 1;         //
      if(pivoteF > matriz.length-1)     pivoteF = pivoteF-1;  //para que no se salga de matriz al buscar por los extremos
      if(pivoteC > matriz[0].length-1)  pivoteC = pivoteC-1;

      if (matriz[pivoteF][pivoteC] == elemento){
        encontrado.setValor(true);
      }
      if ((matriz[pivoteF-1][pivoteC-1] >= elemento) && !(encontrado.getValor())){
        System.out.println("1");
        encontrado.setValor(contieneAux(matriz, f0, pivoteF-1, c0, pivoteC-1, elemento, encontrado));
        // return encontrado.getValor();
      }
      if ((matriz[pivoteF-1][cN] >= elemento) && !(encontrado.getValor())){
        System.out.println("2");
        encontrado.setValor(contieneAux(matriz, f0, pivoteF-1, pivoteC, cN, elemento, encontrado));
        // return encontrado.getValor();

      }
      if ((matriz[fN][pivoteC-1] >= elemento) && !(encontrado.getValor())){
        System.out.println("3");
        encontrado.setValor(contieneAux(matriz, pivoteF, fN, c0, pivoteC-1, elemento, encontrado));
        // return encontrado.getValor();
      }
      if ((matriz[fN][cN] >= elemento) && !(encontrado.getValor())){
        System.out.println("4");
        encontrado.setValor(contieneAux(matriz, pivoteF, fN, pivoteC, cN, elemento, encontrado));
        // return encontrado.getValor();
      }
      return encontrado.getValor();
    }
  }

  public static void main(String[] args) {
    DyV p = new DyV();
  }
}
