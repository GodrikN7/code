/*
Una empresa que trabaja con vehículos desea calcular las necesidades de
combustible (cantidad de combustible necesario para llenar los depósitos de
todos sus vehículos) para lo cual nos han facilitado que dispone de 30 turismos
y 45 todoterrenos, sabiendo que la capacidad del depósito es diferente.
Se desea crear un programa en C para que puedan realizar el cálculo de forma
automatizada.
Inserte a continuación el código desarrollado y una captura de pantalla de la
ejecución.
*/
#include <stdio.h>
#include <stdlib.h>

void main(){
  float combustible;
  int numTurismos, numTodoterrenos;
    numTurismos = 30;
    numTodoterrenos = 45;
  float depositoTurismo, depositoTodoterreno;

  printf("Deposito del turismo\n");
  scanf("%f", &depositoTurismo);

  printf("Deposito del turismo\n");
  scanf("%f", &depositoTodoterreno);


  combustible = (int)numTurismos*depositoTurismo + (int)numTodoterrenos*depositoTodoterreno;
  printf("Se necesita un combustible de %.2f\n", combustible);


}
