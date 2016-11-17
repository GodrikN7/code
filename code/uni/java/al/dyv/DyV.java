import java.util.Scanner;
public class DyV{
  public DyV(int[][] matriz, int elemento){
    if(buscarElem(matriz, elemento))
      System.out.println("Elemento " + elemento + " encontrado en la matriz");
    else System.out.println("Elemento " + elemento + " NO encontrado en la matriz");
  }
  public boolean buscarElemAux(int[][] matriz, int f0, int fN, int c0, int cN, int elemento, Booleano encontrado){
    int pivoteF;
    int pivoteC;
    if((f0 >= fN) && (c0 >= cN)){
      encontrado.setValor(matriz[f0][c0] == elemento || matriz[fN][cN] == elemento);
      return encontrado.getValor();
    }
    else{                             //en el caso peor 4 submatrices y busca en 3 de las luego 3 * T(N/2)
      pivoteF = ((f0+fN)/2) + 1;
      pivoteC = ((c0+cN)/2) + 1;
      if(pivoteF > matriz.length-1)     pivoteF = pivoteF-1;
      if(pivoteC > matriz[0].length-1)  pivoteC = pivoteC-1;

      if ((matriz[pivoteF-1][pivoteC-1] >= elemento) && !(encontrado.getValor()))
        encontrado.setValor(buscarElemAux(matriz, f0, pivoteF-1, c0, pivoteC-1, elemento, encontrado));

      if ((matriz[pivoteF-1][cN] >= elemento) && !(encontrado.getValor()))
        encontrado.setValor(buscarElemAux(matriz, f0, pivoteF-1, pivoteC, cN, elemento, encontrado));

      if ((matriz[fN][pivoteC-1] >= elemento) && !(encontrado.getValor()))
        encontrado.setValor(buscarElemAux(matriz, pivoteF, fN, c0, pivoteC-1, elemento, encontrado));

      if ((matriz[fN][cN] >= elemento) && !(encontrado.getValor()))
        encontrado.setValor(buscarElemAux(matriz, pivoteF, fN, pivoteC, cN, elemento, encontrado));

      return encontrado.getValor();
    }
  }
  public boolean buscarElem(int[][] matriz, int elemento){
    Booleano encontrado = new Booleano(false);
    return buscarElemAux(matriz, 0, matriz.length-1, 0, matriz[0].length-1, elemento, encontrado);
  }
}
