/**
 * 
 */
package ejersClase;

/**
 * @author profesor
 *
 */
public class Expediente {

	//TIPO ENUM definido para mi clase
	enum Modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR};
	
	//PROPIEDADES
	private static int totalAlumnado=0; //Contador de objetos de tipo Expediente
	private final int id = Expediente.totalAlumnado+1;
	
	
	Expediente() {
		Expediente.totalAlumnado++; //Cada vez que creo un objeto sumo 1 al contador
	}
	
	
	public int getId() {
		return this.id;
	}
	
}
