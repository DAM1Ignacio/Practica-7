
public class LibroLibreria {
	private String nombre;
	private String ISBN;
	private String Autor;
	private String Genero;
	private int precio;;
	private boolean disponible;
	
	public LibroLibreria(String nombre, String iSBN, String autor, String genero, boolean disponible, int precio) {
		super();
		this.nombre = nombre;
		ISBN = iSBN;
		Autor = autor;
		Genero = genero;
		this.disponible = disponible;
		this.precio=precio;
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
	public int getPrecio(){
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
