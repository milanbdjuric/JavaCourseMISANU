package vjedjba3;

public class Baljak {
	
	private double r, h;
	
	Baljak(double r, double h) {
		this.r = r;
		this.h = h;
	}
	public double getR() {
		return r;
	}
	public double getH() {
		return h;
	}
	public double V() {
		return Math.pow(r, 2) * Math.PI * h;
	}
	public double P() {
		return 2*Math.pow(r, 2)*Math.PI + h*2*r*Math.PI;
	}
	public void ispis() {
		System.out.println("Valjak visine " + h + " i poluprecnika " + r + " ima zapreminu " + V() + " i povrsinu " + P());
		
	}
	
	
	

}
