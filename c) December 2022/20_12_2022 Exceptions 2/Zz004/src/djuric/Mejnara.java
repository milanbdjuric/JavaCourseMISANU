package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = new Box(10, 15, 20);
		Box b3 = new Box(10);
		Box b4 = new Box(b2);
		
		System.out.println(b1.volume() + "\n" + b2.volume() + "\n" + b3.volume() + "\n" + b4.volume());
		

	}

}
