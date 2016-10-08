import java.util.*;

public class PruebaAgenda{
  public PruebaAgenda(){
    Agenda miAgenda = new Agenda(10);

    // Persona yo = new Persona("Rodrigo", "649596301", 19, true, "50478633G", "rjlallana@gmail.com");

    Persona yo = new Persona("Rodrigo");
    Persona casa = new Persona("Casa", "925142140");
    Persona alvaro = new Persona("Alvaro", "666666666", "Recalde");
    Persona alex = new Persona("Alejandro", "640404240", "Beato", 20);
    Persona ana = new Persona("Ana", "639405060", "Guardia", 47, false);
    Persona oscar = new Persona("Oscar", "625424045", "Gotor", 25, true, "45304530A");
    Persona jesus = new Persona("Jesus", "639596069", "Tirado",13, true, "12131415C", "jtv@gmail.com");
    Persona natalia  = new Persona("Natalia", "", "", 16, false, "", "");

    Persona clon = new Persona("Rodrigo");

    System.out.println("Agenda de Capacidad: " + miAgenda.getCapacidad());
    System.out.println();

    yo.setTelefono("649596301");
    yo.setEdad(19);
    yo.setSexo(true);
    yo.setDni("50478633G");
    yo.setEmail("rjlallana@gmail.com");

    miAgenda.add(yo);
    miAgenda.add(casa);
    miAgenda.add(alvaro);
    miAgenda.add(alex);
    miAgenda.add(ana);
    miAgenda.add(oscar);
    miAgenda.add(jesus);
    miAgenda.add(natalia);

    miAgenda.add(clon);

    miAgenda.verAgenda();
    System.out.println();
    miAgenda.verEstado();

    miAgenda.delete(ana);
    miAgenda.delete(casa);
    miAgenda.delete(alvaro);

    System.out.println();

    miAgenda.verAgenda();
    System.out.println();
    miAgenda.verEstado();

    System.out.println();



    miAgenda.buscarPersona(alvaro);System.out.println(miAgenda.getPosicion());
    miAgenda.buscarPersona(oscar);  System.out.println(miAgenda.getPosicion());
    miAgenda.buscarInt(25);
    miAgenda.buscarInt(7);
    miAgenda.buscarString("Rodrigo");   System.out.println(miAgenda.getPosicion());
    miAgenda.buscarString("jtv@gmail.com"); System.out.println(miAgenda.getPosicion());
    miAgenda.buscarString("Guardia");

    System.out.println();

    miAgenda.add(ana, 9);
    miAgenda.add(casa, 8);
    miAgenda.add(alvaro,7);

    miAgenda.verAgenda();
    System.out.println();
    miAgenda.verEstado();

    System.out.println();

    System.out.println(miAgenda.getPersona(3));
  }
  public static void main(String[] args){
    PruebaAgenda prueba = new PruebaAgenda();
  }
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
//       return true;
//     }
//     if(this.persona[i].getTelefono() == string){
//       this.posicion = i;
//       return true;
//     }
//     if(this.persona[i].getApellido() == string){
//         this.posicion = i;
//         return true;
//     }
//     if(this.persona[i].getDni() == string){
//           this.posicion = i;
//           return true;
//     }
//     if(this.persona[i].getEmail() == string){
//       this.posicion = i;
//       return true;
//     }
//   }
//   return false;
// }
// public boolean buscar(String string, int posicion){
//   for(int i = posicion; i < this.persona.length; i++){
//     if(this.persona[i].getNombre() == string){
//       this.posicion = i;
//       return true;
//     }
//     if(this.persona[i].getTelefono() == string){
//       this.posicion = i;
//       return true;
//     }
//     if(this.persona[i].getApellido() == string){
//         this.posicion = i;
//         return true;
//     }
//     if(this.persona[i].getDni() == string){
//           this.posicion = i;
//           return true;
//     }
//     if(this.persona[i].getEmail() == string){
//       this.posicion = i;
//       return true;
//     }
//   }
//   return false;
// }
