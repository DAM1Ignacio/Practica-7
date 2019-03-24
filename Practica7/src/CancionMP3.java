
public class CancionMP3 {

	private int duracion;
	private int nombreCancion;
	private int cantante;
	private int album;
	private int genero;
	private String ruta;
	
	public CancionMP3(int duracion, int nombreCancion, int cantante, int album, int genero, String ruta) {
		super();
		this.duracion = duracion;
		this.nombreCancion = nombreCancion;
		this.cantante = cantante;
		this.album = album;
		this.genero = genero;
		this.ruta = ruta;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(int nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public int getCantante() {
		return cantante;
	}

	public void setCantante(int cantante) {
		this.cantante = cantante;
	}

	public int getAlbum() {
		return album;
	}

	public void setAlbum(int album) {
		this.album = album;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
}
