/*
Disponemos de un fichero de texto Entrada.txt, formado por palabras separadas
entre sí por uno o más caracteres blancos.

Escribe un programa que cree un nuevo fichero de texto Salida.txt con el mismo
texto que en el fichero Entrada.txt  pero con las palabras separadas por un
único carácter blanco.
*/
#include <stdio.h>
#include <stdlib.h>

void main() {
  char caracterAnt, caracter;
  FILE *entrada;
  FILE *salida;
  entrada = fopen("Entrada.txt", "r");
  if(!entrada){
    printf("El fichero no se ha abierto correctamente\n");
  }
  else{
    printf("El fichero se ha abierto correctamente\n");
    salida = fopen("Salida.txt", "w");
    fscanf(salida, "%c", &caracterAnt);
    while(!feof(entrada)){
      fscanf(entrada, "%c", &caracter);
      if(!(caracterAnt == ' ' && caracter == ' '))
        fprintf(salida, "%c", caracterAnt);
      //else no lo guarda
      caracterAnt = caracter;
    }
  }
  fclose(entrada);
  fclose(salida);
}
