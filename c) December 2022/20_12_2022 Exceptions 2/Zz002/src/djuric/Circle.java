package djuric;

public class Circle {
	
	private double radius;
	
	Circle(){
		radius = 0.0;
	}
	Circle(double radius) {
		this.radius = radius;
	}
	Circle(Circle c) {
		radius = c.radius;
	}
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}

}
