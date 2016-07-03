#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 15

void inicializar1(char matriz[N][N]);
void inicializar2(char matriz[N][N]);
void inicializar3(char matriz[N][N]);

void imprimir(char matriz[N][N]);

int triangular(char matriz[N][N]);
int simetrica(char matriz[N][N]);

void main(){
  char matriz[N][N] = {0};
  int opcion;
  srand(time(NULL));
  opcion = rand() % 3 + 1;
  printf("Opcion = %d \n", opcion);
  switch (opcion){
    case 1:
    inicializar1(matriz);
    break;
    case 2:
    inicializar2(matriz);
    break;
    case 3:
    inicializar3(matriz);
    break;

    default:
    printf("error\n");
  }
  // if (opcion == 1) inicializar1(matriz);
  // if (opcion == 2) inicializar2(matriz);
  // if (opcion == 3) inicializar3(matriz);

  imprimir(matriz);

  if (triangular(matriz))
    printf("\n\nLa matriz tiene triangular superior\n");
  else printf ("\n\nLa matriz no tiene triangular superior\n");

  if (simetrica(matriz))
    printf("\nLa matriz es simetrica\n");
  else printf ("\nLa matriz no es simetrica\n");


}

void inicializar1(char matriz[N][N]){
  int i, j;
  for (i = 0; i < N; i++)
    for (j = 0; j < N; j++){
      matriz[i][j] = rand() % 26 + 'A';
    }
}

void inicializar2(char matriz[N][N]){
  int i, j;
  for (i = 0; i < N; i++)
    for (j = 0; j < N; j++){
      if (i > j)
        matriz[i][j] = ' ';
      else matriz[i][j] = rand() % 26 + 'A';
    }
}

void inicializar3(char matriz[N][N]){
  int i, j;
  for (i = 0; i < N; i++)
    for (j = 0; j < N; j++){
      if (i == j)
        matriz[i][j] = ' ';
      else matriz[i][j] = 'A';
    }
}

void imprimir(char matriz[N][N]){
  int i, j;
  for (i = 0; i < N; i++)
    for (j = 0; j < N; j++){
      if (j == 0)
        printf("\n");
      printf("%c ", matriz[i][j]);
    }
}

int triangular(char matriz[N][N]){
  int encontrado = 0;
  int i, j;
  for (i = 0; i < N; i++)
    for (j = 0; j < N; j++){
      if ( (i > j) && (matriz[i][j] == ' ') )
        encontrado = 1;
    }
    return encontrado;
}

int simetrica(char matriz[N][N]){
  int encontrado = 0, cont = 0;
  int i, j;
  for (i = 0; i < N; i++)
    for (j = 0; j < N; j++){
      if ( (matriz[i][j] == matriz[j][i]) )
        cont++;
    }
  if (cont == (N*N))
    encontrado = 1;
  return encontrado;
}
