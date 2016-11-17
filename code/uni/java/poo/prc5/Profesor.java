public class Profesor{
  private double complementoCargoAcademico;

  void setComplementoAcademico(double complementoCargo){
    this.complementoCargoAcademico = complementoCargo;
  }
  double getComplementoCargoAcademico(){
    return this.complementoCargoAcademico;
  }
  double getSueldo(){
    return sueldo + getComplementoCargoAcademico();
  }
}
