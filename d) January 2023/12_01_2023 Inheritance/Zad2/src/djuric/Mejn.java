package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		honorarniTaksista ht = new honorarniTaksista(); 
		
		ht.zadajIme("Žika"); 
		
		System.out.println(ht.uzmiIme()); 
		
		ht.zadajHonorarneSate(20); 
		
		System.out.println(ht.uzmiHonorarneSate());

	}

}
