package aufgaben.zettel5;

/**
 * Welche Werte haben die folgenden Ausdrücke 
 * und welche Werte haben die Variablen x und y nach der Auswertung, 
 * wenn x den Anfangswert 1 und y den Anfangswert 5 hat?
 */
public class Aufgabe2 {

	public static void main(String[] args) {
		/*
		 * a) x--
		 * b) x++ + y
		 * c) x++ + ++x 
		 * d) -(x--) - (--y)
		 */
		
		int x = 1;
		int y = 5;
		
		System.out.println(x--);
		
		System.out.println(x++ + y);
		
		System.out.println(x++ + ++x );
		
		System.out.println(-(x--) - (--y));
		
	}

}
