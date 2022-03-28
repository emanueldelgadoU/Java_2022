package lecturaescritura1;

public class EjerciciosClase {

	public static void main(String[] args) {
		System.out.println("Este código es el bueno");

		
		Distancia<Integer> di = new Distancia<>(3);
		System.out.println(di.getDist());
		
		Distancia<Double> db = new Distancia<>(3.9999);
		System.out.println(db.getDist());
		
		/* Error String no hereda de Number
		Distancia<String> db = new Distancia<>("Hola");
		System.out.println(db.getDist());
		*/
		
		/**
		 * Esto vale si Distancia<T extends Comparando>
		 */
		/*
		Distancia<NumerosJavi> di = new Distancia<>(new NumerosJavi(3));
		System.out.println(di.getDist());
		*/
		
		//dni, edad
		ParOrdenado<String, Integer> paro1 = new ParOrdenado<>("45546790A", 20);
		System.out.println(paro1);
		
		//id, nombre
		ParOrdenado<Integer, Compleja> paro2 = new ParOrdenado<>(1,new Compleja());
		ParOrdenado<Integer, Compleja> paro3 = new ParOrdenado<>(2,new Compleja());
		System.out.println(paro2);
		
		ParOrdenado<Compleja, Integer> paro4 = new ParOrdenado<>(new Compleja(), 2);
		
		
		
		
 		
		
	}

}
