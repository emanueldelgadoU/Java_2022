package ejersT2;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i <= 100; i++) {
			
			if (i==50) {
				break;
			}
			
			if (i%2==0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		
	}

}
