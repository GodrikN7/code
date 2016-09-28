#include <stdio.h>

int main(){
  int anio;
  int aNac;

  printf("Escribe el anio actual\n");
  scanf("%d", &aNac);

  printf("Escribe el anio de tu nacimiento\n");
  scanf("%d", &anio);

  printf("En anio cuples los %d\n", aNac-anio);

}
