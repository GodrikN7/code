import java.util.*;

public class Voraz {
  private List<String> candidatos;
  public Voraz(ArrayList<String> candidatos) {
    String resultado;
    this.candidatos = candidatos;
    resultado = algoritmoVoraz(candidatos);
    System.out.println("Superstring: " + resultado);
    System.out.println("De tamanio : " + resultado.length());
  }

  public String algoritmoVoraz(ArrayList<String> candidatos) {
    //  Crear una copia de los candidatos.
    ArrayList<String> copiaCandidatos = new ArrayList<String>(candidatos);

    //  Inicializar la superstring y el candidato.
    String candidato;
    String superstring = "";

    //  Selecciona candidatos mientras haya en el ArrayList al menos 2 o mas  elementos
    while(copiaCandidatos.size() > 1) {
      // Devuelve el mejor candidato a superstring del ArrayList copiaCandidatos
      candidato = seleccionarCandidato(copiaCandidatos);
      copiaCandidatos.add(candidato);
    }

    //  Una vez acabado nos quedamos con un ArrayList de un solo elemento, este
    //  elemento corresponde con el superstring de tamanio mas corto
    superstring = copiaCandidatos.get(0);
    return superstring;
  }

  //  Devuelve el mejor superstring, se considera mejor superstring aquel que
  //  tiene mas letras coincidentes empezando por el final con los demas
  //  empezando por principio.
  public String seleccionarCandidato(ArrayList<String> candidatos) {
    String superstring = null;
    //  Guarde el numero de caracteres coincidentes entre 2 Strings
    int coincidentes;
    //  Guarda el mayor numero de caracteres coincidentes entre 2 Strings
    int coincidentesMax = 0;
    //  Guarda los 2 Strings que se van a concatenar para formar el superstring
    //  para posteriormente borrarlos.
    String iRemove = null;
    String jRemove = null;

    for(String iString : candidatos) {
      coincidentes = 0;
      for(String jString : candidatos) {
        // Para que no se compare con el mismo, ni halla NullPointersExceptions
        if(jString.length() < iString.length()) {
          // Comprueba todos los posibles superstrings de iString con jString
          for(int i = 0; i < jString.length(); i++) {
            if(esValidoCandidato(iString, jString, i)) {
              coincidentes = i + 1;
            }
          }
          // Si coincidentes es mayor que coincidentesMax significa que se ha encontrado un
          // resultado mejor, por lo que actualiza el mejor candidato.
          if(coincidentes >= coincidentesMax) {
            coincidentesMax = coincidentes;
            iRemove = iString;
            jRemove = jString;
            superstring = iString + jString.substring(coincidentes);
          }
        }
      }
    }
    //  Elimina los dos Strings eligidos para formar el superstring
    candidatos.remove(iRemove);
    candidatos.remove(jRemove);
    //  Devuelve el superstring
    return superstring;
  }

  public boolean esValidoCandidato(String iString, String jString, int posicion) {
    // True si iString tiene el mismo substring por el final que jString por el principio
    return iString.substring(iString.length()-posicion).equals(jString.substring(0, posicion));
  }
}
