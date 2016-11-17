// package practica3;

import java.util.Scanner;

public class Consola {

	private final boolean DISCOGRAFICA = true;

	private Scanner sc;
	private ListaCanciones discografica;
	private ListaCanciones cd;

	public Consola (int numCancionesDiscografica, int numCancionesCD) {
	  sc = new Scanner(System.in);
	  discografica = new ListaCanciones(numCancionesDiscografica);
	  cd = new ListaCanciones(numCancionesCD);
		Cancion stan = new Cancion("Stan","Elton Jon");
    Cancion letitbe = new Cancion("Let it be","Paul McCartney");
    Cancion imagine = new Cancion("Imagine", "Jonh Lennon");
    Cancion slimshady = new Cancion("Slim Shady","Eminem");
    Cancion darude = new Cancion("Sandstorm", "Darude");
    Cancion sonofman = new Cancion("Son of Man","Phils Colin");
    Cancion starwars = new Cancion("Marcha imperial","");

    discografica.add(stan);
    discografica.add(letitbe);
    discografica.add(imagine);
    discografica.add(slimshady);
    discografica.add(darude);
    discografica.add(sonofman);
    discografica.add(starwars);
	  // menú discográfica
	  int opcion;
	  do {
		opcion = menuPrincipal(DISCOGRAFICA);
		if (opcion!=12)
		  subMenuDiscografica(opcion,DISCOGRAFICA);
	  } while (opcion!=12);

      // menú CD
	  do {
		opcion = menuPrincipal(!DISCOGRAFICA);
		if (opcion!=12)
		  subMenuDiscografica(opcion,!DISCOGRAFICA);
	  } while (opcion!=12);

	}

	private int menuPrincipal(boolean discogr) {
      int opcion;
	  if (discogr)
	    System.out.println("**** Menú discográfica ****");
	  else
		System.out.println("**** CD ****");
	  System.out.println("1. Añade Canción");
	  System.out.println("2. Añade Canción en posición");
	  System.out.println("3. Borra Canción");
	  System.out.println("4. Borra Canción de posición");
	  System.out.println("5. Modifica canción de posición");
	  System.out.println("6. Intercambiar canciones");
	  System.out.println("7. Recoge canción");
	  System.out.println("8. Existe la canción");
	  System.out.println("9. Lista de canciones llena");
	  System.out.println("10. Número de canciones disponibles");
	  System.out.println("11. Listado de canciones");
	  System.out.println("12. Salir");
	  opcion = sc.nextInt();
	  if (opcion>0&&opcion<13)
	    return opcion;
	  else
		return -1;
	}

	private void subMenuDiscografica(int opcionMenu, boolean discogr) {
	  switch (opcionMenu) {
	    case 1: // Añade canción
	      if (discogr)
	  	    System.out.println(discografica.add(getCancion()));
	      else {
	    	Cancion cancion = getCancion();
	    	if (discografica.existe(cancion)!=-1)
		  	  System.out.println(cd.add(cancion));
	      }
	  	  break;
	    case 2: // Añade canción en posición
		  CancionPosicion cp = getCancionEnPosicion();
		  if (discogr)
	        System.out.println(discografica.add(cp.getPosicion(), cp.getCancion()));
		  else {
		    Cancion cancion = getCancion();
	    	if (discografica.existe(cancion)!=-1)
		      System.out.println(cd.add(cp.getPosicion(), cp.getCancion()));
		  }
		  break;
	    case 3: // Borra canción
		  if (discogr)
	        System.out.println(discografica.delete(getCancion()));
		  else
		    System.out.println(cd.delete(getCancion()));
		  break;
		case 4: // Borra canción en posición
		  System.out.println("Posicion");
		  int posicion = sc.nextInt();
	      if (discogr)
		    System.out.println(discografica.delete(posicion));
	      else
			System.out.println(cd.delete(posicion));
		  break;
	    case 5: // Modifica canción de posición
	      cp = getCancionEnPosicion();
		  if (discogr)
	        System.out.println(discografica.cambiar(cp.getPosicion(), cp.getCancion()));
		  else
		    System.out.println(cd.cambiar(cp.getPosicion(), cp.getCancion()));
		  break;
		case 6: // Intercambiar canciones
		  System.out.println("Posicion 1");
		  int posicion1 = sc.nextInt();
		  System.out.println("Posicion 2");
		  int posicion2 = sc.nextInt();
	      if (discogr)
		    System.out.println(discografica.cambiar(posicion1, posicion2));
	      else
			System.out.println(cd.cambiar(posicion1, posicion2));
		  break;
		case 7: // Recoge canción
		  System.out.println("Posicion");
		  posicion = sc.nextInt();
	      if (discogr)
		    System.out.println(discografica.get(posicion));
	      else
			System.out.println(cd.get(posicion));
		  break;
	    case 8: // Existe la canción
		  if (discogr)
	        System.out.println(discografica.existe(getCancion()));
		  else
		    System.out.println(cd.existe(getCancion()));
		  break;
	    case 9: // Lista de canciones llena
		  if (discogr)
	        System.out.println(discografica.completo());
		  else
		    System.out.println(cd.completo());
		  break;
	    case 10: // Número de canciones disponibles
		  if (discogr)
	        System.out.println(discografica.getNumCanciones());
		  else
		    System.out.println(cd.getNumCanciones());
		  break;
	    case 11: // Listado de canciones
	    	System.out.println("pasa 11");
		  if (discogr)
	        System.out.println(discografica);
		  else
		    System.out.println(cd);
		  break;
	  }
	}

	private Cancion getCancion() {
	  sc.nextLine();
  	  System.out.println("Título");
  	  String titulo = sc.nextLine();
  	  System.out.println("Autor");
  	  String autor = sc.nextLine();
  	  System.out.println(titulo+", "+autor);
  	  return new Cancion(titulo, autor);
	}

	private CancionPosicion getCancionEnPosicion() {
	  Cancion cancion = getCancion();
  	  System.out.println("Posicion");
  	  int posicion = sc.nextInt();
  	  return new CancionPosicion(cancion,posicion);
	}


	// Clase interna que alberga una canción y una posición
	private class CancionPosicion {
	  private Cancion cancion;
	  private int posicion;

	  public CancionPosicion(Cancion cancion, int posicion) {
		this.cancion = cancion;
		this.posicion = posicion;
	  }

	  public Cancion getCancion()  { return cancion; }
	  public int getPosicion() { return posicion; }
	}


	public static void main(String[] a) {
		new Consola (10, 5);
	}

}
