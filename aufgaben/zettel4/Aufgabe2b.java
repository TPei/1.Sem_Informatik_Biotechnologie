package aufgaben.zettel4;

/**
 * Gegeben sei eine positive ganze Zahl n. Gesucht ist ein Algorithmus, der die Anzahl der Ziffern von n ausgibt.
 */
public class Aufgabe2b {
	public static void main(String[] args){
		
		// number to count digits of
		int n = 123456;
		
		// start output here while n still holds its original value
		System.out.print("n (" + n + ") has ");
		
		int digitCount = 1;
		
		// loop over n
		while(n >= 10){
			n = n / 10;
			digitCount = digitCount + 1;
		}
		
		System.out.println(digitCount + " digits");
	}
}
