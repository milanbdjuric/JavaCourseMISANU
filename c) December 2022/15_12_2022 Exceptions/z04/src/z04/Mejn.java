package z04;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) throws MotorException {
		
		Scanner sc = new Scanner(System.in);
		
		Motor x = new Motor();
		
		try {
		
			System.out.println("Marka motolja: ");
			x.setMarka(sc.nextLine());
			
			System.out.println("Kubi kadja: ");
			x.setKubikaza(sc.nextDouble());
			
			x.ispisi();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
