package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int najveciBroj;
		
		System.out.println("Unesite tri broja: ");
		
		int br1 = sc.nextInt();
		int br2 = sc.nextInt();
		int br3 = sc.nextInt();
		
		
		
		if (br1 > br2) {
			if (br1 > br3)        
			{
			najveciBroj = br1;
			}
			else
			{
				najveciBroj = br3;
			}
		}
		else {
			if (br2 > br3) {
				najveciBroj = br2;
			}
			else {
				najveciBroj = br1;
			}
		}
		
		System.out.println("Najveci broj je: " + najveciBroj);

	}

}
