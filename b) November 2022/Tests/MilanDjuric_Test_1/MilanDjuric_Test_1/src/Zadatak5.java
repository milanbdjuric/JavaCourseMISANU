import java.util.Scanner;
import java.text.DecimalFormat;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat xx = new DecimalFormat("#.##");
		
		System.out.print("Unesite stranicu trougla a: ");
		double a = in.nextDouble();
		System.out.print("Unesite stranicu trougla b: ");
		double b = in.nextDouble();
		System.out.print("Unesite stranicu trougla c: ");
		double c = in.nextDouble();
		
		double s = (a + b + c) /2;
		
		double P = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		double R = (a * b * c) / (4 * P);
		
		double r = (a * b * c) / (2 * R * s);
		
		System.out.print("Poluprecnik opisanog kruga je: " + xx.format(R));
		System.out.print("\nPoluprecnik upisanog kruga je: " + xx.format(r));
		
		in.close();
		
		

	}

}
