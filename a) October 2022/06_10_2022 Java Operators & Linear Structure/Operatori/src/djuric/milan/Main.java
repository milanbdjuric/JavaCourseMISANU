package djuric.milan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Operatori
		// Binarni operatori
		// 5 + 10
		
		// =
		
		// = je operator dodele vrednosti
		// vrednost koja je sa desne strane znaka = dodeljuje se promenljivoj sa leve str. znaka =
		
		int a = 5; // asocijativnost je sa desna na levo
		int b = 50;
		
		int zbir = a + b;
		System.out.println("Vrednost promenljive zbir je: " + zbir);
		
		// + je binarni operator, zahteva 2 operanda - sa leve i desne strane znaka +
		// -, *, /, %
		
		int razlika = a - b;
		System.out.println("Razlika = " + razlika); // binarni
		
		int proizvod = a * b;
		System.out.println("Proizvod = " + proizvod); // binarni
		
		float kolicnik = 13 / 3; // opet binarni, 10 : 3 = 3.3333     / je celobrojno deljenje!!!
		System.out.println("Kolicnik = " + kolicnik);     // operator / predstavlja celobrojno deljenje
		
		// deljenje sa ostatkom je %
		int ostatak = 17 % 3;
		System.out.println("Ostatak = " + ostatak);
		
		float tacnoDeljenje = 17f / 3f;
		System.out.println("Tacno deljenje: "+ tacnoDeljenje);
		
		double provera = (double)50/3;
		System.out.println("Provera = "+ provera); // eksplicitna konverzija!!! iliti castovanje
		
		
		
		
		

	}

}
