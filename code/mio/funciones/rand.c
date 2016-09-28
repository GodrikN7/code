#include <stdio.h>
#include <stdlib.h> //libreria donde se encuentra la funcion rand
/*  __BEGIN_NAMESPACE_STD
  Return a random integer between 0 and RAND_MAX inclusive.
  extern int rand (void) __THROW;
  Seed the random number generator with the given number.
  extern void srand (unsigned int __seed) __THROW;
  __END_NAMESPACE_STD
*/
//funcion random para int long, srandom numeros aleatorios con un seed

void main(){
  int debbug = 0;
  do{

    int numero;

    printf("./%d \t %d\n", debbug, rand() % 100 + 0); //numeros aleatorios de 0 a 99

    debbug++;

  }while(debbug < 100);
}
