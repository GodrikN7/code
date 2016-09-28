// b) Modificar el programa para que escriba los números en formato decimal con un
// tamaño máximo de 9 caracteres de los cuales 2 son decimales.
// ¿Cómo has modificado las sentencias printf? ¿Qué resultado has obtenido?
# include <stdio.h>
int main (){

   float x= 7000.0, y= 0.0043;

   // %[flags][ancho campo][.precisión][l]type

   printf("%9.2f %9.2f \n\n", x , y);
   printf("%9.3e %9.3e\n\n", x, y);
   return 0;
}
