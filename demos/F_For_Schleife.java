package demos;

/**
 * verschachtelte For-Schleife (4x4 stern grid)
 */
public class F_For_Schleife {

	public static void main(String[] args) {
		int end = 4;
		for(int i = 0; i < end; i++){
			for(int j = 0; j < end; j++ ){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
