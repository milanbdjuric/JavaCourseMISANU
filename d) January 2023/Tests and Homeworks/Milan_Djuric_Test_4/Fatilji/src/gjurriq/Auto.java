package gjurriq;

import java.util.Scanner;

public class Auto {
	
	String nazif, proizvajalec;
	int godisce;
	double potroslja;
	
	public void unetiNazifAuta() {
		Scanner br = new Scanner(System.in);
		System.out.println("KOIE NAZIF AUTA? ");
		nazif = br.nextLine();
		br.close();
	}
	public void unetiProizvajalcaAuta(){
		Scanner br = new Scanner(System.in);
		System.out.println("KOGAE NA PRAWIO? ");
		proizvajalec = br.nextLine();
		br.close();
	}
	public void unetiGodisceAuta() {
		Scanner br = new Scanner(System.in);
		System.out.println("KAGAE NA PRAWIO?");
		try {
			godisce = br.nextInt();
		}catch(Exception x) {
			System.out.println("NEWALJA AJOPET: ");
			unetiGodisceAuta();
		}
		br.close();
	}
	public void unetiPotrosljuAuta() {
		Scanner br = new Scanner(System.in);
		System.out.println("KOKO TRO$$I?");
		try {
			potroslja = br.nextDouble();
		}catch(Exception e) {
			System.out.println("NEWALJA AJOPET>");
			unetiPotrosljuAuta();
		}
		br.close();
	}

	public String toString() {
		return "Auto [nazif=" + nazif + ", proizvajalec=" + proizvajalec + ", godisce=" + godisce + ", potroslja="
				+ potroslja + "]";
	}
	
	
	

}
