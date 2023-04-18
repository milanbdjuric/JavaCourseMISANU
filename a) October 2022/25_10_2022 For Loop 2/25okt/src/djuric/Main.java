package djuric;

public class Main {

	public static void main(String[] args) {
		
		double s = 0;
		
		for(int n=1; n <= 2; n++) {
			
			s += (n + 2.5) / (n*n + 1.2);
			
	//		s = s + (n*2.5) / n*n + 1.2);   - el se prof. zajebo??
			
		}
		System.out.println("S = " + s);
		
		
		

	}

}
