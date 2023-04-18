package djuric;

import java.util.Scanner;

public class TestMotor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite marku: ");
		String marka = sc.nextLine();
		
		System.out.println("Unesite kubikazu: ");
		double kubikaza = sc.nextDouble();
		
		Motor tormo = new Motor();
		
		try {
			tormo.setMarka(marka);
			tormo.setKubikaza(kubikaza);
			tormo.ispisi();
		} catch(MotorIzz e) {
			System.out.println(e.getMessage());
		}

	}

}
