
public class PuntoCartesiano {


	private int CordenadaX;
	private int CordenadaY;
	
	public PuntoCartesiano(int X, int Y) {
		setX(X);
		setY(Y);
	}
	
	public PuntoCartesiano() {
		this(0,0);
	}
	
	public PuntoCartesiano(Punto punto) {
		setX(punto.getX());
		setY(punto.getY());
	}
	
	public int getX() {
		return CordenadaX;
	}

	public void setX(int x) {
		CordenadaX = x;
	}

	public int getY() {
		return CordenadaY;
	}

	public void setY(int y) {
		CordenadaY = y;
	}



}
