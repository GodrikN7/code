#include <stdio.h>

int main(){
  int entero1, entero2;
  char car;
  printf("Introducir un numero entero: \n");
  scanf("%d", &entero1);

  printf("Introducir un numero entero\n");
  scanf("%d", &entero2); //variable mal declarada no es lo mismo entero2 que Entero2

  car = 'a'; //para asignar un valor a un tipo char se usa ' '

  //printf("El caracter es %d\n", car); // %d es para tipo entero y car es de tipo caracter
  printf("El caracter es %c\n", car);

  printf("%c %c %c\n", car, car-1, car+1);
  //printf("%d %d %d\n", car, car-1, car+1); // %d es para tipo entero y car es de tipo caracter

  printf("La suma del entero y el caracter es: %d\n", entero1+car); // no se puede operar dos tipos de datos distintos
  printf("La division es: %d\n", entero2/0); //no se puede dividir un entero/0 (infinito), funcion esta mal escrita es printf
}
/*
errores de compilacion
*/
