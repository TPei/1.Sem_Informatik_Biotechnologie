package aufgaben.zettel6;

import java.util.Scanner;

/**
 * Schreiben Sie ein Programm, das den BMI einer Person ausgibt
 * Hinweis: Nutzen Sie verschiedene Methoden
 */
public class Aufgabe1a {
	
	public static void main(String[] args) {		
		
		// bmi ausrechnen lassen
		double bmi = findeBmi();

		// bmi anzeigen lassen
		zeigeBmiAn(bmi);
		
	}
	
	/**
	 * fordert eingabe von gewicht und groesse
	 * berechnet bmi und liefert ihn zurueck
	 * @return double bmi
	 */
	public static double findeBmi () {
		// Scanner
		java.util.Scanner eingabe = new java.util.Scanner(System.in);
		
		// weist auf gewichtseingabe hin
		System.out.println("Gewicht in kg: ");
		// und speichert den Wert
		double weight = eingabe.nextDouble();
		
		// weist auf eingabe der groesse hin
		System.out.println("Koerpergroesse in m: ");
		// und speichert den Wert
		double height = eingabe.nextDouble();
		
		// bmi berechnung
		double bmi = weight / (height * height);
		
		// wert zurueck geben
		return bmi;
		
	}
	
	/**
	 * zeigt bmi und zusatzinformationen an
	 * @param bmi
	 */
	public static void zeigeBmiAn (double bmi) {
		
		// Ausgabe
		System.out.print("Der BMI ist: " + bmi + ", dass ist ");
		
		// mit Zusatzinfo
		if(bmi < 20){
			System.out.println("Untergewicht");
		}
		else if(bmi >= 20 && bmi <= 24){
			System.out.println("Idealgewicht");
		}
		else if(bmi >= 25 && bmi <= 30){
			System.out.println("leichtes Uebergewicht");
		}
		else if(bmi > 30){
			System.out.println("Uebergewicht");
		}
	}
}
