public class Entero{
  //ATRIBUTOS
  int valor;
  //CONSTRUCTORES
  public Entero(int v){
    this.valor = v;
  }
  public Entero(){
    valor = 0;
  }
  //METODOS
  public void setValor(int v){
    this.valor = v;
  }
  public int getValor(){
    return this.valor;
  }
  public String toStrings(){
    return ""+valor;
  }
   public static void main(String[] args){
     Entero num = new Entero(1997);
     System.out.println(num.toStrings());
     System.out.println(num.getValor());

     Entero defecto = new Entero();
     System.out.println(defecto.toStrings());
     System.out.println(defecto.getValor());

   }
}
