package djuric;

public class B extends Thread{
	
	B (String x){
		super(x);
	}
	public void run() {
		for (int i = 0; i<=3; i++) {
			System.out.println(getName());
		}
	}

}
