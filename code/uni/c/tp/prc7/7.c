#include <stdio.h>
#include <stdlib.h>

float factorial(float numero);
float enesimo(float numero, int exponente);
void fibonacci(float numero, float aux1, float aux2);
char menu(char opcion);

void main(){
  char opcion;
  // while(menu(opcion) != '0'){
  do{
    printf("\n");
    printf("1.\tFactorial\n");
    printf("2.\tN-eneismo\n");
    printf("3.\tFibonacci\n");
    printf("0.\tSalir\n");
    printf("Elige una una funcion:");
  }while(menu(opcion) != '0');
  // }
}
float factorial(float numero){
  if(numero>1){
    numero = numero * factorial(numero-1);
  }
  else numero = numero * 1;
  return numero;
}
float enesimo(float numero, int exponente){
  if(exponente!=0){
    numero = numero * enesimo(numero, exponente-1);
  }else numero = 1;
  return numero;
}
void fibonacci(float numero, float aux1, float aux2){
  float siguiente = aux1;
  if(numero >= 0){
    printf("%.0f ",siguiente);
    siguiente = aux1 + aux2;
    aux1 = aux2;
    aux2 = siguiente;
    fibonacci(numero-1, aux1, aux2);
  }
}
char menu(char opcion){
  float numero;
  int exponente;
  scanf(" %c", &opcion); //si dejas un espacio en el formato char; este te dice
                          //a scanf que no recoja ni el espacio ni enter
  fflush(stdin);
  switch (opcion) {
    case '1': //Factorial
    printf("\n1.Factorial\n");
    printf("Factorial de ");
    do{
      scanf("%f", &numero);
    }while(numero < 0 && numero > 20);
    printf("= %.0f\n", factorial(numero));
    break;
    case '2':
    printf("\n2.N-eneismo\n");
    printf("Numero ");
    scanf("%f", &numero);
    printf("elevado a ");
    do{
      scanf("%d", &exponente);
    }while(exponente < 0 && exponente > 20);
    printf("= %.0f\n", enesimo(numero, exponente));

    break;
    case '3':
    printf("\n3.Fibonacci\n");
    do{
      scanf("%f", &numero);
    }while(numero < 0 && numero > 20);
    fibonacci(numero, 0, 1);
    printf("\n");
    break;
  }
  return opcion;
}
