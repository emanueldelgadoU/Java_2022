/**
 * 
 */
package ejersClase;

/**
 * @author sjgui
 *
 */
public class TestAlumno {

	public static void main(String[] args) {
		Direccion direc = new Direccion("Mi calle 1","04638","Mojacar","Almería");
		Alumno javi = new Alumno("Javier Guillén", "jjavierguillen@gmail.com", 24, direc);
		
		//Clonando son objetos diferentes
		try {
			Alumno amador = (Alumno) javi.clone();
			System.out.println(javi.equals(amador)); //No son iguales, tendremos que cambiar este método
			direc.setCp("11111"); //La dirección no ha sido copiada, es una referencia
			System.out.println(amador.getNombre());
			amador.setNombre("Amador");
			System.out.println(javi.getEdad());
			System.out.println(amador);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//Copiando son el mismo objeto
		Alumno cati = javi;
		javi.setEmail("jj@gmail.com");
		System.out.println(cati);
		System.out.println(javi.equals(cati));
		
		
		//Copiando con el constructor copia son objetos diferentes
		Alumno vicente = new Alumno(javi);
		System.out.println(javi.equals(vicente));
		javi.setEmail("jjotro@gmail.com");
		System.out.println(vicente);
		
	}
}
