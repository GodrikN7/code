public class Tedax extends Policia implements ITedax{
  private double complementoPeligrosidad;
  private String nombre;

  public Tedax(String nombre){
    this.nombre = nombre;
  }
  public double setComplementoPeligrosidad(double complementoPeligrosidad){
    this.complementoPeligrosidad = complementoPeligrosidad;
  }
  public double getComplementoPeligrosidad(){
    return complementoPeligrosidad;
  }
  public double getSueldo(){
    return sueldo + getComplementoPeligrosidad();
  }

  public boolean equals(Tedax tedax);
  public String toString();

}
