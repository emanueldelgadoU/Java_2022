package ejerciciosLE1;

import java.util.HashSet;

public class SpotiHashSet {

	private HashSet<Cancion> canciones;

	public SpotiHashSet() {
		super();
		canciones = new HashSet<>();
	}

	/**
	 * @return the canciones
	 */
	public HashSet<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(HashSet<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	public void addCancion(Cancion c) {
		this.canciones.add(c);
	}
	
	
	public void delCancion(Cancion c) {
		this.canciones.remove(c);
	}
	
	public Cancion buscar(Cancion song) {
		for(Cancion c: canciones) {
			if (c.equals(song))
				return c;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		SpotiHashSet shs = new SpotiHashSet();
		shs.addCancion(new Cancion("titulo",100,"grupo"));
		shs.addCancion(new Cancion("titulo",100,"grupo"));
		shs.addCancion(new Cancion("titulo",100,"grupo"));
		shs.addCancion(new Cancion("otra",100,"grupo"));
		shs.addCancion(new Cancion("mas",100,"grupo"));
		
		for(Cancion c: shs.getCanciones()) {
			System.out.println(c);
		}
		
		System.out.println(shs.buscar(new Cancion("otra",100,"")));
		
	}
	
	
	
}
