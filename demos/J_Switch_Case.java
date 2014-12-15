package demos;

import java.util.Scanner;

public class J_Switch_Case {
	public static void main(String[] args)
	{
		Scanner meinScanner = new Scanner(System.in);
		int meineZahl = meinScanner.nextInt();
		
		switch(meineZahl)
		{
		case 1:
			System.out.println("ist 1");
			break;
		case 2:
			System.out.println("ist 2");
			break;
		case 3:
			System.out.println("ist 3");
			break;
		default:
			System.out.println("ist NICHT 1, 2, oder 3");
			break;
		}
		
		String meinString = meinScanner.nextLine();
		
		switch(meinString)
		{
		case "hallo":
			System.out.println("begruessung");
			break;
		case "tschuess":
			System.out.println("abschied");
			break;
		case "bla":
			System.out.println("genervt");
			break;
		default:
			System.out.println("unbekannter String");
			break;
		}
		
		
	}
}
