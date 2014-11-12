package aufgaben.zettel5;

/**
 * Welchen Wert enthält die Variable y nach der Abarbeitung des folgende Codes: 
 */
public class Aufgabe1 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		y = x++ <= 1 ? x + y : x - y;
		
		System.out.println(y);

	}

}
