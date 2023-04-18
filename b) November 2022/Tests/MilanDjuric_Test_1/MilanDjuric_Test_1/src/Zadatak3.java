import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite stranicu kvadrata: ");
		
		double a = input.nextDouble();
		
		System.out.println("Povrsina kvadrata je: " + (Math.pow(a, 2)) + ", dok je obim: " + (a*4));
		
		input.close();
		

	}

}
