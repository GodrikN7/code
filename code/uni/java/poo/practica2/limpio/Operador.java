public class Operador{
  private Conjunto[] conjunto;
  private int numElementosEnConjunto;

  public Operador(int numConjuntos, int numElementosEnConjunto){
    this.numElementosEnConjunto = numElementosEnConjunto;
    this.conjunto = new Conjunto[numConjuntos];
    for(int i = 0; i < numConjuntos; i++){
      conjunto[i] = new Conjunto(numElementosEnConjunto);
    }
  }

  public Conjunto get(int c){
    return conjunto[c];
  }
  public int getNumConjuntos(){
    return conjunto.length;
  }

  public int getNumElementosEnConjunto(){
    return numElementosEnConjunto;
  }

  public Conjunto interseccion(boolean[] c){
    Conjunto aux = new Conjunto(this.numElementosEnConjunto);
    for(int i = 0; i < this.numElementosEnConjunto; i++)    //inicializo el Conjunto a true
      aux.set(i, true);

    for(int i = 0; i < c.length; i++){
      if(c[i]){
        aux = aux.interseccion(conjunto[i]);
      }
    }
    return aux;
  }

  public Conjunto union(boolean[] c){ //array de booleanos que te dice que conjuntos[i] operar
    Conjunto aux = new Conjunto(this.numElementosEnConjunto);
      for(int i = 0; i < c.length; i++){
        if(c[i]){
          aux = aux.union(conjunto[i]);
      }
    }
    return aux;
  }

  public String toString(){
    String string = "\n";
    for(int i = 0; i < conjunto.length; i++){
      string += this.conjunto[i].toString();
    }
    return string;
  }
}
