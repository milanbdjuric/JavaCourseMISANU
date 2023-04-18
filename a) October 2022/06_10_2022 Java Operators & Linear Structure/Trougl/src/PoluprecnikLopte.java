import java.util.Scanner;

public class PoluprecnikLopte {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost poluprecnika: ");
		double r = input.nextDouble();
		
		double P = Math.pow(r, 2) * Math.PI * 4;
		double V = Math.pow(r, 2) * Math.PI * 4.0 / 3;
		
		System.out.println("Povrsina lopte je: " + P);
		
		

	}

}
