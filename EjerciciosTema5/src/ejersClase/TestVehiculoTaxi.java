package ejersClase;

public class TestVehiculoTaxi {

	public static void main(String[] args) {
		
		Taxi mitaxi = new Taxi("9999GGG","Mercedes","1123123");	
		Vehiculo v = (Vehiculo) mitaxi;
		
		v.mensaje();
		
		/*
		Vehiculo v2 = new Vehiculo("8888HIK","BMW");
		Taxi mitaxi2 = (Taxi) v2;
		 */
	}

}
