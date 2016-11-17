import java.lang.Math;

public class Segmento extends Punto2D implements IntfzSegmento2D{
  private Punto2D p1;
  private Punto2D p2;
  private double longitud;

  public Segmento(Punto2D p1, Punto2D p2){
    this.p1 = p1;
    this.p2 = p2;
    longitud();
  }
  public void longitud(){
    this.longitud = (p1.getX()*p1.getX()) + (p2.getX()*p2.getX());
    this.longitud = Math.abs(longitud);
    this.longitud = Math.sqrt(longitud);
  }
}
