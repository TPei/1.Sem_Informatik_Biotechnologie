package demos;

public class G_String_Schleife {

	public static void main(String[] args) {
		// Arrays
		// Datentyp[] meinArrayName = new Datentyp[anzahlderElemente];
		
		// String array erstellen
		String[] stringArray = new String[3]; // groesse muss festgelegt sein
		
		// mit stringArray.length laesst sich die laenge des arrays (hier 4) abfragen
		System.out.println("Die Laenge des Arrays ist: "+ stringArray.length);
		
		// auf die Arrayelemente laesst sich mit stringArray[0] bis stringArray[4] zugreifen
		// so laesst sich ein Array dynamisch befuellen oder auslesen
		
		// Array befuellen
		for(int counter = 0; counter < stringArray.length; counter++){
			// beachten: Arrays werden ab 0 gezaehlt
			// Laenge 10 => array[0] bis array[9]
			
			stringArray[counter] = "Element Nr. " + counter;
		}
		
		// Array auslesen
		System.out.println("Die folgenden Strings sind im Array gespeichert: ");
		for(int counter = 0; counter < stringArray.length; counter++){
			System.out.println(stringArray[counter]);
			
			// Der Vergleich von zwei Strings erfolgt nicht wie bei Zahlen mit ==
			// sondern mit der Stringmethode meinString.equals("Vergleichsstring")
			if(stringArray[counter].equals("Element Nr. 1")){
				// falls das Element von stringArray an der Stelle counter "Element Nr. 1" ist,
				// wollen wir den User darauf hinweisen
				
				System.out.println("Das war Element Nr. 1");
			}
		}
		
		
	}

}
