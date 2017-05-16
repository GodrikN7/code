/*
Como especialista
Necesito poder modificar la ficha de mis pacientes
Con la finalidad de poder ir anotando la historia médica de los pacientes


T 4.1
Pedir el DNI del paciente que ha sido atendido

T 4.2
Comprobar si existe ya ficha del paciente hecha por este especialista.
Si no crearla

T 4.3
Pedir los comentarios que quiere apuntar el médico en la ficha

T 4.4
Almacenar los comentarios introducidos + la fecha de la modificación
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100
#define N 50

void modificarFicha(char dni[], char[] ) {
  int lineas = 0;
  char buffer[MAX];
  char delimitador[MAX] = "--------------------------------------------------";

  strcat(dni, ".txt");
  FILE *fichero;
  // while( fscanf(fichero, "%s %s %s %s %s\n", dniF, nombreF, apellido1F,
  //   apellido2F, companiaF) != EOF && existe   == 0) {

  fichero = fopen(dni, "a");
  if(!fichero) {
    printf("Error al abrir el fichero %s\n", dni);
  }
  else {
    // strok()
    while(fscanf(fichero, "%s", buffer) != EOF) {
      if(strcmp(buffer, delimitador) == 0) {
        if(fscanf(fichero, "%s", buffer) == EOF) {
          final = 1;
        }
      }
      if(buffer == "\n") {
        lineas++;
      }
      if(final) {
          scanf("%s", &buffer);
          fprintf(fichero, "%s", buffer);
        }
      }
    }
  }
  else {
    // strok()
    while(fscanf(fichero, "%s", buffer) != EOF) {
      if(buffer == "\n") {
        lineas++;
      }
    }
    lineas--;
    strok(lineas);
    printf("Ficha del paciente con DNI: %s, para acabar de modifcar escribir FIN\n", dni);
    while(strcmo(buffer, "FIN")) {
      scanf("%s", &buffer);
      fprintf(fichero, "%s", buffer);
    }
    fprintf(fichero, "\n  %s", delimitador);
  }

  fclose(fichero);
}
void comprobarDni(char dni[]) {

  int i = 0;
  int existe = 0;  //Variable booleana que comprueba si los dnis son existe e s
  int resp;       //Variable para almacenar la respuesta de si tiene seguro

  char dniF[10];  //dni que se lee del fichero

  //Datos que se guardan en el fichero
  char nombre[MAX];
  char apellido1[MAX];
  char apellido2[MAX];
  char compania[MAX] = "No";
  int longitud;
  char pacientes[] = "pacientes.txt";
  //Variables para leer el fichero
  char nombreF [MAX];
  char apellido1F[MAX];
  char apellido2F[MAX];
  char companiaF[MAX];

  FILE *fichero;
  fichero = fopen("pacientes.txt", "r");
  if(fichero == NULL) {
    printf("Error al abrir el fichero\n");
  }
  else {
    printf("\nPor favor introduzca el DNI del paciente.\n");
    do {
        scanf("%s", dni);
        longitud = strlen(dni);
        if(longitud != 9){
            printf("\nLongitud de DNI incorrecta.\n");
        }
    } while(longitud !=9 );

    while( fscanf(fichero, "%s %s %s %s %s\n", dniF, nombreF, apellido1F,
    apellido2F, companiaF) != EOF && existe   == 0) {
        if(strcmp(dni,dniF)== 0){
            existe = 1;
            for(i = 0; i < 80; i++) {
              printf("-");
            }
            printf("\nEl paciente existe:\n");
            printf("\n\tDNI: %s", dniF);
            printf("\n\tNombre: %s", nombreF);
            printf("\n\tPrimer Apellido: %s", apellido1F);
            printf("\n\tSegundo Apellido: %s", apellido2F);
            printf("\n\tSeguro: %s", companiaF);
        }
    }
  }
}
void main() {
  char dni[10] = "50478633G"; // dni que se lee por teclado
  printf("DNI Existe? \n");
  // comprobarDni(dni);
  printf("\nDNI: %s\n", dni);
  // modificarFicha(dni);
  strcat(dni, ".txt");
  printf("\nDNI: %s\n", dni);
//  modificarFicha(dni);
  int final = 0;
  char buffer[MAX] = "--------------------------------------------------";
  if(strcmp(buffer, "--------------------------------------------------") == 0) {
    final = 1;
  }
  printf("Final = %d\n", final);
  printf("Buffer= %s\n", buffer);
}
