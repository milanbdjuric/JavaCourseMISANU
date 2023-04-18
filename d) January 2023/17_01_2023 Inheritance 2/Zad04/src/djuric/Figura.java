package djuric;

public abstract class Figura {
	
	protected double xRef, yRef;
	
	Figura(double xRef, double yRef){
		if (xRef!=0.0)
			this.xRef = xRef;
		else
			System.out.println("Greska! Ne sme bude 0.");
		if (yRef!=0)
			this.yRef = yRef;
		else
			System.out.println("Greska. Ne sme bude 0.");
	}
	
	public abstract double obim();
	public abstract double povrsina();
}
