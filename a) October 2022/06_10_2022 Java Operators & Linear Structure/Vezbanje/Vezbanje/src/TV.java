import java.util.Scanner;

public class TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kolko ima inca brt?");
		
		double x = input.nextDouble();
		
		System.out.println("Ovolko: " + (x * 2.54));
		

	}

}


// profin kod: import java.io.*;   public class Zadatak6 { public static void main(String[] args) throws Exception { // n - dijagonala ekrana izražena u inčima double n;   BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));   // Unos dijagonale ekrana izražene u inčima System.out.print("Unesite dijagonalu ekrana u inčima: "); n = Double.parseDouble(ulaz.readLine()); // Štampanje rezultata System.out.println("Dijagonala ekrana izražena u centimetrima " + n * 2.54); } }
