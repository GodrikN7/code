// package practica3;
public class ListaCanciones{
  //ATRIBUTOS
  private Cancion[] canciones;
  private int numCanciones;
  //CONSTRUCTORES
  public ListaCanciones(int numMaxCanciones){
    this.canciones = new Cancion[numMaxCanciones];
  }
  public int getNumCanciones(){
    int canciones = 0;
    for(int i = 0; i < this.canciones.length; i++){
      if(this.canciones[i] != null)
        canciones++;
    }
    return canciones;
  }
  public boolean completo(){
    int j = 0;
    for(int i = 0; i < this.canciones.length; i++){
      if(this.canciones[i] != null)
        j++;
    }
    return j == this.canciones.length;
  }
  public int existe(Cancion c){
    for(int i = 0; i < this.canciones.length; i++){
      if(this.canciones[i] != null){
        if(this.canciones[i].equals(c))
          return i;
      }
    }
    return -1;
  }
  public boolean add(Cancion c){
    if(!completo()){
      for(int i = 0; i < this.canciones.length; i++){
        if(this.canciones[i] == null){
          this.canciones[i] = c;
          this.numCanciones = this.numCanciones + 1;
          return true;
        }
      }
    }
    return false;
  }
  public boolean add(int posicion, Cancion c){
    if(!completo()){
      if(this.canciones[posicion] == null){
        this.canciones[posicion] = c;
        this.numCanciones = this.numCanciones + 1;
        return true;
      }
    }
    return false; //ya existe o la lista esta llena
  }
  public boolean delete(Cancion c){
    for(int i = 0; i < this.canciones.length; i++){
      if(this.canciones[i] != null){
        if(this.canciones[i].equals(c)){
          this.numCanciones = this.numCanciones -1;
          for(i = i + 1; i < this.canciones.length; i++)
            this.canciones[i-1] = this.canciones[i];
          return true;
        }
      }
    }
    return false;
  }
  public boolean delete(int posicion){
    int i;
    i = posicion;
    if(this.canciones[posicion] != null){
      this.numCanciones = this.numCanciones -1;
      for(i = i + 1; i < this.canciones.length; i++)
        this.canciones[i-1] = this.canciones[i];
      return true;
    }
    return false;
  }
  public boolean cambiar(int posicion, Cancion c){
    Cancion aux;
    if(existe(c) != -1 || this.canciones[posicion] == null) //esta en el cd si te da una posicion distinta de -1
      return false;
    else{
      aux = c;
      c = this.canciones[posicion];
      this.canciones[posicion] = aux;
      return true;
    }
  }
  public boolean cambiar(int posicion1, int posicion2){
    if(this.canciones[posicion1] != null && this.canciones[posicion2] != null){
      Cancion aux;
      aux = this.canciones[posicion1];
      this.canciones[posicion1] = this.canciones[posicion2];
      this.canciones[posicion2] = aux;
      return true;
    }
    else return false;
  }
  public Cancion get(int posicion){
    if(existe(this.canciones[posicion]) == -1)
      return null;
    else{
      return this.canciones[posicion];
    }
  }
  public String toString(){
    String s = "";
    for(int i = 0; i < this.canciones.length; i++){
      if(this.canciones[i] != null)
        s += "\n" + this.canciones[i].toString();
      else s += "\n" + "VACIO";
    }
    return s;
  }
}
