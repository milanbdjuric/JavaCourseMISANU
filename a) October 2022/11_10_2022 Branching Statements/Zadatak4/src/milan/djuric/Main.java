package milan.djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.print("Unesite x: ");
		
		double x = xyz.nextDouble();
		double y;
		
		if (x > -2 && x <= 2)
		{
			y = 2*x;
		}
		else if (x >= 5 && x < 7)
		{
			y = 3*x - 1;
		}
		else
		{
			y=1/x;
		}
		
		System.out.println("y je: " + y);
		
		
		xyz.close();		

	}

}