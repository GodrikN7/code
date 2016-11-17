/*
Se desea realizar el mismo programa en C que el apartado anterior pero con el
siguiente cambio: los datos de la capacidad de los depósitos tanto de los
turismos como de los todoterrenos se encuentra en un fichero denominado
“datos.txt”. Inserte a continuación el código desarrollado y una captura de
pantalla de la ejecución.
*/
#include <stdio.h>
#include <stdlib.h>

void main(){
  float combustible;
  int numTurismos, numTodoterrenos;
    numTurismos = 30;
    numTodoterrenos = 45;
  float depositoTurismo, depositoTodoterreno;

  FILE *datos;
  datos = fopen("datos.txt", "r");
  if(!datos){
    printf("El fichero no se ha abierto correctamente\n");
  }
  else{
    printf("El fichero se ha abierto correctamente\n");
    fscanf(datos, "%f", &depositoTurismo);
    fscanf(datos, "%f", &depositoTodoterreno);
  }
  fclose(datos);


  combustible = (int)numTurismos*depositoTurismo + (int)numTodoterrenos*depositoTodoterreno;
  printf("Se necesita un combustible de %.2f\n", combustible);


}
