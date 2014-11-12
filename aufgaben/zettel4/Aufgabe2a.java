package aufgaben.zettel4;

/**
 * Gegeben seien drei Zahlen a, b und c. Gesucht ist ein Algorithmus, der das Maximum 
 * dieser Zahlen in der Variable max speichert.
 *
 */
public class Aufgabe2a {
	public static void main(String[] args){
		// given numbers to find max of
		int a = 10;
		int b = 11;
		int c = 12;
		int max;
		
		// compare 
		// if all are equal: c, b, a is the order in which the will be rated
		if(a > b){
			if(a > c){
				max = a;
			}
			else{
				max = c;
			}
		}
		else{
			if(b > c){
				max = b;
			}
			else{
				max = c;
			}
		}
		
		System.out.println("max ist : " + max);
	}
}
