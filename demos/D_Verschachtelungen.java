package demos;

public class D_Verschachtelungen {
	public static void main(String[] args){
		// Konntrollstrukturen (if, while)
		// koennen beliebig verschachtelt werden
		// (auf Klammerung achten!)
		
		int outerCounter = 0;
		int innerCounter = 0;
		
		while(outerCounter < 3){
			
			// innere Schleife wird fuenf mal durchlaufen
			// bevor der naechste Schritt in der aeusseren
			// Schleife getan wird
			while(innerCounter < 3){
				
				// weiterhin kann man innerhalb der Schleifen auch beliebige
				// if Bedingungen einfuegen
				if(innerCounter == outerCounter){
					System.out.println("BOTH COUNTERS: " + innerCounter);
				}
				else{
					System.out.println("outer: " + outerCounter + " | inner: " + innerCounter);
				}
				
				innerCounter = innerCounter + 1;
			}
			
			// der innere counter muss natuerlich wieder 
			// auf 0 gesetzt werden, damit er auch
			// wieder 10 mal laeuft
			innerCounter = 0;
			outerCounter = outerCounter + 1;
		}
	}
}
