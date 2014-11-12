package demos;

public class B_Bedingungen {

	public static void main(String[] args) {
		
		// Variablen a, b
		int a = 10;
		int b = 11;
		
		// Ohne Bedingungen werden Java Programme Zeile fŸr Zeile ausgewertet
		// Erst durch Bedingungen kšnnen Teile des Programms in 
		// konditionale Abhaengigkeit gestellt werden
		
		// if(Bedingung)
		// {
		//      AusfŸhrung
		// }
		// else if(Bedingung)
		// {
		//      AusfŸhrung
		// }
		// else
		// {
		//      AusfŸhrung
		// }
		
		// Demo: wir wollen wissen in welcher Beziehung (>, <, ==) 
		// die Variablen a und b zueinander stehen
		if(a > b)
		{
			System.out.println("a ist groesser als b");
		}
		else if(b > a) // wird nur uberprueft wenn if nicht eingetreten ist
		{
			// wird ausgefuehrt wenn a nicht groesser b und b groesser a
			System.out.println("b ist groesser als a");
		}
		else // wird nur ausgefuehrt wenn if und alle else ifs nicht eingetreten sind
		{
			// wird ausgefuehrt wenn if und else if nicht zutreffen
			System.out.println("a und b sind gleich gross");
		}

	}

}
