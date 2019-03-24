
public class Carta {
	private String Direccion;
	private String texto;

	public Carta(String direccion, String texto) {
		super();
		Direccion = direccion;
		this.texto = texto;
	}
	
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
