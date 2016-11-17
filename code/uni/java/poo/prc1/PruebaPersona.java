import java.util.*;

public class PruebaPersona{
  public PruebaPersona(){
    Persona yo = new Persona("Rodrigo");
    Persona tu = new Persona("Alvaro");

    yo.setApellido("Lallana");
    yo.setTelefono("649596301");
    yo.setEdad(19);
    yo.setSexo('M');
    yo.setDni("50478633G");
    yo.setEmail("rjlallana@gmail.com");

    System.out.println(tu+"\n"+yo); //==(yo.toString())
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
