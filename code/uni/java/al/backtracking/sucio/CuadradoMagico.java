public class CuadradoMagico{
  private int N;
  private int[][] cuadrado;
  private boolean[] numeros;
  private int numMagico;
  public CuadradoMagico(){
    // int n = 1;
    // for(int i = 0; i <= cuadrado.length-1; i++){
    //   for(int j = 0; j <= cuadrado[i].length-1; j++){
    //     cuadrado[i][j] = n;
    //     n++;
    //     System.out.print(cuadrado[i][j]);
    //     if(cuadrado[i][j]<10) System.out.print("  ");
    //     else System.out.print(" ");
    //   }
    //   System.out.println();
    // }
    N = 3;
    cuadrado = new int[N][N];
    numeros  = new boolean[N*N];
    numMagico = N*(N*N+1)/2;
    Booleano exito;
    exito.setValor(false);
    resolverCuadrado(cuadrado, 0, 0, exito);
  }
  public void resolverCuadrado(int[][] cuadrado, int fila, int columna, Booleano exito){
    int nuevaFila;
    int nuevaColumna;
    do{
      for(int i = 0; i < N; i++){
        if(!colocado[i]){
          cuadrado[fila][columna] = i+1;
          colocado[i] = true;
        }
        nuevaColumna = columna + 1;
        nuevaFila = fila;
        if(columna == cuadrado.length){
          nuevaFila++;
          nuevaColumna = 0;
        }
      }
      if(!esSolucion(cuadrado, fila, columna))
       resolverCuadrado(cuadrado, fila, columna, exito);
    }while(!exito.getValor());
    // do{
    //   boolean seguir = 1;
    //   for(int i = 0; i < cuadrado.length-1; i++){
    //     for(int j = 0; j < cuadrado.length-1; j++){
    //       seguir = esSolucion(cuadrado, i, j);
    //       else{
    //         if(!seguir)(buscarSolucion(cuadrado, i, j))
    //
    //       }
    //         for(int jk = j+1; jk < cuadrado.length-1; jk++){
    //           cuadrado[i][j] = cuadrado[ik][jk]
    //           seguir = esSolucion(cuadrado, i, j)
    //       }
    //     }
    //   }
    // }while((!exito.getValor()) && (terminado(cuadrado)));  }
  }
  public int buscarSolucion(int[][] cuadrado, int i, int j){
    boolean seguir = false;
    int ik = i+1;
    if(ik == cuadrado.length)  ik = 0;
    int jk = j+1;
    if(ik == cuadrado.length)  ik = 0;
    while((ik != i) && (!seguir)){
      cuadrado[i][j] = cuadrado[ik][jk];
      seguir = esSolucion(cuadrado, i, j);
      ik++;
      if(ik == cuadrado.length)  ik = 0;
    }
    while((jk < cuadrado.length-1) && (!seguir)){
      cuadrado[i][j] = cuadrado[ik][jk];
      seguir = esSolucion(cuadrado, i, j);
      jk++;
      if(jk == cuadrado.length)  ik = 0;
    }
    return cuadrado;
  }
  public static void main(String[] args) {
    CuadradoMagico c = new CuadradoMagico();
  }
  public int sumarFila(int[][] cuadrado, int fila){
    int suma = 0;
    for(int i = 0; i < cuadrado.length-1; i++)
    suma = suma + cuadrado[fila][i];
    return suma;
  }
  public int sumarColumna(int[][] cuadrado, int columna){
    int suma = 0;
    for(int i = 0; i < cuadrado.length-1; i++)
    suma = suma + cuadrado[i][columna];
    return suma;
  }
  public boolean esSolucion(int[][] cuadrado, int fila, int columna){
    int i = 0;
    int j = 0;
    boolean correcto;
    while((i < cuadrado.length-1) && (correcto)){
      while((j < cuadrado.length-1) && (correcto)){
        if(sumarFila(cuadrado, i) == sumarColumna(cuadrado, j))
          correcto = true;
        else correcto = false;
        j++;
      }
    }
    return correcto;
  }
    // boolean correcto;
    // correcto = (sumarFila(cuadrado, fila) == sumarColumna(cuadrado, columna));
    // return correcto;
}
