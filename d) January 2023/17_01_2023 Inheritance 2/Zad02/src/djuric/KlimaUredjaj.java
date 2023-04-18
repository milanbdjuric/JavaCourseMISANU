package djuric;

public class KlimaUredjaj extends Uredjaj {
	
	int temperatura = 18;
	
	KlimaUredjaj(String marka, boolean ukljucen, int temperatura) {
		super(marka, ukljucen);
		this.temperatura = temperatura;
	}
	public int povecajTemperaturu() {
		temperatura++;
		if (temperatura == 30)
			temperatura = 18;
		return temperatura;

	}
	public int smanjiTemperaturu() {
		temperatura--;
		if (temperatura == 18)
			temperatura = 30;
		return temperatura;

	}
	public void ispisi() {
		super.ispisi();
		System.out.println("Trenutna temperatura: " + temperatura + "C");
	}

}
