#include <stdio.h>

int fibonacci(int n){
  int resul;

  if (n == 1) resul = 1;
  if (n == 2) resul = 2;
  if (n >  2) resul = fibonacci(n-1) + fibonacci(n-2);

  return resul;
}

void main(){
  int n, seguir;
  do{

  printf("Fibonacci de n = ");
  scanf("%d", &n);
  printf("%d\n", fibonacci(n));
  printf("Desea seguir Sr. Godrik?\n");
  scanf("%d", &seguir);

}while(seguir);
}
