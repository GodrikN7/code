// opcional) Escribir un programa en C que calcule cuántas monedas de cada clase
// (2 euros, 1 euro y 0.5 euros) debe utilizar una máquina expendedora,
// por ejemplo de refrescos,  para devolver un cambio.
//
// El programa leerá el importe del cambio que se debe devolver e imprimirá
// cuántas monedas de cada clase se necesitarían para realizarlo con el menor
// número de monedas.

#include <stdio.h>

void main(){
  float dos, uno, medio;
    dos   = 2.0;
    uno   = 1.0;
    medio = 0.5;
  float importe = 7.5, metido, cambio;

  printf("Importe: %.2f€\n", importe);
  printf("Metido: ");
  scanf("%f", &metido);

  printf("Cambio:\n");
  cambio = metido - importe;



  while(cambio > 0){
    while(cambio >= dos){
      printf("2€\n");
      cambio = cambio - dos;
    }
    while(cambio >= uno){
      printf("1€\n");
      cambio = cambio - uno;
    }
    while (cambio >= medio){
      printf("0.5€\n");
      cambio = cambio - medio;
    }
  }




}
