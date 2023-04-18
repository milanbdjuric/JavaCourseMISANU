package djuric;

import java.text.DecimalFormat;

public class Main {

	static double Z(double x, double a, double y) {
		
		return Math.pow((x+a+y)/(x-y), 2) - (x/(x+a));
	}	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		double x, a, y;
		int rBr = 1;
		
		System.out.println("R.Br.\tx\ta\ty\tz");
		
		for(x = 1; x<=4; x++) {
			for(a = 0.1; a<=0.5; a+=0.1) {
				for(y=0.5; y>=0.2; y-=0.05) { 
					System.out.println(rBr + "\t" + df.format(x) + "\t" + df.format(a) + "\t" + df.format(y) + "\t" + df.format(Z(x,a,y)));
					rBr++;
				}
			}
		}
	}
}
