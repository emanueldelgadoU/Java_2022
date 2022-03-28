package ejerciciosLE1;

import java.util.LinkedList;

public class SpotiLinkedList {

	private LinkedList<Cancion> canciones;

	public SpotiLinkedList() {
		super();
		canciones = new LinkedList<>();
	}

	/**
	 * @return the canciones
	 */
	public LinkedList<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(LinkedList<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	public void addCancion(Cancion c) {
		canciones.add(c);
	}
	
	public void delCancion(Cancion c) {
		canciones.remove(c);
	}
	
	public void delCancion(int index) {
		canciones.remove(index);
	}
	
	
	public static void main(String[] args) {
		
		SpotiLinkedList sll = new SpotiLinkedList();
		
		for(int i=0; i<100000; i++)
			sll.addCancion(new Cancion("Micancion",100,"Migrupo"));
		
		long startTime = System.currentTimeMillis();
		for(Cancion c : sll.getCanciones()) {
			System.out.print(c.getId()+" ");
		}
		long finishtTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println(finishtTime - startTime);
		
		startTime = System.currentTimeMillis();
		for(int i=10000; i<21000; i++) {
			sll.delCancion(sll.getCanciones().get(i));
		}
		finishtTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println(finishtTime - startTime);
		
		startTime = System.currentTimeMillis();
		for(int i=10000; i<21000; i++) {
			sll.delCancion(i);
		}
		finishtTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println(finishtTime - startTime);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
