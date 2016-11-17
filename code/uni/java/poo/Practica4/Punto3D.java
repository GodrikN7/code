public class Punto3D extends Punto2D implements IntfzPunto3D{
  private Punto2D coordenadas;
  private int z;
  public Punto3D(){
    coordenadas = new Punto2D();
    this.z = 0;
  }
  public Punto3D(int x){
    coordenadas = new Punto2D(x);
    this.z = 0;
  }
  public Punto3D(int x, int y){
    coordenadas = new Punto2D(x, y);
    this.z = 0;
  }
  public Punto3D(int x, int y, int z){
    coordenadas = new Punto2D(x, y);
    this.z = z;
  }

  public void setZ(int z){
    this.z = z;
  }

  public void setXYZ(int x, int y, int z){
    coordenadas.setXY(x,y);
    setZ(z);
  }

  public int getZ(){
    return this.z;
  }

  public boolean equals(int x, int y, int z){
    return coordenadas.equals(x,y) && (z == this.getZ());

  }

  public String toString(){
    return coordenadas.toString() +
    " Coordenada Z: " + this.getZ();
  }

}
