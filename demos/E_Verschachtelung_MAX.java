package demos;

public class E_Verschachtelung_MAX {
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		int c = 0;
		
		// range, die durchlaufen wird
		int range = 10;
		
		// durch die verschachtelte Schleifen werden alle
		// Wertkombination in range
		// durchlaufen und jeweils das maximum errechnet
		while(a < range){
			while(b < range){
				while(c < range){
					// finde das Maximum der Zahlen
					// (Gleichheit wird vernachlaessigt)
					System.out.println("a: " + a + " | b: " + b + " | c: " + c);
					if(a > b){
						if(a > c){
							System.out.println("max a: " + a);
						}
						else{
							System.out.println("max c: " + c);
						}
					}
					else{
						if(b > c){
							System.out.println("max b: " + b);
						}
						else{
							System.out.println("max c: " + c);
						}
					}
					
					
					c++;
				}
				c = 0;
				b++;
			}
			b = 0;
			c = 0;
			a++;
		}
	}
}
