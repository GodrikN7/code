//casa.c
#include <stdio.h>

#define base    10
#define altura  5

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

  printf("\n");
}

void triangulo(char caracter){
  int i, j;
  int restar = altura, espacios = 0;
  while(restar > 0){
    for(i = 0; i < restar; i++)
      printf(" ");
    restar--;
    printf("%c", caracter);
    if(espacios > 0){
      for(j = 0; j < espacios; j++){
        printf(" ");
      }
      printf("%c", caracter);
      espacios = espacios + 2;
    }else espacios = 1;
    printf("\n");
  }

  for(i = 0; i <= (espacios+1); i++){
    printf("%c", caracter);
  }

  printf("\n");
}

void main(){
  char caracter = 'X';
  int veces;
    veces = rand() % 10;

  triangulo(caracter);
  for(veces = 0; veces < 2; veces++)
    cuadrado (caracter);

  printf("\n");

}
