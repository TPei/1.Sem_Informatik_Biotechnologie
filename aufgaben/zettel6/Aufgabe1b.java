package aufgaben.zettel6;

import java.util.Scanner;

/**
 * Schreiben Sie ein Programm, das den BMI einer Person ausgibt
 * Hinweis: Nutzen Sie verschiedene Methoden
 */
public class Aufgabe1b {
	
	public static void main(String[] args) {		
		java.util.Scanner eingabe = new Scanner(System.in); 
		
		// initiale Eingabeaufforderung
		System.out.println("Gewicht in kg: ");
		
		// so lange der User wieder eine Zahl eingibt
		while(eingabe.hasNextDouble()){
			
			// speichern wir diese
			double weight = eingabe.nextDouble();

			// nehmen hier auch die groesse
			System.out.println("Koerpergroesse in m: ");
			double height = eingabe.nextDouble();
			
			// und lassen uns den Bmi berechnen
			double bmi = findeBmi(weight, height);
			
			// und augeben
			zeigeBmiAn(bmi);
			
			
			// wir sagen dem User das wir wieder eine Eingabe erwarten
			System.out.println("Gewicht in kg: ");
		}
		
		
	}
	
	/**
	 * berechnet den bmi
	 * @param weight gewicht
	 * @param height groesse
	 * @return double bmi
	 */
	public static double findeBmi (double weight, double height) {
		
		double bmi = weight / (height * height);
		
		return bmi;
		
	}
	
	/**
	 * zeigt den bmi an
	 * @param bmi
	 */
	public static void zeigeBmiAn (double bmi) {
		System.out.print("Der BMI ist: " + bmi + ", dass ist ");
		
		// zusätzlich Info über Unter- / Ueergewicht
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
