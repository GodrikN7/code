#include <stdio.h>

void main(){
  int actual, anterior, contador = 1;
  scanf("%d", &actual);
  if(actual == 0){
    printf("Secuencia vacia\n");
  }
  else{
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
}
