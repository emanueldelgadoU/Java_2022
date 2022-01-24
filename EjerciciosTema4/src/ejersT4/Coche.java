package ejersT4;

public class Coche {

	private int velocidad;

	public Coche() {
		velocidad = 0;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public void acelera(int mas) {
		this.velocidad += mas;
	}
	
	public void frena(int menos) {
		this.velocidad -= menos;
	}
	
	
}
