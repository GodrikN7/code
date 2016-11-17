/*
Realizar un programa en lenguaje C, que lea desde el teclado un número
representado en numeración romana, de forma correcta, y lo muestre en pantalla
en formato decimal. El número se leerá como una secuencia de caracteres que
termina en punto, se sabe que el número está libre de errores y todos los
caracteres están escritos en mayúscula y de forma correcta.
*/
#include <stdio.h>
#include <stdlib.h>

void main() {
  int numero = 0, digito = 0, digitoAnt = 0;
  char letra;
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
    default:  digito = 0;
  }
  digitoAnt = digito;
  numero = digito;
  while(letra != '.'){ //625, 1262, 2446
    fflush(stdin);
    scanf("%c", &letra);
    fflush(stdin);
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
      default:  digito = 0;
      }
    printf("%d\n", digitoAnt);
    printf("%d\n", digito);
    if(digitoAnt >= digito){
      printf("%d + %d = ", numero, digito);
      numero = numero + digito;
      printf("%d\n", numero);
      digitoAnt = digito;
    }
    else if(digitoAnt < digito){
      printf("%d + %d - (2*%d) = ", numero, digito, digitoAnt);
      numero = numero + digito - (2*digitoAnt);
      printf("%d\n", numero);
      digitoAnt = digitoAnt;
    }
  }

  printf("%d", numero);
}
