// Escriba un programa en C que lea tres enteros (a, b, c) y muestre por
// pantalla un 1 si los valores introducidos siguen un orden creciente (a>b>c)
// y 0 en caso contrario.
#include <stdio.h>
void main(){
  int a, b, c;
  printf("\na = ");
  scanf ("%d", &a);

  printf("\nb = ");
  scanf ("%d", &b);

  printf("\nc = ");
  scanf ("%d", &c);

  printf("%d\n", (a < b)&&(b < c));

}
