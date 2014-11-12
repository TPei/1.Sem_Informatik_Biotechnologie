package demos;

public class A_Zuweisungen {

	public static void main(String[] args) {
		// Deklarierung (ohne Wert)
		int a;
		int b, c, d;
		
		// Initialisierung (mit Wertzuweisung)
		a = 7;
		int e = 10;
		int f = 11;
		
		// Variablen ist jederzeit ein neuer Wert zuweisbar
		a = 11;
		e = 12;
		f = 13;
		
		// mathematische AusdrŸcke (+, -, /, *)
		// werden enstsprechend der gaengigen mathematischen Regeln
		// Punkt vor Strich, Klammer zu erst
		// ausgewertet
		b = 1 + e; // b => 13
		c = a + f; // c => 24
		d = 10 + 12 + e; // d => 34
		
		// Wertausgabe in die Konsole
		System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d + ", e: " + e + ", f: " + f);

	}

}
