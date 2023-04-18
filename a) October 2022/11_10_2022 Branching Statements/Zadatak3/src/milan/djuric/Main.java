package milan.djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//1.UNOS PODATAKA
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.print("Unesite x: ");
		
		double x = xyz.nextDouble();
		double y;
		
		//2.OBRADA PODATAKA
		
		if (x<0)
		{
			y = -1;
		}
		else if (x==0)
		{
			y = 0;
		}
		else
		{
			y=1;
		}
		
		//3.STAMPANJE PODATAKA
		
		System.out.print("y je: " + y);
		xyz.close();
			

	}

}