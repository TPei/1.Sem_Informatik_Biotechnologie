package aufgaben.zettel7;

import java.util.Scanner;

/**
 * summeBerechnen(int n), die das Ergebnis der folgenden Summenformel ausgibt :
 * 1/(1*2) + 1/(2+3) + 1/(3*4) + ... + 1 /(n*n+1)
 */
public class Aufgabe2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Zahl zur Berechnung eingeben: ");
		int n = input.nextInt();
		summeBerechnen(n);
	}
	
	public static void summeBerechnen(int n){
		double summe = 0;
		for(int i = 1; i<= n; i++){
			summe += 1 / ((double)(i) * (double)(i+1));
		}
		System.out.println("Ergebnis: " + summe);
	}
}
