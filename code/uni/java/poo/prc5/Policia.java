public class Policia extends Funcionario implements IPolicia{
  void setComplementoPersonal(double complementoPersonal){
    this.complementoPersonal = complementoPersonal;
  }
  double getComplementoPersonal(){
    return this.complementoPersonal;
  }
  double getSueldo(){
    return this.sueldo;
  }
  boolean equals(Policia policia);
  String toString();
}
