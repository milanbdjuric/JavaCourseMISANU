package djuric;

public class TestAutomobil {

	public static void main(String[] args) {
		
		Automobil kola = new Automobil();
		
		kola.unetiNazivAutomobila();
		kola.unetiProizvodjacaAutomobila();
		kola.unetiGodisteAutomobila();
		kola.unetiPotrosnjuAutomobila();
		
		System.out.println(kola.toString());
		

	}

}
