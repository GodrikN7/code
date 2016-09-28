// figuras.c
#include <stdio.h>

#define base    10       * 1  //equilatero
#define altura  (base/2) * 1

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
  int opcion, seguir;
  char caracter = 'X';
  do{
    printf("./1 - Cuadrado\n");
    printf("./2 - Triangulo\n");
    scanf("%d", &opcion);
    triangulo(caracter);
    printf("\n");
    cuadrado(caracter);
    if(opcion == 1) cuadrado(caracter);
    else if(opcion == 2) triangulo(caracter);
    else printf("Opcion incorrecta\n" );
    //mejor hacerlo con switch statement
    /*
    switch (opcion) {
     case 1:
       cuadrado(caracter);
     case 2:
       triangulo(caracter);
         default :
       printf("Opcion incorrecta\n");
    }
    */
    printf("\nDesea seguir Sr. Godrik? \n");
    scanf ("%d", &seguir);
  }while(seguir);
}
