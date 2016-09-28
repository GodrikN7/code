/*
Crear una agenda de personas, lo más completa posible, utilizando, al menos,
una clase "Persona" y otra clase "Agenda". La agenda mínima debe admitir altas,
bajas, recorridos y diversos tipos de consultas (por nombre, por teléfono,
por email, etc.).
*/
public class Agenda{
  /*Propiedades*/
  private Persona[] persona;
  private int capacidad;
  private static int pos;

  /*Constructores*/
  public Agenda(int capacidad){
    this.capacidad = capacidad;
    // this.persona[capacidad] = persona;
    this.pos = 0;
  }
  // public Agenda(int hueco, Persona[] persona){
  //   agenda = new Persona[capacidad];
  //   this.huecos = capacidad;
  //   this.ocupados  = 0;
  // }
  public Persona[] getPersona(){
    return persona;
  }
  public void setPersona(Persona[] persona){
    this.persona[pos] = persona;
    setPos(pos);
  }

  public int getCapacidad(){
    return capacidad;
  }
  public String toString(){
    return "" + persona + "" + capacidad + ""  + pos;

  }
  // public int setCapacidad(int capacidad){
  //   this.capacidad = capacidad;
  //}
  public static int getPos(){
    return pos;
  }
  public static void setPos(int pos){
    pos = pos + 1;

  }
  // public void add(Persona persona){
  //   if(!busca(persona)){
  //     agenda.hueco = agenda.hueco++;
  //     agenda.setPersona(persona[agenda.hueco]);
  //   }
  // }
  // public boolean busca(Persona persona){
  //   for(i = 0; i < agenda.length; i++){
  //     if(agenda.persona[i] == persona;
  //     return true;
  //   }
  //   return false;
  // }
  // public boolean equals(Persona persona){
  //   return persona.getPersona() == persona;
  // }
}
