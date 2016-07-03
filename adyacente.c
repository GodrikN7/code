#include <stdio.h>
#include <stdlib.h>

#define N 5

void adyacente(int matriz[N][N], int f, int c);
void main(){
  int i, j, seguir, fila, columna;
  int matriz[N][N];
  do{
    for (i = 0; i < N; i++)
      for (j = 0; j < N; j++)
        matriz[i][j] = rand() % 9 + 0;

    for (i = 0; i < N; i++){
      for (j = 0; j < N; j++){
        printf("%d ", matriz[i][j]);
      }
      printf("\n");
    }

    printf("Calcular adyacente de: \nFila: ");
    scanf("%d", &fila);
    fflush(stdin);

    printf("\nColumna: ");
    scanf("%d", &columna);
    fflush(stdin);

    adyacente(matriz, fila, columna);

    printf("\nDesea seguir Sr. Godrik?\n");
    scanf("%d", &seguir);
  }while(seguir);
}
void adyacente(int matriz[N][N], int f, int c){
  int i, j;
  int f_ant, f_sig, c_ant, c_sig;
//FILAS
  if(f == 0){
    f_ant = f;
    f_sig = f+1;
  }
  else if(f == N-1){
    f_ant = f - 1;
    f_sig = f;
  }
  else{
    f_ant = f - 1;
    f_sig = f + 1;
  }
//COLUMNAS
  if(c == 0){
    c_ant = c;
    c_sig = c+1;
  }
  else if(c == N-1){
    c_ant = c - 1;
    c_sig = c;
  }
  else{
    c_ant = c - 1;
    c_sig = c + 1;
  }
//IMPRIMIR
for (i = f_ant; i <= f_sig; i++){
  for (j = c_ant; j <= c_sig; j++){
    printf("%d ", matriz[i][j]);
  }
  printf("\n");
}
}
