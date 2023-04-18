package djuric;



public class Main {

	public static void main(String[] args) {	
		
		int broj, s, d, j;
		
		for (int i = 0; i < 1000; i++) {
			broj = i;
			s = broj / 100;
			d = (broj / 10) % 10;
			j = broj % 10;
			
			if(broj == (s*s*s)+(d*d*d)+(j*j*j)) {
				System.out.println(broj);
			}
			
		}
		

		
		
	}

}
