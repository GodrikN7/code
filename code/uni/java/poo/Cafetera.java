import java.util.Scanner;
public class Cafetera{
  /* ATRIBUTOS */
  private int cantidadMaxima;  //cantidad maxima de Cafetera
  private int cantidadActual;  //cantidad actual de Cafetera

  /* CONSTRUCTORES */
  public Cafetera(){
    cantidadMaxima = 1000;
    cantidadActual = 0;
  }
  public Cafetera(int maxima){

    cantidadActual = maxima;
    cantidadMaxima = maxima;
  }
  public Cafetera(int maxima, int actual){
    if(actual > maxima){
      cantidadMaxima = actual;
      cantidadActual = actual;
    }
    else{
      cantidadMaxima = maxima;
      cantidadActual = actual;
    }
  }

  /* METODOS */
  public  void llenarCafetera(){
    cantidadActual = cantidadMaxima;
  }

  public  void servirTaza(int cantidad){
    if ((cantidadActual - cantidad) > 0){
      cantidadActual = cantidadActual - cantidad;
    }
    else{
      cantidadActual = 0;
    }
  }

  public void vaciarCafetera(){
    cantidadActual = 0;
  }

  public void agregarCafe(int cantidad){
    cantidadActual = cantidadActual + cantidad;
    if(cantidadActual > cantidadMaxima){
      cantidadMaxima = cantidadActual;
    }
  }

  public static void main(String[] arghs){
    Cafetera taza = new Cafetera();
    taza.llenarCafetera();
    System.out.println("llenar "+taza.cantidadActual);
    System.out.println();

    taza.servirTaza(800);
    System.out.println("servir "+taza.cantidadActual);
    System.out.println();

    taza.agregarCafe(300);
    System.out.println("agregar "+taza.cantidadActual);
    System.out.println();

    taza.servirTaza(1000);
    System.out.println("servir "+taza.cantidadActual);
    System.out.println();

    taza.vaciarCafetera();
    System.out.println("vaciar "+taza.cantidadActual);
    System.out.println();

    Cafetera tazaGrande = new Cafetera(10000);
    tazaGrande.servirTaza(1000);
    System.out.println(tazaGrande.cantidadActual);
    System.out.println();

    tazaGrande.agregarCafe(50);
    System.out.println(tazaGrande.cantidadActual);
    System.out.println();

    tazaGrande.vaciarCafetera();
    System.out.println(tazaGrande.cantidadActual);
    System.out.println();

    tazaGrande.llenarCafetera();
    System.out.println(tazaGrande.cantidadActual);
    System.out.println();

    Cafetera tazaMini = new Cafetera(500, 0);

    tazaMini.servirTaza(300);
    System.out.println(tazaMini.cantidadActual);
    System.out.println();

    tazaMini.agregarCafe(20);
    System.out.println(tazaMini.cantidadActual);
    System.out.println();

    tazaMini.vaciarCafetera();
    System.out.println(tazaMini.cantidadActual);
    System.out.println();

    tazaMini.llenarCafetera();
    System.out.println(tazaMini.cantidadActual);
    System.out.println();

  }
}
