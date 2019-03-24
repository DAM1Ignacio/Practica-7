import java.util.Vector;

public class Poligono {

	private int[] lados;

	public Poligono(int[] lados) {
		super();
		this.lados = lados;
	}

	public int[] getLados() {
		return lados;
	}

	public void setLados(int[] lados) {
		this.lados = lados;
	}

	public int perimetro() {
		int perimetro = 0;
		for (int i = 0; i < lados.length; i++) {
			perimetro += lados[i];
		}
		return perimetro;
	}

}
