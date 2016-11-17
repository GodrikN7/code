/*
Crear una agenda de personas, lo más completa posible, utilizando, al menos,
una clase "Persona" y otra clase "Agenda". La agenda mínima debe admitir altas,
bajas, recorridos y diversos tipos de consultas (por nombre, por teléfono,
por email, etc.).
*/
public class Sucio{
  /*PROPIEDADES*/
  private Persona[] persona;
  private int capacidad;
  private int posicion;

  /*CONSTRUCTORES*/
  public Sucio(int capacidad){
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

  // public void setCapacidad(int capacidad){    ->   no se puede modificar la
  //   this.persona.length = capacidad;              capacidad del array
  //}                                               persona[capacidad]
  public int getPosicion(){
    return posicion;
  }

  public void setPosicion(int posicion){
    this.posicion = posicion;
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
  public void verEstado(){
    System.out.println("Espacio total:" + getCapacidad());
    System.out.println("Espacio ocupado:" + getPersonas());
    System.out.println("Espacio libre:" + (getCapacidad()-getPersonas()));
  }
  public int getPersonas(){
    int personas = 0;
    for(int i = 0; i < getCapacidad(); i++){  // == for(int i = 0; i < this.personas.length; i++): la primera mas facil de mantener la segunda mas eficiente(no llama a una funcion)
      if(!(this.persona[i] == null)){
        personas++;
      }
    }
    return personas;
  }
  public boolean buscar(Persona persona){
    for(int i = 0; i < this.persona.length; i++){
      if(getPersona(i) != null){
        return buscar(persona, i);
      }
    }
    return false;
  }
  public boolean buscar(Persona persona, int i){
    if(this.persona[i] == persona){
      return true;
    }
    else return false;
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
  // public void add(Persona persona){
  //   if(!busca(persona)){
  //     agenda.hueco = agenda.hueco++;
  //     agenda.setPersona(persona[agenda.hueco]);
  //   }
  // }
  // public boolean equals(Persona persona){
  //   return this.persona[this == persona;
  // }
  // public boolean equals(Persona persona){
  //   return this.persona == persona;
  // }
  // public boolean buscar(Persona persona){
  //   for(int i = 0; i < this.persona.length; i++){
  //     if(/*this.persona[i].equals(persona)*/this.persona[i] == persona){
  //       this.posicion = i;
  //       return true;
  //     }
  //   }
  //   return false;
  // }
  //
  // public boolean buscar(String string){
  //   for(int i = 0; i < this.persona.length; i++){
  //     if(this.persona[i].getNombre().equals(string)){
  //       this.posicion = i;
  //       return true;
  //     }
  //     if(this.persona[i].getTelefono().equals(string)){
  //       this.posicion = i;
  //       return true;
  //     }
  //     if(this.persona[i].getApellido().equals(string)){
  //       this.posicion = i;
  //       return true;
  //     }
  //     if(this.persona[i].getDni().equals(string)){
  //       this.posicion = i;
  //       return true;
  //     }
  //     if(this.persona[i].getEmail().equals(string)){
  //       this.posicion = i;
  //       return true;
  //     }
  //   }
  //   return false;
  // }
  //
  // public boolean buscar(int integer){
  //   for(int i = 0; i < this.persona.length; i++){
  //     if(this.persona[i].getEdad() == integer){
  //       this.posicion = i;
  //       return true;
  //     }
  //   }
  //   return false;
  // }
  // public void buscarPersona(Persona persona){
  //   if(buscar(persona)){
  //     System.out.println(persona.getNombre() + " encontrado.");
  //   }
  //   else System.out.println(persona.getNombre() + " NO encontrado.");
  // }
  //
  // public void buscarString(String string){
  //
  //   if(buscar(string)){
  //     System.out.println(string + " encontrado " + this.persona[this.posicion]);
  //   }
  //   else System.out.println(string + " NO encontrado.");
  //   }
  //
  //
  //
  // public void buscarInt(int integer){
  //   if(buscar(integer)){
  //     System.out.println(integer + " Encontrado, " + this.persona[this.posicion]);
  //     /*verPersona(this.posicion);*/
  //   }
  //   else System.out.println(integer + " NO encontrado.");
  // }
  // // public void buscarTelefono(String string){
  // //   if(buscarString(string)){
  // //     System.out.println("Encontrado, " + verPersona(this.posicion));
  // //   }
  // //   else System.out.println(persona.getTelefono() + " NO encontrado.");
  // // }
  // // public void buscarApellido(String string){
  // //   if(buscarString(string)){
  // //     System.out.println("Encontrado, " + verPersona(this.posicion));
  // //   }
  // //   else System.out.println(persona.getApellido() + " NO encontrado.");
  // // }

  public void add(Persona persona){
    if(!buscar(persona)){
        this.persona[posicion] = persona;
        this.posicion++;
    }
    else System.out.println(persona.getNombre() + " ya pertenece a la agenda.");
  }

  public void add(Persona persona, int posicion){
    if(!buscar(persona)){
        this.persona[posicion] = persona;
    }
    else System.out.println(persona.getNombre() + " ya pertenece a la agenda.");

  }

  public void delete(Persona persona){
    for(int i = 0; i < this.persona.length; i++){
      if(buscar(persona, i)){
        for(int j = i+1; j < this.persona.length; j++){
          this.persona[i-1] = this.persona[i];
      }
    }
    else System.out.println(persona.getNombre() + " no pertenece a la agenda.");
  }
}

  public void delete(int posicion){
    for(int i = posicion+1; i < this.persona.length; i++){
      this.persona[i-1] = this.persona[i];
    }
  }

  // public boolean equals(Persona persona){
  //   return persona.getPersona() == persona;
  // }
}
