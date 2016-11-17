// package practica2;

import java.util.Scanner;

public class PruebaOperador {

	private static Scanner sc = new Scanner(System.in);
	private boolean[] conjuntosAOperar;
  private Conjunto resultado;
	private Operador op;

	public PruebaOperador() {
	  int[] dim = menu2Opciones("Número de conjuntos:","Número de elementos en cada conjunto:\n");	
	  op = new Operador(dim[0],dim[1]);
	  conjuntosAOperar = new boolean[dim[0]];
	  resultado = new Conjunto(dim[1]);
	  do {
	    menuPrincipal();
	    opciones(sc.nextInt());
	  } while(true);
	}


    private int[] menu2Opciones(String opc1, String opc2) {
	  int[] v = new int[2];
	  System.out.print(opc1);
	  v[0]=sc.nextInt();
	  System.out.print(opc2);
	  v[1]=sc.nextInt();
	  return v;
    }

    private void menuPrincipal() {
	  String aux="";
	  aux=aux+"Bienvenidos al operador de Conjuntos\n";
	  aux=aux+" Opciones disponibles en este operador:\n";
	  aux=aux+"  1: Unión de  conjuntos\n";
	  aux=aux+"  2: Intersección de conjuntos\n";
	  aux=aux+"  3: Insertar un elemento en un conjunto\n";
	  aux=aux+"  4: Eliminar un elemento de un conjunto\n";
	  aux=aux+"  5: Comprobar si  conjuntos son iguales\n";
	  aux=aux+"  6: Visualizar conjuntos\n";
	  aux=aux+"  7: Añadir conjunto para las operaciones unión/intersección\n";
	  aux=aux+"  8: Eliminar conjunto para las operaciones unión/intersección\n";
	  aux=aux+"  9: Salir del operador\n";
	  System.out.println(aux);
    }


    private void opciones(int opcion) {
      switch (opcion) {
        case 1:
          resultado = op.union(conjuntosAOperar);
          break;
        case 2:
            resultado = op.interseccion(conjuntosAOperar);
            break;
        case 3:
      	  int[] v = menu2Opciones("Conjunto:","Elemento:");
          op.get(v[0]).set(v[1], true);
          break;
        case 4:
          v = menu2Opciones("Conjunto:","Elemento:");
          op.get(v[0]).set(v[1], false);
          break;
        case 5:
            v = menu2Opciones("Conjunto 1:","Conjunto 2:");
            System.out.println(op.get(v[0]).equals(op.get(v[1])));
            break;
        case 6:
      	  System.out.println(op);
      	  System.out.println("------");
      	  System.out.println(resultado);
          break;
        case 7:
      	  System.out.print("Conjunto a añadir");
      	  conjuntosAOperar[sc.nextInt()]=true;
          break;
        case 8:
      	  System.out.print("Conjunto a quitar");
      	  conjuntosAOperar[sc.nextInt()]=false;
          break;
        case 9:
          System.exit(0);
      }
    }


    public static void main(String[] a) {
       new PruebaOperador();
    }
}
