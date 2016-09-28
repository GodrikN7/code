import java.util.*;

public class PruebaAgenda{
  public PruebaAgenda(){
    Agenda agenda = new Agenda(10);

    System.out.println(agenda.getCapacidad());
    agenda.setCapacidad(20);
    System.out.println(agenda.getCapacidad());
  }

  public static void main(String[] args){
    PruebaAgenda prueba = new PruebaAgenda();
    // Agenda a = new Agenda(10);
    // System.out.println("agenda: ");
    // System.out.println(a.getCapacidad());
  }
}
