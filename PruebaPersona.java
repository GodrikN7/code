import java.util.*;

public class PruebaPersona{
  public PruebaPersona(){
    // public Persona(String nombre, String apellido, String telefono, int edad, boolean sexo, String dni, String email){

    Persona yo = new Persona("Rodrigo");
    Persona tu = new Persona("Alvaro");

    yo.setTelefono("649596301");
    yo.setApellido("Lallana");
    yo.setEdad(19);
    yo.setSexo(true);
    yo.setDni("50478633G");
    yo.setEmail("rjlallana@gmail.com");

    System.out.println(tu+"\n"+yo);
    System.out.println();

    tu.setNombre("Varox");
    tu.setTelefono("666666666");
    tu.setEdad(19);
    System.out.println(tu.getNombre() + " " + tu.getTelefono() + " " + tu.getEdad());

    System.out.println(yo);

  }

  public static void main(String[] args){
    PruebaPersona prueba = new PruebaPersona();
  }
}
