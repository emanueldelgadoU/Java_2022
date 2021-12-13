package EjerciciosClase;

public class Ejercicio5Examen {

	public static int busqueda(int[]vector, int n) {
		int i=0;
		int j=n-1;
		int mid=0;
		while(i<j){
			mid=i+(i-j)/2;

			if (vector[mid]==j) {
				break;
			}
			if (vector[mid]<j) {
				i=mid+1;
			}else if(vector[mid]>j) {
				j=mid-1;
			}else {
				return -1;
			}

		}
		return mid;

	}
	
	public static void main(String[] args) {
		int vector[] = new int[20];
		
		

	}

}
