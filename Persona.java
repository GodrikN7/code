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
  private String  apellido;
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
  public Persona(String nombre, String telefono, String apellido){
    this(nombre, telefono);
    this.apellido = apellido;
  }
  public Persona(String nombre, String telefono, String apellido, int edad){
    this(nombre, telefono, apellido);
    this.edad = edad;
  }
  public Persona(String nombre, String telefono, String apellido, int edad, boolean sexo){
    this(nombre, telefono, apellido, edad);
    this.sexo = sexo;
  }
  public Persona(String nombre, String telefono, String apellido, int edad, boolean sexo, String dni){
    this(nombre, telefono, apellido, edad, sexo);
    this.dni = dni;
  }
  public Persona(String nombre, String telefono, String apellido, int edad, boolean sexo, String dni, String email){
    this(nombre, telefono, apellido, edad, sexo, dni);
    this.email = email;
  }
  /*Metodos*/
  public String getNombre(){
    return nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getApellido(){
    return apellido;
  }
  public void setApellido(String apellido){
    this.apellido = apellido;
  }

  public String getTelefono(){
    return telefono;
  }
  public void setTelefono(String telefono){
    this.telefono = telefono;
  }

  public int getEdad(){
    return edad;
  }
  public void setEdad(int edad){
    this.edad = edad;
  }

  public boolean getSexo(){
    return sexo;
  }
  public void setSexo(boolean sexo){
    this.sexo = sexo;
  }

  public String getDni(){
    return dni;
  }
  public void setDni(String dni){
    this.dni = dni;
  }

  public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }
  // public void equals(boolean equals){
  //   return equals.getNombre() == nombre;
  // }
  public String toString(){
    return "" + nombre + " " + telefono + " " + edad + " " +
    sexo + " " + dni + " " + email;
  }
}
