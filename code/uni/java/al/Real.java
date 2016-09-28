public class Real{
  //ATRIBUTOS
  double valor;
  //CONSTRUCTORES
  public Real(double v){
    this.valor = v;
  }
  public Real(){
    valor = 0.0;
  }
  //METODOS
  public void setValor(double v){
    this.valor = v;
  }
  public double getValor(){
    return this.valor;
  }
  public String toStrings(){
    return ""+valor;
  }
  public static void main(String[] args){
    Real num = new Real(3.1415);
    System.out.println(num.toStrings());
    System.out.println(num.getValor());

    Real defecto = new Real();
    System.out.println(defecto.toStrings());
    System.out.println(defecto.getValor());

  }
}
