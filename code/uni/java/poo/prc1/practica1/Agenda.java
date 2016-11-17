public class Agenda{
  /*PROPIEDADES*/
  private Persona[] persona;
  private int capacidad;

  /*CONSTRUCTORES*/
  Agenda(int capacidad){
    this.persona = new Persona[capacidad];
  }
  /*METODOS*/
    //getters y setters
  public Persona getPersona(int posicion){
    return this.persona[posicion];
  }

  public void setPersona(Persona persona, int posicion){
    this.persona[posicion] = persona;
  }

  public int getCapacidad(){
    return persona.length;
  }

  public String toString(){
    String s = "";
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i)!=null)
        s = s + "\n" + getPersona(i).toString();
      else s = s + "\n" + "VACIO";
    }
    return s;
  }

  public String verEstado(){
  return "Espacio total:" + getCapacidad() + "\n"
  + "Espacio ocupado:" + getPersonas() + "\n"
  + "Espacio libre:" + (getCapacidad()-getPersonas());
  }

  public int getPersonas(){
    int personas = 0;
    for(int i = 0; i < getCapacidad(); i++){  // == for(int i = 0; i < this.personas.length; i++): la primera mas facil de mantener la segunda mas eficiente(no llama a una funcion)
      if(!(getPersona(i) == null)){
        personas++;
      }
    }
    return personas;
  }

  public String buscar(Persona persona){
    String resul = "Persona NO encontrada";
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i) != null && buscarAux(persona, i))
        resul = "Persona encontrada: " + persona;
    }
    return resul;
  }
  private boolean buscarAux(Persona p, int i){  //no tiene sentido usar esta funcion desde fuera por eso private
    return p == getPersona(i);
  }


  public String buscar(String string){
    String resul = string;
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i) != null)
        if(buscarAux(string, i))
          resul += "\n" + "\t" +"Encontrado "+ getPersona(i).toString();
    }
    if(resul.equals(string)) //si al acabar la busqueda se ha quedado igual/no ha encontrado nada;
      resul += "\n"+"\t"+"NO Encontrado.";
    return resul;
  }
  private boolean buscarAux(String string, int i){ //funcion auxiliar por eso lo pongo como private;
    boolean resul = false;
    if(this.persona[i].getNombre() != null && this.persona[i].getNombre().equals(string))
      resul = true;
    if(this.persona[i].getTelefono() != null && this.persona[i].getTelefono().equals(string))
      resul = true;
    if(this.persona[i].getApellido() != null && this.persona[i].getApellido().equals(string))
      resul = true;
    if(this.persona[i].getDni() != null && this.persona[i].getDni().equals(string))
      resul = true;
    if(this.persona[i].getEmail() != null && this.persona[i].getEmail().equals(string))
      resul = true;
    //Excepcion para la busqueda por dominio de correo.
    if(this.persona[i].getEmail() != null && string.charAt(0) == '@')
      for(int j = 0; j < this.persona[i].getEmail().length(); j++)
        if(this.persona[i].getEmail().charAt(j) == '@')
          if (this.persona[i].getEmail().substring(j).equals(string))
            resul = true;
    return resul;
  }

  public String buscar(int entero){
    String resul = "";
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i) != null)
        if(entero == getPersona(i).getEdad())
            resul +="\n" + "\t" + "Encontrado: " + getPersona(i).toString();
    }
    if(resul == "") //si al acabar la busqueda se ha quedado igual/no ha encontrado nada;
      resul += "\n"+"\t"+"NO encontrado.";
    return entero + resul;
  }

  public String buscar(char caracter){
    String resul = "";
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i) != null)
      if(caracter == getPersona(i).getSexo())
      resul +="\n" + "\t" + "Encontrado: " + getPersona(i).toString();
    }
    if(resul == ("")) //si al acabar la busqueda se ha quedado igual/no ha encontrado nada;
      resul += "\n"+"\t"+"NO encontrado.";
    return caracter + resul;
    }
  public boolean add(Persona persona){
    for(int i = 0; i < getCapacidad(); i++){
      if(getPersona(i) == null){
        setPersona(persona, i);
        return true;
      }
    }
  return false;
  }
  public boolean add(Persona persona, int i){
    if(getPersona(i) == null){
      setPersona(persona, i);
      return true;
    }
  else return false;
  }
  public boolean update(Persona persona){
    for(int i = 0; i < getCapacidad(); i++){
      if(getPersona(i) != null)
        if(getPersona(i) == persona){
          setPersona(persona, i);
          return true;
        }
      }
    return false;
  }
  //sobrecarga
  public void delete(){
    for(int i = 0; i < this.persona.length; i++){
      this.setPersona(null, i);
    }
  }
  public void delete(int i){
    for(i = i + 1; i < this.persona.length; i++)
      this.persona[i-1] = this.persona[i];
  }
  public void delete(Persona persona){
    for(int i = 0; i < this.persona.length; i++)
      if(getPersona(i) != null && buscarAux(persona, i))
        delete(i);
  }
  public void delete(String string){
    for(int i = 0; i < this.persona.length; i++)
      if(getPersona(i) != null && buscarAux(string, i))
        delete(i);
  }
}
