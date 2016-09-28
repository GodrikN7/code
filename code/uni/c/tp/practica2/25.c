/*
5. Realizar un programa en C que introduzca tres valores numéricos por teclado:
-el precio de unos pantalones (dato real)
-el tanto por ciento de descuento (dato entero)
-la cantidad que se quiere comprar, e imprima el precio unitario con el
descuento aplicado (dato real con dos cifras decimales) y el precio total a
pagar (dato real con un decimal).
*/
#include <stdio.h>

void main(){
  int cantidad, descuento;
  float precio;
  printf("Introduce los siguientes valores:\n");
  printf("Precio de los pantalones(dato real):");
  scanf("%f", &precio);

  printf("Descuento: ");
  scanf("%d", &descuento);

  printf("Cantidad que se quiere comprar(dato entero):");
  scanf("%d", &cantidad);

  printf("\n");

  printf("El precio de cada pantalon es: %0.2f\n", (precio/100) * (100-descuento));
  printf("El importe total es: %0.1f\n", cantidad * (precio/100) * (100-descuento));

}
