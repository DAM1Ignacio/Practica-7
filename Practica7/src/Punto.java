
public class Punto {
	private int X;
	private int Y;
	
	public Punto(int X, int Y) {
		setX(X);
		setY(Y);
	}
	
	public Punto() {
		this(0,0);
	}
	
	public Punto(Punto punto) {
		setX(punto.getX());
		setY(punto.getY());
	}
	
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

}
