//Editar, compilar y ejecutar un programa C, que lea una fecha en formato
//dd/mm/aaaa y la escriba en formato dd-mm-aa, observar que el año en pantalla
//se muestra únicamente con dos dígitos y no CON cuatro como en la entrada.
//Ejemplo, para la entrada: 18/2/2010  en pantalla se mostraría: 18-2-10
#include <stdio.h>

void main(){
  int dia, mes, anio;
  printf("Dia:");
  scanf("%d", &dia);

  printf("Mes:");
  scanf("%d", &mes);

  printf("Anio:");
  scanf("%d", &anio);

  printf("\n%d-%d-%d\n", dia, mes, anio%100);
}
