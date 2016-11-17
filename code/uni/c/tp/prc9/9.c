/*
Se jugará con 5 valores numéricos, comprendidos entre 1 y 9, sin valores repetidos.
El usuario deberá acertar cuál ha sido la combinación generada por el programa, combinación
“secreta”, para ello el programa le solicitará una combinación de 5 valores y comprobará si coincide o
no con la combinación secreta, no se dispondrá de más de X oportunidades para acertarla, X es una
constante definida con valor 10.
Para facilitar la tarea al usuario, el programa después de leer una propuesta, imprimirá el vector de
“pistas”, que tendrá un ‘+’ por cada número acertado en el lugar correcto y un ‘*’ por cada número
acertado pero puesto en un lugar incorrecto.
Si el usuario acierta la combinación, el programa imprimirá un mensaje de felicitación, en el caso de
acabar los X intentos sin acertar la combinación imprimirá un mensaje indicándolo, y le dirá cuál es la
combinación secreta.
Deberán utilizarse, al menos, las siguientes funciones:
 Función que lee en un vector la combinación propuesta por el usuario, esta función validará la
combinación propuesta, es decir, comprobará que los 5 valores están entre 1 y 9, y que no están
repetidos, en caso de no ser así solicitará otra combinación de valores.
 Función que genera e imprime el vector de pistas a partir de la combinación secreta y la
combinación propuesta, el vector generado tendrá tantos ‘+’ como números acertados en su
correcta posición, y tantos ‘*’ como números acertados pero situados en posiciones incorrectas.
Esta función también devuelve el total de valores acertados en su posición correcta.
 Función que escribe un vector con las características del vector que contiene la combinación
secreta.
Se sugiere hacer el programa en primer lugar asignando una combinación secreta en la declaración
del vector, por ejemplo: int secreto[] = {6, 4, 1, 3, 8};
*/
#include <stdio.h>
#include <stdlib.h> //libreria para el uso de srand() y rand()
#include <time.h>   // libreria para el uso de time()

#define N 5
#define X 10

int crearSecreto();
int valido(int numero[]);
int pista(int numero[], int secreto[]);
void imprimirPista(int secreto[], int numero[]);

void main(){
  int i;
  int secreto[N];
  secreto[N] = crearSecreto();
  int numero[N];
  int num, intentos = 0;
  do{
    do{
      printf("Introduce un 5 numeros diferentes del 1 - 9\n");
      scanf("%d", &num);
      for(i = N-1; i >= 0; i--){
        if (num > 9){
          numero[i] = num%10;
          num = num/10;
        }
        else numero[i] = num;
      }
      if(!valido(numero)) printf("Numero incorrecto\n");
    }while(!valido(numero));
    for(i = 0; i < N; i++){
      printf("%d", numero[i]);
    }
    printf("\n");
    for(i = 0; i < N; i++){
      printf("%d", secreto[i]);
    }
    printf("\n");
    printf("\nPista: \n");
    imprimirPista(numero, secreto);
    printf("\nTotal de valores acertados: %d\n", pista(secreto, numero));
    intentos++;
  }while((pista(numero, secreto) != N) && (intentos <= X));
  if (intentos < N){
    printf("Enhorabuena numero secreto: ");
    for(i = 0; i < N; i++){
      printf("%d", secreto[i]);
    }
    printf("al intento %d.\n", intentos);
  }
  else{
    printf("Intentos acabados el numero secreto era");
    for(i = 0; i < N; i++){
      printf("%d", secreto[i]);
    }
    printf("\n");

  }
}
int crearSecreto(){
  int i;
  int secreto[N];
  int MIN = 0, MAX = 9;
  srand(time(NULL));    //genera la “semilla” de valores pseudoaleatorios
  do{
    for(i = 0; i < N; i++){
      secreto[i] = rand()%MAX+MIN; //almacena en num un valor comprendido entre MAX y MIN incluidos
    }
  }while(!valido(secreto));
  return secreto[N];
}
int valido(int numero[] ){
  int i, j;
  int resul = 1;
  for(i = 0; i < N; i++){
    for(j = 0; j < N; j++){
      if((i != j) && (numero[i] == numero[j])) resul = 0;
    }
  }
  return resul;
}
int pista(int secreto[], int numero[]){
  int i, j;
  int acertado = 0;
  char pistas[N];
  for(i = 0; i < N; i++)
    pistas[i] = '0';
  for(i = 0; i < N; i++){
    for(j = 0; j < N; j++){
      if ((i == j) && (numero[i] == secreto[j])){
        pistas[i] = '+';
        acertado++;
      }
      else if ((i != j) && (numero[i] == secreto[j])){
          pistas[i] = '*';
      }
    }
  }
  return acertado;
}
void imprimirPista(int secreto[], int numero[]){
  int i, j;
  char pistas[N];
  for(i = 0; i < N; i++)
    pistas[i] = '0';
  for(i = 0; i < N; i++){
    for(j = 0; j < N; j++){
      if ((i == j) && (numero[i] == secreto[j])){
        pistas[i] = '+';
      }
      else if ((i != j) && (numero[i] == secreto[j])){
          pistas[i] = '*';
      }
    }
  }
  for(i = 0; i < N; i++)
    printf("%c", pistas[i]);
}
