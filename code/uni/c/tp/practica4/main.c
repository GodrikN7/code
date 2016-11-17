#include <stdio.h>
#include <stdlib.h>

void main() {
  int numero = 0, digito = 0, digitoAnt = 0;
  char letra;
  int seguir;
  FILE *fichero;
  fichero = fopen("romanos.txt", "r");
  if(!fichero){
        printf("El fichero no se ha abierto correctamente\n");
  }
  else{
    while(!feof(fichero)){
      fscanf(fichero, "%c", &letra);
      switch (letra) {
        case 'M': digito = 1000;
        break;
        case 'D': digito = 500;
        break;
        case 'C': digito = 100;
        break;
        case 'L': digito = 50;
        break;
        case 'X': digito = 10;
        break;
        case 'V': digito = 5;
        break;
        case 'I': digito = 1;
        break;
        default:  digito = 0;
      }
      digitoAnt = digito;
      numero = digito;
      while(letra != '\n'){
        fscanf(fichero, "%c", &letra);
        switch (letra) {
          case 'M': digito = 1000;
          break;
          case 'D': digito = 500;
          break;
          case 'C': digito = 100;
          break;
          case 'L': digito = 50;
          break;
          case 'X': digito = 10;
          break;
          case 'V': digito = 5;
          break;
          case 'I': digito = 1;
          break;
          default:  digito = 0;
        }
        if(digitoAnt >= digito){
          numero = numero + digito;
        }
        else if(digitoAnt < digito){
          numero = numero + digito - (2*digitoAnt);
        }
        digitoAnt = digito;
      }
      printf("%d\n", numero);
    }
  fclose(fichero);
  }
}
