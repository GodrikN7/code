//cuadrado.c
#include <stdio.h>

#define base 10 * 1

void cuadrado(char caracter){
  int i, j;
  for(i = 0; i <= base; i++){
    printf("%c", caracter);
  }
  for(j = 0; j < base/2; j++){
    printf("\n%c", caracter);
    for(i = 0; i <= base-2; i++){
      printf(" ");
    }
    printf("%c", caracter);
  }
  printf("\n");
  for(i = 0; i <= base; i++){
    printf("%c", caracter);
  }
}

void main(){
  char caracter = 'X';
  // printf("que caracter quieres usar para construir el cuadrado?\n");
  // scanf("%c", &caracter);
  // printf("\n");
  cuadrado(caracter);
  printf("\n");
}
