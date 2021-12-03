package EjerciciosClase;

public class Ejer1String {
	
	public static int contarVocales(String cad) {
		
		int contador=0;
		for(int i=0; i<cad.length(); i++) {
			char car = cad.charAt(i);
			/*
			if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'
					|| car == 'Ã¡' || car == 'Ã©' || car == 'Ã­' || car == 'Ã³' || car == 'Ãº') {
				contador++;
			}*/
			
			switch (car) {
				case 'a','e','i','o','u','á','é','í','ó','ú','A','E','I','O','U': {
					contador++;
					break;
				}
			}
		}
		
		return contador;
	}
	

	public static void main(String[] args) {
		
		String cadena = "Me gusta programar en Java los sÃ¡bados por la maÃ±ana";
		
		System.out.println(contarVocales(cadena));

	}

}
