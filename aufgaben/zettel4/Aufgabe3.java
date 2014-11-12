package aufgaben.zettel4;

import java.util.Scanner;

/**
 * Schreiben Sie ein Programm, das einen String str und eine ganze Zahl n von der Konsole einliest und den String mit sich selbst n-mal verkettet.
 */
public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// get number
		System.out.print("Bitte Ganzzahl eingeben: ");
		int n = input.nextInt();
		
		input = new Scanner(System.in);
		
		// get string
		System.out.print("Bitte String eingeben: ");
		String str = input.nextLine();
		
		String output = "";
		
		// loop over n and concatenate string n times
		for(int i = 0; i < n; i++){
			output += str;
		}
		
		System.out.println(output);

	}

}
