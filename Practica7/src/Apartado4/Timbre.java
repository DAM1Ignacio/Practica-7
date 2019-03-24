package Apartado4;

public class Timbre {
	private boolean estado;
	
	public Timbre() {
		setEstado(false);
	}
	
	public void activar() {
		setEstado(true);
	}
	
	public void desactivar() {
		setEstado(false);
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
