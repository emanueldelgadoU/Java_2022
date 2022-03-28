package ejerciciosLE1;

public class Juguete {

	private String nombre;
	private int edad;
	private String color;
	private String size;
	
	public Juguete(String nombre, int edad, String color, String size) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		this.size = size;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Juguete [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", color=");
		builder.append(color);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
