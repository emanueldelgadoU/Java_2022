package ejerciciosLE1;

import java.util.TreeSet;

public class SpotiTreeSet {

	private TreeSet<Cancion> canciones;

	public SpotiTreeSet() {
		super();
		canciones = new TreeSet<>();
	}

	/**
	 * @return the canciones
	 */
	public TreeSet<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(TreeSet<Cancion> canciones) {
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
		SpotiTreeSet sts = new SpotiTreeSet();
		
		sts.addCancion(new Cancion("titulo",100,"grupo"));
		sts.addCancion(new Cancion("titulo",100,"grupo"));
		sts.addCancion(new Cancion("titulo",100,"grupo"));
		sts.addCancion(new Cancion("otra",100,"grupo"));
		sts.addCancion(new Cancion("mas",100,"grupo"));
		
		for(Cancion c: sts.getCanciones()) {
			System.out.println(c);
		}
		
		System.out.println(sts.buscar(new Cancion("otra",100,"")));
		
		
		
		
		
	}
	
	
	

}
