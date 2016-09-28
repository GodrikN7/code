#include <stdio.h>

int fibonacci(int n){
  int resul;

  if (n == 1) resul = 1;
  if (n == 2) resul = 2;
  if (n >  2) resul = fibonacci(n-1) + fibonacci(n-2);

  return resul;
}

void main(){
  int n = 1;
  while(n < 100){
    printf("fibonacci(%d) = %d\n", n, fibonacci(n));
    n++;
  }

}
