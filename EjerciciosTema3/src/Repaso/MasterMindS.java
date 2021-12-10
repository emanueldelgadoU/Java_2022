package Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class MasterMindS {

	public static void generarPalabra(int vector[]) {
		for(int i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random() * 9) + 1;
		}
		
	}
	
	public static int contarAciertos(String propuesta, int palabra[]) {
		int aciertos = 0;
		int vectorS[] = new int[palabra.length];
		
		for(int i=0; i<palabra.length; i++) {
			if (Character.getNumericValue(propuesta.charAt(i)) == palabra[i]) {
				aciertos++;
				vectorS[i] = palabra[i];
			} else {
				vectorS[i] = -1;
			}
		}
		
		System.out.println(Arrays.toString(vectorS));
		//System.out.println(Arrays.toString(palabra));
		return aciertos;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		do {
			System.out.println("Introduce opcion: ");
			System.out.println("1.Jugar");
			System.out.println("2.Salir");
			
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//Jugar
			if (opcion == 1) {
				System.out.println("Bienvenido a Master Mind");
				System.out.println("------------------------");
				System.out.println();
				int longitud = 0;
				System.out.println("Introduce longitud de la cadena a buscar");
				try {
					longitud = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if ((longitud > 2) && (longitud < 9)) {
					int palabra[] = new int[longitud];
					generarPalabra(palabra);
					
					//Intentar adivinarlo
					String propuesta = new String();
					int aciertos=0;
					do {
						System.out.println("Escribe tu solución");
						propuesta = sc.nextLine();
						
						if (propuesta.compareTo("0") != 0) { //No salir
							aciertos = contarAciertos(propuesta, palabra);
							System.out.println("Has acertado "+aciertos);
							if (aciertos == palabra.length) {
								System.out.println("Enhorabuena, acertaste");
								System.out.println();
								return;
							}
						}
					} while ( (propuesta.compareTo("0") != 0) && (aciertos != palabra.length) );

				} else {
					System.out.println("Longitud incorrecta, :(");
				}

			} else if (opcion == 2) {
				System.out.println("Adiós ");
			} else {
				System.out.println("Introduce una opción válida (1 ó 2)");
			}
			
		} while (opcion != 2);

	}

}
