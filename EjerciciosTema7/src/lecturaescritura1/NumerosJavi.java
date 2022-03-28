package lecturaescritura1;

public class NumerosJavi implements Comparando {

	public int numero;

	public NumerosJavi(int numero) {
		super();
		this.numero = numero;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NumerosJavi [numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}
	
	public int compareTo() {
		if (numero > 0)
			return 0;
		else
			return -1;
	}
	public boolean mayor(int number) {
		if (numero > number)
			return true;
		else
			return false;
	}
	
	
}
