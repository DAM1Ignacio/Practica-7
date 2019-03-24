
public class LibroBiblioteca {
	private String nombre;
	private String ISBN;
	private String Autor;
	private String Genero;
	private String Alquilado;
	private boolean disponible;
	
	public LibroBiblioteca(String nombre, String iSBN, String autor, String genero, boolean disponible) {
		super();
		this.nombre = nombre;
		ISBN = iSBN;
		Autor = autor;
		Genero = genero;
		this.disponible = disponible;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String getAlquilado() {
		return Alquilado;
	}
	public void setAlquilado(String alquilado) {
		Alquilado = alquilado;
	}

}
