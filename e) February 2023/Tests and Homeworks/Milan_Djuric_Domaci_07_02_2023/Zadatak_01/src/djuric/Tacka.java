package djuric;

import java.io.*;

public class Tacka {
	
	private double x, y; // deklaracija koordinata tipa double
	
	public void postaviKoordinate(double x, double y) {		// metoda za postavljanje koordinata
		this.x = x;
		this.y = y;
	}
	
	public double getX() {			// geter za dohvatanje koordinate x
		return x;
	}

	public double getY() {			// geter za dohvatanje koordinate y
		return y;
	}
	
	public double rastojanje(Tacka a) {		// metoda za racunanje udaljenosti tacke od tacke a (metodi prosledjujemo objekat, tacku a)
		double xRazlika = Math.abs(this.x - a.x);		// razlika na koordinati x, apsolutna vrednost da zanemari + i -
		double yRazlika = Math.abs(this.y - a.y);		// -||- za koordinatu y
		return Math.sqrt(xRazlika*xRazlika + yRazlika*yRazlika);  // racunanje rastojanja tj dijagonale po Pitagorinoj teoremi
	}
	
	public void citanje() throws Exception {						// metoda za citanje tacke, tj. unos njenih koordinata
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite koordinate tacke:\nx = ");
		this.x = Double.parseDouble(br.readLine());
		System.out.print("y = ");
		this.y = Double.parseDouble(br.readLine());
	}
	
	public void pisanje() {						// metoda za pisanje tacke, tj. ispisivanje njenih koordinata
		System.out.println("Koordinate tacke su: (" + x + ", " + y + ")");
	}


	
	
	
	

}
