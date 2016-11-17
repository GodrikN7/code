import java.util.*;

public class PruebaAgenda{
  public PruebaAgenda(){
    Agenda miAgenda = new Agenda(10);

    // Persona yo = new Persona("Rodrigo", "649596301", 19, 'M', "50478633G", "rjlallana@gmail.com");

    Persona yo = new Persona("Rodrigo");
    Persona casa = new Persona("Casa", "925142140");
    Persona alvaro = new Persona("Alvaro", "666666666", "Recalde");
    Persona alex = new Persona("Alejandro", "640404240", "Beato", 20);
    Persona ana = new Persona("Ana", "639405060", "Guardia", 47, 'F');
    Persona oscar = new Persona("Oscar", "625424045", "Gotor", 25, 'M', "45304530A");
    Persona jesus = new Persona("Jesus", "639596069", "Tirado",13, 'M', "12131415C", "jtv@gmail.com");
    Persona natalia  = new Persona("Natalia", "", "", 16, 'F', "", "");

    Persona clon = new Persona("Rodrigo");

    System.out.println("Agenda de Capacidad: " + miAgenda.getCapacidad());
    System.out.println();

    yo.setTelefono("649596301");
    yo.setEdad(19);
    yo.setSexo('M');
    yo.setDni("50478633G");
    yo.setEmail("rjlallana@gmail.com");

    System.out.println("Agenda vacia");
    System.out.println(miAgenda);

    miAgenda.add(yo);
    miAgenda.add(casa);
    miAgenda.add(alvaro);
    miAgenda.add(alex,3);
    miAgenda.add(ana,4);
    miAgenda.add(oscar);
    miAgenda.add(jesus);
    miAgenda.add(natalia,7);

    miAgenda.add(clon);
    System.out.println("\nUso del metodo add.");
    System.out.println(miAgenda);
    System.out.println();
    System.out.println(miAgenda.verEstado());

    System.out.println("\nUso del metodo update.");
    ana.setEmail("ana@yahoo.com");
    alex.setEdad(25);
    miAgenda.update(ana);
    miAgenda.update(alex);

    System.out.println();
    System.out.println(miAgenda);

    System.out.println("\nPrueba del metodo sobrecargado buscar");
    System.out.println("\nPara personas:");

    System.out.println(miAgenda.buscar(yo));
    System.out.println(miAgenda.buscar(ana));

    System.out.println("\nPara strings:");
    System.out.println(miAgenda.buscar("Rodrigo"));
    System.out.println(miAgenda.buscar("Layana"));
    System.out.println(miAgenda.buscar("640404240"));
    System.out.println(miAgenda.buscar("12131415C"));

    System.out.println("\n\nExcepcion para dominios de correos electronico:");
    System.out.println(miAgenda.buscar("@gmail.com"));
    System.out.println(miAgenda.buscar("@hotmail.com"));
    System.out.println(miAgenda.buscar("@yahoo.com"));

    System.out.println("\nBuscar por edad:");
    System.out.println(miAgenda.buscar(25));
    System.out.println(miAgenda.buscar(7));

    System.out.println("\nBuscar por sexo:");
    System.out.println(miAgenda.buscar('M'));
    System.out.println(miAgenda.buscar('F'));

    System.out.println(miAgenda);

    System.out.println("\nUso del metodo delete.");
    miAgenda.delete(casa);
    miAgenda.delete("Recalde");
    miAgenda.delete(2);

    System.out.println();
    System.out.println(miAgenda);

    System.out.println();
    System.out.println(miAgenda.verEstado());
    miAgenda.delete();
    System.out.println(miAgenda);

    }
  public static void main(String[] args){
    PruebaAgenda prueba = new PruebaAgenda();
  }
}
