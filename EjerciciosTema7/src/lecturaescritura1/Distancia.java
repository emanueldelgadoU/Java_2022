package lecturaescritura1;

public class Distancia<T extends Number> {

		private T dist; //Propiedad que va almacenar la distancia

		public Distancia(T dist) {
			this.dist = dist;
		}

		/**
		 * @return the dist
		 */
		public T getDist() {
			return dist;
		}

		/**
		 * @param dist the dist to set
		 */
		public void setDist(T dist) {
			this.dist = dist;
		}

		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Distancia [dist=");
			builder.append(dist);
			builder.append("]");
			return builder.toString();
		}
		
		
	
	
}
