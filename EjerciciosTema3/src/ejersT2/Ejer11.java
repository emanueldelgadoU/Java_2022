package ejersT2;

public class Ejer11 {

	static int cuentaDigitos(int num) {
		int contador=0;
		int division=0;
		
		do {
			division = (int) num / 10; //Divido entre 10 para quitar un dígito
			num = division; //num pasa a ser lo que queda dividido
			//System.out.println("Depuración: "+num);			
			contador++; //incremento el contador de dígitos
		} while (division > 0);
			
		
		
		return contador;
	}
	
	public static void main(String[] args) {
		System.out.println(cuentaDigitos(1234567891));

	}

}
