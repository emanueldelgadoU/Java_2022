package lecturaescritura1;

public class ParOrdenado<K,V> implements Pair<K,V> {
	
	private K clave;
	private V valor;
	
	public ParOrdenado(K clave, V valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}
	
	public K getKey() {
		return clave;
	}
	
	public V getValue() {
		return valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParOrdenado [clave=");
		builder.append(clave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
