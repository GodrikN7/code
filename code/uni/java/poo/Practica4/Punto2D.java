public class Punto2D implements IntfzPunto2D{
  private int x;
  private int y;

  public Punto2D(){
    this.x = 0;
    this.y = 0;
  }
  public Punto2D(int x){
    this.x = x;
    this.y = 0;
  }
  public Punto2D(int x, int y){
    this.x = x;
    this.y = y;
  }


  public void setX(int x){
    this.x = x;
  }
  public void setY(int y){
    this.y = y;
  }

  public void setXY(int x, int y){
    setX(x);
    setY(y);
  }

  public int getX(){
    return this.x;
  }
  public int getY(){
    return this.y;
  }

  public boolean equals(int x, int y){
    return (x == getX()) && (y == getY());
  }

  public String toString(){
    return "Coordenada X: " + getX() + "Coordenada Y: " + getY();

  }
}
