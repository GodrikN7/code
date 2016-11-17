/*
Se proporciona una clase “Conjunto” que permite definir conjuntos y realizar
operaciones de unión e intersección entre 2 conjuntos. Se pide:
1. Crear una clase “Operador” que permita definir un vector de conjuntos y realizar
operaciones de unión e intersección entre los mismos. Se adjunta API de definición.
*/
/*
2. Crear una clase “PruebaOperador” que defina un operador con varios conjuntos y
compruebe el correcto funcionamiento de los métodos “union” e “intersección”.
3. Comprender la clase “PruebaOperador” que se adjunta. Esta clase hace posible
realizar pruebas interactivas por consola, usando el objeto "Scanner":
4. OPCIONAL. Fuera del temario de la asignatura y de su evaluación: comprender las
clases “PruebaGraficaOperador” y “Controlador”, que permiten comprobar,
gráficamente, parte del funcionamiento de la clase “Operador”.
*/
package practica2;

public class Operador{
  private Conjunto[] conjunto;
  private int numElementosEnConjunto;

  public Operador(int numConjuntos, int numElementosEnConjunto){
    this.numElementosEnConjunto = numElementosEnConjunto;
    this.conjunto = new Conjunto[numConjuntos];
    for(int i = 0; i < numConjuntos; i++){
      conjunto[i] = new Conjunto(numElementosEnConjunto);
    }
  }
  public Conjunto get(int c){
    return conjunto[c];
  }

  public int getNumConjuntos(){
    return conjunto.length;
  }
  public int getNumElementosEnConjunto(){
    return numElementosEnConjunto;
  }
//ya tengo un array de booleanos con el numero de conjuntos y el numero de sus elemetos

  public Conjunto interseccion(boolean[] c){
    Conjunto aux = new Conjunto(this.numElementosEnConjunto);
    for(int i = 0; i < c.length; i++){
      if(c[i]){
        aux = aux.interseccion(conjunto[i]);
      }
    }
    return aux;
  }

  public Conjunto union(boolean[] c){ //array de booleanos que te dice que conjuntos[i] operar
    Conjunto aux = new Conjunto(this.numElementosEnConjunto);
    for(int i = 0; i < c.length; i++){
      if(c[i])
        aux = aux.union(conjunto[i]);
    }
    return aux;
  }
  public String toString(){
    String string = "\n";
    for(int i = 0; i < conjunto.length; i++){
      string += this.conjunto[i].toString();
    }
    return string;
  }
}
  //     String cadaux = ("{");
  // 		for (int j = 0; j < numElementosEnConjunto; j++){
  // 			if (this.conjunto[i].get(j))
  // 				cadaux += (j + ",");
  //     }
  // 		cadaux += ("}\n");
  //     return cadaux;
  //   }
  //   return "fin";
  // }

  //
  // public Conjunto union(boolean[] c){ //array de un array de booleanos
  //   Conjunto aux = new Conjunto(0);
  //   for(int i = 0; i < c.length; i++){
  //     conjunto[i] = new Conjunto(c[i]);
  //     aux = aux.union(conjunto[i]);
  //   }
  //   return aux;
  // }
/*
//operador que opera con N conjuntos

//array de booleanos por ej 0 true
1 true 2 false 3 true 4 false
union de 0 y 1 y su resultado hay que unirle el 3 y el 4
forma de implementarlo primero conjunto rsultado vacio, y luego vamos uniendo,
 con cadainteseccion va creciendo cada nuevo conjunto hacer union con el resultado.

PruebaOperador -> tiene el  objeto escaner, el cual es una clase que se encuentra
en el paquete java.util luego import java.util
Scanner sc;
sc = new Scanner(System.in);
  sc.getInt();
  sc.nextLine(); // todo lo que teclees antes de \n

import.uti.LinkedList
*/
/** este segundo asteristico se pone a mirar palabras claves, EJ: @param color
la explicacion acabada en punto.

/*
javadoc:
  sirve para documentar Metodos

  ej:
  public class Semaforo{
  /** este segundo asteristico se pone a mirar palabras claves, EJ: @param color la explicacion acabada en punto.
  */
  /**
    @return color del semaforo segun las constantes.
  */
/*
  public int getColor()
  public void setColor(int color){
    this.color = color;
  }
}
para generar el API poner javadoc operador.java, javadoc *.java
*/
// IMPORTANTE OPERADOR
