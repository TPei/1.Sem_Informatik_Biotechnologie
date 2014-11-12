package aufgaben.zettel5;

import java.util.Scanner;

/**
 * Schreiben Sie ein Programm, 
 * das eine ganze positive Zahl n von der Konsole einliest 
 * und das Ergebnis der folgenden Summenformel auf der Konsole ausgibt :
 * 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
 */
public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int counter = 1;
		int result = 0;
		
		// geht wegen Assoziativität der Addition
		while(counter <= n){
			result += (1/counter);
			
			counter++;
		}
		
		System.out.println(result);

	}

}
