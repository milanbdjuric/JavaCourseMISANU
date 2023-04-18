package djuric;

public class C extends Thread{
	
	C (String x){
		super(x);
	}
	public void run() {
		for (int i = 0; i<=3; i++) {
			System.out.println(getName());
		}
	}

}
