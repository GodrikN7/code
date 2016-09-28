public class Booleano{
  //ATRIBUTOS
  boolean valor;
  //CONSTRUCTORES
  public Booleano(boolean v){
    this.valor = v;
  }
  public Booleano(){
    valor = false;
  }
  //METODOS
  public void setValor(boolean v){
    this.valor = v;
  }
  public Boolean getValor(){
    return this.valor;
  }
  public String toStrings(){
    return ""+valor;
  }
  public static void main(String[] args){

  Booleano num = new Booleano(true);
  System.out.println(num.toStrings());
  System.out.println(num.getValor());
  num.setValor(false);
  System.out.println(num.getValor());



  Booleano defecto = new Booleano();
  System.out.println(defecto.toStrings());
  System.out.println(defecto.getValor());
  }
}
