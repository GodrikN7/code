/*
Introducimos por teclado, en una única línea, una secuencia de valores enteros
que finaliza con el valor 0 (este valor no forma parte de la secuencia, s
olo marca su finalización). La secuencia está formada por subsecuencias de
valores  consecutivos (subsecuencia ascendente en la que cada valor es igual a
su anterior + 1).

 Realiza un programa que escriba una línea por cada subsecuencia con el valor
  inicial de la subsecuencia y entre paréntesis su longitud. Si la secuencia es
  vacía se debe escribir un mensaje indicándolo

Ejemplo:
Si la entrada que se introduce es:
0
El programa imprimirá:
Secuencia vacia

 Si la entrada que se introduce es:
21    31  32  33  34  35  36  45  46 47  48 455  1721 2345 0
El programa imprimirá:
21 (1)
31 (6)
45 (4)
455 (1)
1721(1)
2345 (1)
*/
#include <stdio.h>

void main(){
  int actual, anterior, contador = 1;
  scanf("%d", &actual);
  while(actual != 0){

      anterior = actual;
      scanf("%d", &actual);
      if(anterior + 1 == actual){
        contador++;
      }
      else{
        printf("%d (%d)\n", anterior - (contador - 1), contador);
        contador = 1;
      }
  }
}
