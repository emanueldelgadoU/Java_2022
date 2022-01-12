package ejemplosClase;

public class TestJugador {

	public static void main(String[] args) {
		
		Jugador player1 = new Jugador();
		System.out.println(player1);
		
		Jugador player2 = new Jugador(50, 50, 5, 3, "Bruja del infierno","Brujo");
		System.out.println(player2);
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);
		
		System.out.println(player1);
		System.out.println(player2);
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);
		
		System.out.println(player1);
		System.out.println(player2);
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);
		
		System.out.println(player1);
		System.out.println(player2);
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);

		
		System.out.println(player1);
		System.out.println(player2);
	
	
	}

}
