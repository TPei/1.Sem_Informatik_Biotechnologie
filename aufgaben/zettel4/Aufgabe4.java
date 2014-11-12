package aufgaben.zettel4;

import java.util.Scanner;

/**
 * Schreiben Sie ein Programm zur Berechnung der Quersumme einer Zahl.
 */
public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Eingabezahl: ");
		int zahl = input.nextInt();
		int quersumme = 0;
		
		while(zahl >= 10){
			quersumme += zahl % 10;
			zahl = zahl / 10;
		}
		quersumme += zahl;
		System.out.println("Quersumme: " + quersumme);
	}

}
