package aufgaben.zettel6;

import java.util.Scanner;

/**
 * Schreiben Sie ein Programm, das den BMI einer Person ausgibt
 */
public class Aufgabe1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Gewicht: ");
		double weight = input.nextDouble();
		System.out.println("Koerpergroesse: ");
		double height = input.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println(bmi);
		
		if(bmi >= 20 && bmi <= 24){
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
