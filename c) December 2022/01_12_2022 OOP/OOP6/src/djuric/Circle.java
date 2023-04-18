package djuric;

public class Circle {
	
	private double radius;
	
	Circle(double rad)	{   // konstruktor sa parametrom! koji inicijalizuje jedan podatak
		radius = rad;	
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}
	

}
