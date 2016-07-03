// TRES EN RAYA

#include <stdio.h>
#include <stdlib.h>

#define N 3

void hacer(char tablero[N][N]);
void imprimir(char tablero[N][N]);
int movCorrecto(char tablero[N][N], int i, int j);
int jaqueMate(char tablero[N][N]);
void adyacentes(char tablero[N][N], int f, int c);


void main(){
  int i, j, i_j1, j_j1, i_j2, j_j2;
  char tablero[N][N];
  char j1, j2;
    j1 = 'X', j2 = 'O';
  int numero, correcto, turno, acabar;
    turno = 1, acabar = 0;
  hacer(tablero);
  while((!acabar) && (turno < 2*N)){
    printf("\n\n");
    imprimir(tablero);

    printf("\nTurno %d\n", turno);
    printf("Jugador 1 (%c) \n", j1);
    printf("Posicion: ");
    do{
      scanf("%d", &numero);
      fflush(stdin);
      i_j1 = (numero / 10) - 1;
      j_j1 = (numero % 10) - 1;

      correcto = movCorrecto(tablero, i_j1, j_j1);
      printf("\n");
    }while(!correcto);
    tablero[i_j1][j_j1] = 'X';
    imprimir(tablero);

    printf("Jugador 2 (%c) \n", j2);
    printf("Posicion: ");
    do{
      scanf("%d", &numero);
      fflush(stdin);
      i_j2 = (numero / 10) - 1;
      j_j2 = (numero % 10) - 1;

      printf("\n");
      correcto = movCorrecto(tablero, i_j2, j_j2);
      printf("\n");
      if(turno == 5)
        correcto = 1;
    }while(!correcto);
    tablero[i_j2][j_j2] = 'O';

    if (jaqueMate(tablero))
      acabar = 1;
    else turno++;
  }
}

void hacer(char tablero[N][N]){
  int i, j;
  for (i = 0; i < N; i++){
    for (j = 0; j < N; j++){
      tablero[i][j] = '_';
    }
  }
}
void imprimir(char tablero[N][N]){
  int i, j;
  for (i = 0; i < N; i++){
    for (j = 0; j < N; j++){
      printf ("%c \t", tablero[i][j]);
    }
    printf("\n");
  }
}
int movCorrecto(char tablero[N][N], int i, int j){
  int resul;
  if(tablero[i][j] == 'X' || tablero[i][j] == 'O'){
    printf("movimiento incorrecto\n");
    resul = 0;
  }
  else resul = 1;

  return resul;
}

void adyacente(char tablero[N][N], int f, int c){
  int i, j;
  int f_ant, f_sig, c_ant, c_sig;
  if(f == 0){
    f_ant = f;
    f_sig = f+2;
  }
  else if(f == N-1){
    f_ant = f - 2;
    f_sig = f;
  }
  else{
    f_ant = f - 2;
    f_sig = f + 2;
  }
  //COLUMNAS
  if(c == 0){
    c_ant = c;
    c_sig = c + 2;
  }
  else if(c == N-1){
    c_ant = c - 2;
    c_sig = c;
  }
  else{
    c_ant = c - 2;
    c_sig = c + 2;
  }
  charImportante = tablero[f_ant][c_ant];
  //si 3 adyacentes - > acabar
//IMPRIMIR
  for(i = f_ant; i <= f_sig; i++){
    for(j = c_ant; j <= c_sig; j++){
      if(charImportante == tablero[i][j])
        cont++;
    }
    if(cont == 2)
    cont = 0;
  }
}
int jaqueMate(char tablero[N][N]){
  int i, j, c, f;
  int f_ant, f_sig, c_ant, c_sig;
  int cont, resul;
    cont = 0, resul = 0;
  char charImportante, ganador;
  for(f = 0; f < N; f++){
    for(c = 0; c < N; c++){
      if(tablero[f][c] != '_')
        adyacente(tablero, f, c);
    }
  }
  return resul;
}
//       //si 3 adyacentes - > acabar
//       if(tablero[f_ant][c_ant] != '_'){
//           charImportante = tablero[f_ant][c_ant];
//             for (i = f_ant; i <= f_sig; i++){
//               for (j = c_ant; j <= c_sig; j++){
//                 if(charImportante == tablero[f_sig][c_sig]){
//                   cont++;
//                 if (cont == 2){
//                   resul = 1;
//                   charImportante = ganador;
//                 }
//               }
//             }
//           }
//         }
//         if(resul)
//           printf("El ganador es %c !!!", ganador);
//         return resul;
