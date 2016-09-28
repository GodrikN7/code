public class Vector{
  private int[] vector; // == int vector[];
  private int capacidad;
  private int posicion;

  public Vector(int capacidad){
    this.capacidad = capacidad;
    this.vector[] = vector[capacidad];
    this.posicion = 0;
  }

  public void getVector(int posicion){
    return vector[posicion];
  }
  public int[] setVector(int posicion, int vector){
    this.vector[posicion] = vector;
  }

  public void getCapacidad(){
    return capacidad;
  }
  public int setCapacidad(int capacidad){
    this.capacidad = capacidad;
  }

  public void getPosicion(){
    return posicion;
  }
  public int setPosicion(int posicion){
    this.posicion = posicion;
  }

  public String toString(){
    return "" + capacidad + vector[] + posicion;
  }
}
