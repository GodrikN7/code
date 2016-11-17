// package practica2;

public class PruebaConjunto{
   public PruebaConjunto(){
    boolean[] b1 = {true, false, true, true, false};
    boolean[] b2 = {true, true, false, true, false};

    Conjunto c1 = new Conjunto(b1);
    Conjunto c2 = new Conjunto(b2);
/*
  {0,2,3}
  {0,1,3}
  -------
  {0,3}
*/
    System.out.println(c1.union(c2));
    System.out.println(c1.interseccion(c2));
  }
  public static void main(String[] a){
    new PruebaConjunto();
  }
}
