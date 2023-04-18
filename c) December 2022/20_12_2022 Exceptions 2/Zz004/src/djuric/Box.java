package djuric;

public class Box {
	
	private double width, height, depth;
	
	Box(){
		width=height=depth=1;
	}
	Box(double width, double height, double depth) {
		this.depth = depth;
		this.height = height;
		this.width = width;
	}
	Box(double len) {
		depth = height = width = len;
	}
	Box(Box x) {
		width = x.width;
		height = x.height;
		depth = x.depth;
	}
	public double volume() {
		return width*height*depth;
	}

}
