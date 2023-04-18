package z04;

public class Motor {
	
	String marka;
	double kubikaza;
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) throws MotorException {
		if(marka.isBlank()||marka.isEmpty())
			throw new MotorException("Ne ne nikako null.");
		this.marka = marka;
	}
	public double getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(double kubikaza) throws MotorException {
		if(kubikaza<50||kubikaza>=2000)
			throw new MotorException("Mora vise od 50 i manje od 2000!");
		this.kubikaza = kubikaza;
	}
	public void ispisi() {
		System.out.println(marka + ": " + kubikaza);
	}

}
