package aufgaben.zettel8;

import java.util.Scanner;

public class Aufgabe2 
{
	public static void main(String[] args) 
	{
		Scanner eingabeScanner = new Scanner(System.in);
		String[] namen = null;
		
		boolean wiederholen = true;
		
		// do ... while Schleife wird mindestens einmal ausgefuehrt
		do 
		{
			System.out.println("Bitte eine Nummer wählen: 1.Erstellen, 2.Suchen oder 3.Anzeigen ");
			
			// nur wenn eine Ganzzahl eingegeben wird machen wir weiter
			if (eingabeScanner.hasNextInt()) 
			{
				int wahl = eingabeScanner.nextInt();
				if (namen == null && (wahl == 2 || wahl == 3)) {
					
					System.out.println("Bitte zuerst eine Liste erstellen! ");
				} else {
					
					// die Zahl im case bezieht sich immer auf die Variable beim switch
					switch (wahl) {
					case 1:
						namen = erstellen();
						break;
					case 2:
						System.out.println("Bitte ein Wort ohne Leerzeichen eingeben: ");
						if (eingabeScanner.hasNext()) 
						{
							String suchText = eingabeScanner.next(); 
							suchen(suchText, namen);
						}
						break;
					case 3:
						anzeigen(namen);
						break;
					default:
						System.out.println("Ende ...");
						wiederholen = false;
					}
				}
			} else 
			{
				System.out.println("falsche Eingabe!!!");
				wiederholen = false;
			}
		} while (wiederholen);
		eingabeScanner.close();
	}

	// erstellen des Arrays
	public static String[] erstellen() 
	{
		String[] namen = { "Max", "Anna", "Nina", "Anna", "Karl_Hans" };
		
		System.out.println("Es wurde eine Liste mit " + namen.length + " Elementen erstellt.");
		return namen;
	}

	// suchen im Array
	public static void suchen(String suchText, String[] namen) 
	{
		boolean existiert = false;
		
		// von index 0 bis length des arrays gehen
		for (int index = 0; index < namen.length; index++) 
		{
			if (suchText.equalsIgnoreCase(namen[index])) 
			{
				System.out.println((index + 1) + "." + namen[index]);
				existiert = true;
			}
		}
		if (!existiert) 
		{
			System.out.println(suchText + " existiert nicht!");
		}
	}
	
	// Anzeigen des Arrays
	public static void anzeigen(String[] namen) 
	{
		
		// von index 0 bis length des arrays gehen
		for (int index = 0; index < namen.length; index++) 
		{
			if (namen[0] != null) {
				System.out.println((index + 1) + ". " + namen[index]);
			} 
		}
	}
}
