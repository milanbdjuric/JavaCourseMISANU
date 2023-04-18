package djuric;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double s = 0;
		
		System.out.println("Unesite vrednost za n: ");
				
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			
			s = Math.sqrt(6 + s);
		}
		
		System.out.println("S = " + s);

	}

}
