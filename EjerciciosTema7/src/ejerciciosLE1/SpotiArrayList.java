package ejerciciosLE1;

import java.util.ArrayList;

public class SpotiArrayList {

	private ArrayList<Cancion> canciones;

	public SpotiArrayList() {
		super();
		this.canciones = new ArrayList<>(100000);
	}
	
	/**
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public void addCancion(Cancion c) {
		this.canciones.add(c);
	}
	
	public void delCancion(Cancion c) {
		this.canciones.remove(c);
	}
	
	public void delCancion(int index) {
		this.canciones.remove(index);
	}

	public static void main(String[] args) {
		
		SpotiArrayList spl = new SpotiArrayList();
		
		for(int i=0; i<100000; i++)
			spl.addCancion(new Cancion("Micancion",100,"Migrupo"));

		long startTime = System.currentTimeMillis();
		for(Cancion c : spl.getCanciones()) {
			System.out.print(c.getId()+" ");
		}
		long finishtTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println(finishtTime - startTime);
		
		startTime = System.currentTimeMillis();
		for(int i=10000; i<21000; i++) {
			spl.delCancion(spl.getCanciones().get(i));
		}
		finishtTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println(finishtTime - startTime);
		
		startTime = System.currentTimeMillis();
		for(int i=10000; i<21000; i++) {
			spl.delCancion(i);
		}
		finishtTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println(finishtTime - startTime);
		
	}
	
	
}
