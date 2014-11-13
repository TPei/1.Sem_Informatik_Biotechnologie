package demos;

public class H_Methoden {
	
	public static void main(String[] args){
		
		// da kein return Wert, brauchen wir auch nichts speichern
		ausgeben("Hallo Ausgabe");
		
		// da keine Argumente erwartet, uebergeben wir auch keine
		int zahl = gibDrei();
		System.out.println(zahl);
	}
	
	// neue Methoden
	// public static r�ckgabeTyp name(Datentyp argument, Datentyp argument2, ...)
	
	// kein wiedergabewert, erhaelt text zur ausgabe
	public static void ausgeben(String text){
		System.out.println(text);
	}
	
	// gibt int zurueck, erwartet kein Argument
	public static int gibDrei(){
		return 3;
	}

}
