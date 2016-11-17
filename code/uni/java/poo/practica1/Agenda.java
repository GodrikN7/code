public class Agenda{
  /*PROPIEDADES*/
  private Persona[] persona;
  private int capacidad;
  private int posicion;

  /*CONSTRUCTORES*/
  Agenda(int capacidad){
    this.persona = new Persona[capacidad];
    this.posicion = 0;
  }
  /*METODOS*/
    //getters y setters

  public Persona getPersona(int posicion){
    return this.persona[posicion];
  }

  public void setPersona(Persona persona){
    this.persona[posicion] = persona;
    this.posicion++;
  }

  public int getCapacidad(){
    return persona.length;
  }

  public int getPosicion(){
    return posicion;
  }

  public void setPosicion(int posicion){
    this.posicion = posicion;
  }
  // public void buscarString(String string){
  //   for(this.posicion = 0; this.posicion < this.persona.length;){
  //     if(buscar(string, this.posicion))
  //       System.out.println("Encontrado, " + this.persona[posicion]);
  //     else
  //       System.out.println(string + " NO encontrado.");
  //   }
  // }
  // public boolean buscar(String string){
  //   for(int i = 0; i < this.persona.length; i++){
  //     if(this.persona[i].getNombre() == string){
  //       this.posicion = i;
  //       return 'M';
  //     }
  //     if(this.persona[i].getTelefono() == string){
  //       this.posicion = i;
  //       return 'M';
  //     }
  //     if(this.persona[i].getApellido() == string){
  //         this.posicion = i;
  //         return 'M';
  //     }
  //     if(this.persona[i].getDni() == string){
  //           this.posicion = i;
  //           return 'M';
  //     }
  //     if(this.persona[i].getEmail() == string){
  //       this.posicion = i;
  //       return 'M';
  //     }
  //   }
  //   return 'F';
  // }
  // public boolean buscar(String string, int posicion){
  //   for(int i = posicion; i < this.persona.length; i++){
  //     if(this.persona[i].getNombre() == string){
  //       this.posicion = i;
  //       return 'M';
  //     }
  //     if(this.persona[i].getTelefono() == string){
  //       this.posicion = i;
  //       return 'M';
  //     }
  //     if(this.persona[i].getApellido() == string){
  //         this.posicion = i;
  //         return 'M';
  //     }
  //     if(this.persona[i].getDni() == string){
  //           this.posicion = i;
  //           return 'M';
  //     }
  //     if(this.persona[i].getEmail() == string){
  //       this.posicion = i;
  //       return 'M';
  //     }
  //   }
  //   return 'F';
  // }

  public String toString(){
    String s = "";
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i)!=null)
        s = s + "\n" + getPersona(i).toString();
      else s = s + "\n" + "VACIO";
    }
    return s;
  }
  public void verEstado(){
    System.out.println("Espacio total:" + getCapacidad());
    System.out.println("Espacio ocupado:" + getPersonas());
    System.out.println("Espacio libre:" + (getCapacidad()-getPersonas()));
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
  public boolean buscar(Persona persona){
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i) != null){
        buscar(persona, i);
      }
    }
    return false;
  }
  // public boolean equals(Persona persona, int i){
  //   return this.persona[i] == persona;
  // }
  public boolean buscar(Persona p, int i){
    return p.equals(getPersona(i));
  }
  public boolean buscar(String string){
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i) != null)
        buscar(string, i);
    }
    return false;
  }

  public boolean buscar(String string, int i){
    if(this.persona[i].getNombre().equals(string)){
      this.posicion = i;
      return true;
    }
    if(this.persona[i].getTelefono().equals(string)){
      this.posicion = i;
      return true;
    }
    if(this.persona[i].getApellido().equals(string)){
      this.posicion = i;
      return true;
    }
    if(this.persona[i].getDni().equals(string)){
      this.posicion = i;
      return true;
    }
    if(this.persona[i].getEmail().equals(string)){
      this.posicion = i;
      return true;
    }
    return false;
  }
  public boolean buscar(int integer){
    for(int i = 0; i < this.persona.length; i++){
      if(this.persona[i].getEdad() == integer && getPersona(i)!=null){
        this.posicion = i;
        return true;
      }
    }
    return false;
  }
  public boolean add(Persona persona){
    for(int i = 0; i < this.persona.length; i++){
      if(!buscar(persona, i) || getPersona(i) == null){
        this.persona[i] = persona;
        return true;
      }
    }
    return false;
  }
  public boolean add(Persona persona, int i){
    if(!buscar(persona, i) || getPersona(i) == null){
      this.persona[i] = persona;
      return true;
    }
    return false;
  }

  public void delete(Persona persona){
    for(int i = 0; i < this.persona.length; i++){
      if(buscar(persona, i)){
        for(int j = i+1; j < this.persona.length; j++){
          this.persona[i-1] = this.persona[i];
        }
      }
    }
  }
}
