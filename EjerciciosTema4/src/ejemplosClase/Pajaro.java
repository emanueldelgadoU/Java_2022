package ejemplosClase;

public class Pajaro {

	//Propiedades
	private int edad;
	private char color;
	
	//Métodos
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setColor(char color) {
		this.color = color;
	}
	
	public void printEdad() {
		System.out.println(edad);
	}
	
	public void printColor() {
		switch (color) {
		case 'r': {
			System.out.println("Rojo");
			break;
		}
		case 'v': {
			System.out.println("Verde");
			break;
		}
		case 'a': {
			System.out.println("Amarillo");
			break;
		}
		case 'b': {
			System.out.println("Blanco");
			break;
		}		
		default:
			System.out.println("Color no establecido");;
		}
	}
}
