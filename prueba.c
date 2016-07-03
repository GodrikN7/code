#include<stdio.h>
#include<stdlib.h>

void main(){
  struct fechaDeNacimento {
      int dia;
      int mes;
      int anio;

      // == int dia, mes, anio;
  };

  struct fechaDeNacimento rodrigo;

  rodrigo.dia = 28;
  rodrigo.mes = 7;
  rodrigo.anio = 1997;

  printf("%d/%d/%d \n", rodrigo.dia, rodrigo.mes, rodrigo.anio);

  struct fechaDeNacimento papa = {
    24,
    6,
    1959
  };
  printf("%d/%d/%d \n", papa.dia, papa.mes, papa.anio);

  struct fechaDeNacimento mama = {21, 11, 1959};
  printf("%d/%d/%d \n", mama.dia, mama.mes, mama.anio);


}
