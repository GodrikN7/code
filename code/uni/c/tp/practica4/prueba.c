/*
Realizar un programa en lenguaje C, que lea desde el teclado un número
representado en numeración romana, de forma correcta, y lo muestre en pantalla
en formato decimal. El número se leerá como una secuencia de caracteres que
termina en punto, se sabe que el número está libre de errores y todos los
caracteres están escritos en mayúscula y de forma correcta.
*/
#include <stdio.h>

void main() {
  int numero = 0, digito = 0, digitoAnt = 0;
  char letra;
  int M = 1000, D = 500, C = 100, L = 50, X = 10, V = 5,  I = 1;
  do{
    scanf("%c", &letra);
    switch (letra) {
      case 'M': digito = 1000;
      break;
      case 'D': digito =  500;
      break;
      case 'C': digito =  100;
      break;
      case 'L': digito =   50;
      break;
      case 'X': digito =   10;
      break;
      case 'V': digito =    5;
      break;
      case 'I': digito =    1;
      break;
    }
  }while(letra != '.');
    printf("%d", digito);
  }
