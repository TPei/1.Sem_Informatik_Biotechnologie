package demos;

public class C_Schleifen {
	public static void main(String[] args){
		
		// Fuer Programmteile die beliebig oft wiederholt werden sollen
		// bietet Java Schleifen
		
		// Beispiel: Zaehlervariable soll von 0 bis 10 in 1er Schritten erhoeht werden
		
		int zaehler = 0;
		
		// laeuft so lange bis Bedingung nicht mehr zutrifft
		while(zaehler < 10)
		{
			zaehler = zaehler + 1;
		}
		
		// zaehler ist 10
		System.out.println("Zaehler: " + zaehler);
	}
}
