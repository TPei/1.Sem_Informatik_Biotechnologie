package aufgaben.zettel3;

import java.util.Scanner;

/**
 * Schreiben Sie ein Programm, das eine Zahl von der Konsole einliest und kontrolliert, 
 * ob diese eingegebene ganze Zahl gerade oder ungerade ist.
 */
public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Bitte Zahl eingeben: ");
		int zahl = eingabe.nextInt();
		
		// check using modulo operator
		if(zahl % 2 == 0){
			System.out.println("Zahl " + zahl + " ist gerade");
		}
		else {
			System.out.println("Zahl " + zahl + " ist ungerade");
		}
		
		eingabe.close();
	}
}
