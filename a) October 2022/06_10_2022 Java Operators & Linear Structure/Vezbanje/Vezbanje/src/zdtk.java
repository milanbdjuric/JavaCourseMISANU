import java.util.Scanner;

public class zdtk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi trosifren broj leba ti: ");
		
		int b = input.nextInt();
		
		int s = b / 100;
		int t = b / 10;
		int d = t % 10;
		int j = b % 10;
		
		System.out.println("stotica je " + s + ", desetica je " + d + ", jedinica je " + j);
		
	}

}
