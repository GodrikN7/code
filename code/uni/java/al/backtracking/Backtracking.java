public class Backtracking{
  private int orden;
  private int[][] cuadrado;
  private boolean[] colocado;           //corresponde con los numeros de la matriz cuadrado colocados(candidatos)
  private int numMagico;
  
  public Backtracking(int orden){
    this.orden = orden;
    cuadrado = new int[orden][orden];       //inicializado a 0 por defecto (el valor de la casilla sin numero asignado)
    colocado  = new boolean[orden*orden];  //inicializado a todo false (ningun numero colocado)
    numMagico = orden*(orden*orden+1)/2;  //valor que deben sumar filas, columanas y diagonales
    Booleano exito = new Booleano(false);
    cuadradoMagico(cuadrado, 0, 0, exito); //inicializo el Backtracking
  }
  public void cuadradoMagico(int[][] cuadrado, int fila, int columna, Booleano exito){
    int i = 0;
    do{
      if(!colocado[i]){                 //candidato aceptable si colocado[i] = false, numero todavia sin asignar
        cuadrado[fila][columna] = i+1;  //anota
        colocado[i] = true;             //marca numero i+1 como asignado

        if(todosColocados()){           //si estan todos colocado(todo el array de colocados a true)
          if(esSolucion(cuadrado)){     //mira si es solucion
            exito.setValor(true);       //si es solucion lo apunta e imprime el cuadrado Magico
            System.out.println("Solucion de Cuadrado magico de orden " + orden + " :");
            imprimir(cuadrado);
          }
        } else {                       // si no estan todos colocados seguir anotando
          if(columna != orden - 1)
            cuadradoMagico(cuadrado, fila, columna+1, exito);
          else if(fila != orden - 1)
            cuadradoMagico(cuadrado, fila+1, 0, exito);
        }
        //si estan todos colocados y no es solucion entonces vuelta atras
        if(!exito.getValor()){
          cuadrado[fila][columna] = 0;  //desanotar
          colocado[i] = false;
        }
      }
      i++;
    }while(i < orden*orden && !exito.getValor());

  }

  public boolean todosColocados(){
    //estan todos colocados cuando ningun miembro del array es false
    for(int i = 0; i < colocado.length; i++){
      if(!colocado[i])
        return false;
    }
    return true;
  }

  public boolean esSolucion(int[][] cuadrado){
    boolean resul = true;
    //primero comprueba si todas las filas y columanas suman el numero magico
    for(int i = 0; i < orden-1; i++){
      if( sumarFila(i) != numMagico ) resul = false;
      if( sumarColumna(i) != numMagico) resul = false;
    }
     //si va bien, mira por ultimo las diagonales
    if(resul){
      if( (sumarDiagonalPrincipal() != numMagico) && (sumarDiagonalSecundaria() != numMagico))
        resul = false;
    }
    return resul;
  }

  public int sumarFila(int fila){
    int suma = 0;
    //suma una fila
    for(int i = 0; i < orden; i++)
      suma = suma + cuadrado[fila][i];
    return suma;
  }

  public int sumarColumna(int columna){
    int suma = 0;
    //suma una columna
    for(int i = 0; i < orden; i++)
      suma = suma + cuadrado[i][columna];
    return suma;
  }

  public int sumarDiagonalPrincipal(){
    int diagonalPrincipal = 0;
    //suma la diagonalPrincipal
    for(int i = 0; i < orden - 1; i++)
        diagonalPrincipal = diagonalPrincipal + cuadrado[i][i];
    return diagonalPrincipal;
  }

  public int sumarDiagonalSecundaria(){
    int diagonalSecundaria = 0;
    //suma la diagonalSecundaria
    for(int j = orden - 1; j >= 0; j--)
      diagonalSecundaria = diagonalSecundaria + cuadrado[j][j];
    return diagonalSecundaria;
  }

  public void imprimir(int[][] matriz){
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
