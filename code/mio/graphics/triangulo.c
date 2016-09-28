//triangulo.c
#include <stdio.h>

#define base    10       * 1  //equilatero
#define altura  (base/2) * 1

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
}
void main(){
  char caracter = 'X';
  triangulo(caracter);
  printf("\n");
}
