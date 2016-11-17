// package practica3;

public class Cancion {
	private String  titulo;
	private String  autor;

	public Cancion(String titulo, String autor){
		this.titulo = titulo;
		this.autor = autor;
	}

	public Cancion clone(){
		return new Cancion (titulo, autor);
	}

	public String  toString(){
		return("titulo: " + titulo + ",  autor: " + autor + "\n");
	}

	boolean equals(Cancion c){
		return((titulo.equals(c.titulo))&&(autor.equals(c.autor)));
	}

	public String  getTitulo(){
		return titulo;
	}

	String  getAutor(){
		return autor;
	}

}
