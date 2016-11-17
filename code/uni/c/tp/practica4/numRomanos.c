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
    if(digitoAnt >= digito){
      numero = numero + digito;
    }
    else if(digitoAnt < digito){
      numero = numero + digito - (2*digitoAnt);
      digitoAnt = digitoAnt;
    }
    digitoAnt = digito;
  }

  printf("%d", numero);
}
