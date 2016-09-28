/*
Crear una agenda de personas, lo más completa posible, utilizando, al menos,
una clase "Persona" y otra clase "Agenda". La agenda mínima debe admitir altas,
bajas, recorridos y diversos tipos de consultas (por nombre, por teléfono,
por email, etc.).
*/
public class Persona{
  /*Propiedades*/
  private String  nombre;
  private String  telefono;
  private int     edad;
  private boolean sexo;
  private String  dni;
  private String  email;
  /*Constructores*/
  public Persona(String nombre){
    this.nombre = nombre;
  }
  public Persona(String nombre, String telefono){
    this(nombre);            // == Persona(nombre)
    this.telefono = telefono;
  }
  public Persona(String nombre, String telefono, int edad){
    this(nombre, telefono);
    this.edad = edad;
  }
  public Persona(String nombre, String telefono, int edad, boolean sexo){
    this(nombre, telefono, edad);
    this.sexo = sexo;
  }
  public Persona(String nombre, String telefono, int edad, boolean sexo, String dni){
    this(nombre, telefono, edad, sexo);
    this.dni = dni;
  }
  public Persona(String nombre, String telefono, int edad, boolean sexo, String dni, String email){
    this(nombre, telefono, edad, sexo, dni);
    this.email = email;
  }
  /*Metodos*/
  public String getNombre(){
    return nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void getTelefono(){
    return telefono;
  }
  public String setTelefono(String telefono){
    this.telefono = telefono;
  }

  public void getEdad(){
    return edad;
  }
  public int setEdad(int edad){
    this.edad = edad;
  }

  public void getSexo(){
    return sexo;
  }
  public boolean setSexo(){
    this.sexo = sexo;
  }

  public void getDni(){
    return dni;
  }
  public String setDni(String dni){
    this.dni = dni;
  }

  public void getEmail(){
    return email;
  }
  public String email(String email){
    this.email = email;
  }
  // public void equals(boolean equals){
  //   return equals.getNombre() == nombre;
  // }
  public String toString(){
    return "" + nombre + " " + telefono + " "  + edad;
  }
}
