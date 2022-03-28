package lecturaescritura1;

import java.util.ArrayList;

public class Compleja {

	public Distancia<Integer> dist;
	public ArrayList<String> nombres;
	
	public Compleja() {
		this.dist = new Distancia(3);
		this.nombres = new ArrayList<>();
	}
	
	public Compleja(Distancia<Integer> dist, ArrayList<String> nombres) {
		super();
		this.dist = dist;
		this.nombres = nombres;
	}

	/**
	 * @return the dist
	 */
	public Distancia<Integer> getDist() {
		return dist;
	}

	/**
	 * @param dist the dist to set
	 */
	public void setDist(Distancia<Integer> dist) {
		this.dist = dist;
	}

	/**
	 * @return the nombres
	 */
	public ArrayList<String> getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compleja [dist=");
		builder.append(dist);
		builder.append(", nombres=");
		builder.append(nombres);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
