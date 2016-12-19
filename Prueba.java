import java.util.*;

public class Prueba{
  public static void main(String[] args) {
    ArrayList<String> candidatos = new ArrayList<String>();

    candidatos.add("catg");
    candidatos.add("ctaagt");
    candidatos.add("gcta");
    candidatos.add("ttca");
    candidatos.add("atgcatc");

    // candidatos.add("abb");
    // candidatos.add("bbc");
    // candidatos.add("bbb");

    // candidatos.add("geek");
    // candidatos.add("eke");

    // candidatos.add("BBB");
    // candidatos.add("BAA");
    // candidatos.add("BBA");

    Voraz v = new Voraz(candidatos);
  }
}
