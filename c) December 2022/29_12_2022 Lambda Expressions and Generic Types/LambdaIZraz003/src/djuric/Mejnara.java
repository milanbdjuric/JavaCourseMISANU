package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
		PromenaRedosleda pr = (str) -> {
			
			String rezultat = "";
			
			for(int i = str.length() - 1; i >= 0; i--)
				rezultat += str.charAt(i);
			
			return rezultat;
		};
		
		System.out.println("proveri " + pr.okreniString("proveri"));

	}

}
