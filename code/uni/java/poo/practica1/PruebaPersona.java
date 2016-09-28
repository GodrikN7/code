import java.util.*;

public class PruebaPersona{
  public PruebaPersona(){
    Persona yo = new Persona("Rodrigo", "649596301", 0);
    Persona tu = new Persona("Alvaro", "", 19);

    System.out.println(tu+"\n"+yo);
    yo.setEdad(19);
    tu.setTelefono("666666666");
    // 
    // System.out.println(yo.getEdad());
    // System.out.println(tu.getTelefono());
  }

  public static void main(String[] args){
    PruebaPersona prueba = new PruebaPersona();
    // Agenda a = new Agenda(10);
    // System.out.println("agenda: ");
    // System.out.println(a.getCapacidad());
  }
}
