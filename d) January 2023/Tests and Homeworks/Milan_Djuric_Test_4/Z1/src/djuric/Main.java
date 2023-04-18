package djuric;

public class Main {

	public static void main(String[] args) {
		
		Neg br = (n) -> {
			if(n<0)
				System.out.println("Broj je negativan. ");
			else
				System.out.println("Broj nije negativan. ");
			return n;
		};

	}

}
