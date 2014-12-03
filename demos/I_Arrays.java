package demos;

public class I_Arrays {
	public static void main(String[] args){
		
		// Anzahl der Elemente die das Array beinhalten soll
		int zahlDerElemente = 3;
		int[] meinIntArray = new int[zahlDerElemente];
		
		// gezaehlt wird ab 0
		meinIntArray[0] = 7;
		meinIntArray[1] = 8;
		meinIntArray[2] = 1;
		int summe = 0;
		
		for(int i = 0; i < meinIntArray.length; i++){
			summe = summe + meinIntArray[i];
		}
		
		System.out.println("Summe der Arrayelemente: " + summe);
		
		// 3 Elemente mit je zwei Elementen
		String[][] verschachteltesArray = new String[3][2];
		verschachteltesArray[0][0] = "Vorname";
		verschachteltesArray[0][1] = "Nachname";
		
		verschachteltesArray[1][0] = "Walter";
		verschachteltesArray[1][1] = "White";
		
		verschachteltesArray[2][0] = "El";
		verschachteltesArray[2][1] = "Heisenberg";
		
		// verschachtelte Schleife um sowohl uber das aeussere,
		// als auch das innere Array zu gehen
		for(int i = 0; i < verschachteltesArray.length; i++){
			for(int j = 0; j < verschachteltesArray[i].length; j++){
				System.out.print(verschachteltesArray[i][j] + " ");
			}
			// Als Zeilenumbruch
			System.out.println();
		}
	}
}
