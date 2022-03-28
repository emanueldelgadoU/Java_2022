package ejerciciosLE1;

import java.util.LinkedList;

public class SacoJuguetes {

	private LinkedList<Juguete> saco;

	public SacoJuguetes() {
		super();
		this.saco = new LinkedList<>();
	}
	
	public void apilar(Juguete j) {
		saco.push(j);
	}
	
	public Juguete sacar() {
		return saco.poll();
	}
	
	public void pintar() {
		System.out.print("[ ");
		for(Juguete j: saco)
			System.out.print(j.getNombre()+ " ");
		System.out.println(" ]");
	}
	
	public static void main(String[] args) {
		SacoJuguetes sj = new SacoJuguetes();
		sj.apilar(new Juguete("Tragabolas",10,"multicolor","1kg"));
		sj.apilar(new Juguete("Coche teledirigido",13,"negro","500g"));
		sj.apilar(new Juguete("Ajedrez",100,"blanco y negro","200g"));
		sj.apilar(new Juguete("Pelota",100,"roja","100g"));
		
		sj.pintar();
		
		sj.sacar();
		
		sj.pintar();
		
		sj.apilar(new Juguete("Barbie",100,"rosa","100g"));
		
		sj.pintar();
		
		sj.sacar();
		
		sj.pintar();
		
		
	}
	
	
}
