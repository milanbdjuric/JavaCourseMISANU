package vfdfd;

public class Kocka extends Telo{
	
	public double str;
	
	Kocka(double str){
		if(str>0)
			this.str = str;
		else
			System.out.println("Zajebo si se");
	}
	public double izracunajPovrsinu() {
		return Math.pow(str, 2)*6;
	}
	public double izracunajZapreminu() {
		return Math.pow(str, 3);
	}

}
