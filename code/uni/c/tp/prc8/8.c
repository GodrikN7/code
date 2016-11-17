#include<stdio.h>

int verificar(int dni){
  int i;
  for(i = 1; dni > 10; i++)
    dni = dni/10;
  return (i==8);
  // return (dni == 8)
}
char letraCorrespondiente(int dni){
  int resto = dni%23;
  char letra;
  switch (resto) {
    case 0: letra = 'T'; break;
    case 1: letra = 'R'; break;
    case 2: letra = 'W'; break;
    case 3: letra = 'A'; break;
    case 4: letra = 'G'; break;
    case 5: letra = 'M'; break;
    case 6: letra = 'Y'; break;
    case 7: letra = 'F'; break;
    case 8: letra = 'P'; break;
    case 9: letra = 'D'; break;
    case 10: letra = 'X'; break;
    case 11: letra = 'B'; break;
    case 12: letra = 'N'; break;
    case 13: letra = 'J'; break;
    case 14: letra = 'Z'; break;
    case 15: letra = 'S'; break;
    case 16: letra = 'Q'; break;
    case 17: letra = 'V'; break;
    case 18: letra = 'H'; break;
    case 19: letra = 'L'; break;
    case 20: letra = 'C'; break;
    case 21: letra = 'K'; break;
    case 22: letra = 'E'; break;
  }
  return letra;
}
int letraCorrecta(int dni, char letra){

}
void main(){
  int dni;
  char letra;
  printf("DNI: ");
  scanf(" %d", &dni);
  while(!verificar(dni)){
    printf("\nDNI %d NO es correcto", dni);
    printf("DNI: ");
    scanf(" %d", &dni);
  }
  printf("\nLetra: ");
  scanf(" %c", &letra);
  while(letra != letraCorrespondiente(dni)){
    printf("\nLetra %c NO correcta: ", letra);
    printf("\nLetra: ");
    scanf(" %c", &letra);
  }
  printf("DNI: %d%c correcto\n", dni, letra);
}
