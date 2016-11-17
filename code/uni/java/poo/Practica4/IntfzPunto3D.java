public interface IntfzPunto3D extends IntfzPunto2D{
  int z = 0;

  void setZ(int z);

  void setXYZ(int x, int y, int z);

  int getZ();

  boolean equals(int x, int y, int z);

  String toString();
}
