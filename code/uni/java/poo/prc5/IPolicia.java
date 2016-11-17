public interface IPolicia{
  void setComplementoPersonal(double complementoPersonal);
  double getComplementoPersonal();
  double getSueldo();

  boolean equals(IPolicia policia);
  String toString();
}
