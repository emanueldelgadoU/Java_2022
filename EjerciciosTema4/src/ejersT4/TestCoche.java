package ejersT4;

public class TestCoche {

	public static void main(String[] args) {
		
		Coche car = new Coche();
		car.acelera(50);
		car.frena(20);
		car.acelera(100);
		System.out.println(car.getVelocidad());
	}
}
