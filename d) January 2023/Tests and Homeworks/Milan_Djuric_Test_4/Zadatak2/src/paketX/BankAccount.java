package paketX;

public class BankAccount {
	
	private double iznos, uplata;
	
	public BankAccount() {
		iznos = 0.0;
	}
	
	public BankAccount(double iznos) {
		this.iznos = iznos;
	}

	public double getIznos() {
		return iznos;
	}

	public void setUplata(double uplata) {
		this.uplata = uplata;
	}

	public double dodaj() {
		return iznos = iznos + uplata;
	}
	
	public void trenutnoStanje() {
		System.out.println("Trenutni iznos na racunu: " + getIznos());
	}

}
