package ejersT2;

import java.util.Scanner;

public class Game {

	static int golpeo(int vida, int poder) {
		return vida - poder;
	}
	
	static void pintarJugadores(int vidaJugador1, int vidaJugador2) {
		System.out.println("        _  _                        _  _");
		System.out.println("       (.)(.)                      (.)(.)");
		System.out.println("      /  ()  \\                    /  ()  \\");
		System.out.println("    _ \\ '--' /                  _ \\ '--' /");
		System.out.println("   { '-`\"\"\"\"`-' }              { '-`\"\"\"\"`-' }");
		System.out.println("    `\"/  1  \\\"`\\               `\"/   2  \\\"`\\");
		System.out.println("      \\      /                    \\      /");
		System.out.println("     _/  /\\  \\_                  _/  /\\  \\_");
		System.out.println("    {   /  \\   }                {   /  \\   }");
		System.out.println("     `\"`    `\"`                 `\"`    `\"`");
		System.out.println();
		System.out.println("         "+vidaJugador1+"                       "+vidaJugador2);
	}
	
	public static void main(String[] args) {
		
		int vidaJugador1=0, vidaJugador2=0;
		int poderJugador1=0, poderJugador2=0;
		int opcion=0;
		int combo=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BIENVENIDO A CUEVAS FIGHTER 3");
		
		//Pedir por teclado la vida y el poder de los jugadores
		System.out.println("Dime vida jugador1");
		vidaJugador1 = Integer.parseInt(sc.nextLine());
		System.out.println("Dime vida jugador2");
		vidaJugador2 = Integer.parseInt(sc.nextLine());
		System.out.println("Dime poder golpeo jugador1");
		poderJugador1 = Integer.parseInt(sc.nextLine());
		System.out.println("Dime poder golpeo jugador1");
		poderJugador2 = Integer.parseInt(sc.nextLine());
		
		do {
			System.out.println("FIGHT:");
			System.out.println("1.Golpea Jugador1");
			System.out.println("2.Golpea Jugador2");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			if (opcion == 1) {
				vidaJugador2 = golpeo(vidaJugador2,poderJugador1);				
			} else if (opcion == 2) {
				vidaJugador1 = golpeo(vidaJugador1,poderJugador2);
			} else {
				System.out.println("Opción de golpeo incorrecta");
			}
			pintarJugadores(vidaJugador1,vidaJugador2);
		} while((vidaJugador1 > 0) && (vidaJugador2 > 0));
		
		if (vidaJugador1 <= 0)
			System.out.println("Gana jugador 2");
		if (vidaJugador2 <= 0)
			System.out.println("Gana jugador 1");


	}

}
