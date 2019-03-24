package Apartado4;

public class Alarma {

	private double umbral;
	private Sensor sensor;
	private Timbre timbre;
	
	public Alarma(double umbral, Sensor sensor, Timbre timbre) {
		this.umbral = umbral;
		this.sensor = sensor;
		this.timbre = timbre;
	}
	
	public void comprobar() {
		if(sensor.getValorActual()>=umbral) {
			timbre.activar();
		}
	}

}
