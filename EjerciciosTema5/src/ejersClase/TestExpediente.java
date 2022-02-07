package ejersClase;

import java.time.LocalDate;

public class TestExpediente {

	public static void main(String[] args) {
		Expediente alumno1 = new Expediente("Carlos","Guerrero", LocalDate.of(2000, 2,20), 1);
		alumno1.setSexo('h');
		System.out.println(alumno1);
		
		alumno1.getNotas().add(new NotasCurso("Programacion",1,5,6,7));
		alumno1.getNotas().add(new NotasCurso("Bases de datos",1,5,4,3));
		System.out.println(alumno1);
		
		

	}

}
