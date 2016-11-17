public interface IntfzPunto2D{
  int x = 0;
  int y = 0;

  void setX(int x);
  void setY(int y);

  void setXY(int x, int y);

  int getX();
  int getY();

  boolean equals(int x, int y);

  String toString();
}
