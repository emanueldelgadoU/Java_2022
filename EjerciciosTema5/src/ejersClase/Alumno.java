package ejersClase;

public class Alumno implements Cloneable {

	//PROPIEDADES
	private String nombre;
	private String email;
	private int edad;
	private Direccion direccion;

	
	/**
	 * Crea un nuevo alumno con su información por defecto
	 */
	public Alumno() {
		super();
	}

	/**
	 * @param nombre
	 * @param email
	 * @param edad
	 */
	public Alumno(String nombre, String email, int edad, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	public Alumno(Alumno otro) {
		this.nombre = otro.nombre;
		this.email = otro.email;
		this.edad = otro.edad;
		this.direccion = otro.direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	/*
	 * Para no hacer casting en TestAlumno lo hago en el clone
	  @Override
		protected Alumno clone() throws CloneNotSupportedException {
			return (Alumno) super.clone();
		}
	 */
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
