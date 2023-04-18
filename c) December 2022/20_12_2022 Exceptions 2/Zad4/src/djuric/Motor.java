package djuric;

public class Motor {
	
	String marka;
	double kubikaza;
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) throws MotorIzz {
		if (marka.isBlank() || marka.isEmpty())
			throw new MotorIzz("Ne moze da bude null. ");
		this.marka = marka;
	}
	public double getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(double kubikaza) throws MotorIzz {
		if (kubikaza <= 50 || kubikaza >= 2000)
			throw new MotorIzz("Izmendu 50 i 2000 mora.");
		this.kubikaza = kubikaza;
	}
	public void ispisi() {
		System.out.println("MARKA: " + marka + "\tKUBIKAZA: " + kubikaza);
	}
	
	

}
