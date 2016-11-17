public class Prueba{
  //ATRIBUTOS
  int entero;
  double real;
  boolean booleano;

  //CONSTRUCTORES

  //METODOS

  public void prueba(Entero entero, Real real, Booleano booleano){
    Entero num1 = new Entero();
    num1 = entero;

    Real   num2 = new Real();
    num2 = real;

    Booleano bool = new Booleano();
    bool = booleano;

    int     primitivo1 = 30;
    double  primitivo2 = 5.7;
    boolean primitivo3 = false;

  }
  public static void main(String[] args){

    Prueba prueba = new Prueba();

    prueba.prueba(28,3.14,true);

    System.out.println(num1.getValor());
    System.out.println(num2.getValor());
    System.out.println(bool.getValor());

  }

}
