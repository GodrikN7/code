public class PruebaListaCanciones{
  public PruebaListaCanciones(){
    Cancion stan = new Cancion("Stan","Elton Jon");
    Cancion letitbe = new Cancion("Let it be","Paul McCartney");
    Cancion imagine = new Cancion("Imagine", "Jonh Lennon");
    Cancion slimshady = new Cancion("Slim Shady","Eminem");
    Cancion darude = new Cancion("Sandstorm", "Darude");
    Cancion sonofman = new Cancion("Son of Man","Phils Colin");
    Cancion starwars = new Cancion("Marcha imperial","");

    ListaCanciones discografica = new ListaCanciones(6);
    discografica.add(stan);
    discografica.add(letitbe);
    discografica.add(imagine);
    discografica.add(slimshady);
    discografica.add(darude);
    discografica.add(sonofman);
    discografica.add(starwars);
  }
  public static void main(String[] args) {
    PruebaListaCanciones prueba = new PruebaListaCanciones();
  }
}
