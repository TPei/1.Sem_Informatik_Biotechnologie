package aufgaben.zettel7;

import java.util.Scanner;

/**
 * Schreiben Sie eine Methode fakultaet(int n), die die Fakultaet einer Zahl n ausgibt.
 */
public class Aufgabe3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Zahl zur Berechnung eingeben: ");
		int n = input.nextInt();
		fakultaet(n);
	}
	
	/**
	 * Fakultaetsberechnung
	 * @param n
	 */
	public static void fakultaet(int n){
		int ergebnis = 1;
		
		// n! = n * (n-1)!
		// 3! = 3 * 2 * 1
		for(int i = 0; i < n; n--){
			ergebnis = ergebnis * n;
		}
		System.out.println("Ergebnis: " + ergebnis);
	}
}
