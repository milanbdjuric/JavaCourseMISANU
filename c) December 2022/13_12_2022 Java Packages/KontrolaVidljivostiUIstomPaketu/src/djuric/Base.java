package djuric;

public class Base {
	
	private int n_pri = 1;
	int n_def = 2; //podrazumevani nivo vidljivosti
	protected int n_pro = 3;
	public int n_pub = 4;
	
	public Base() {
		System.out.println("Konsktruktor klase Base.");
		System.out.println("Base klase n+pri = " + n_pri);
		System.out.println("Base klase n+pri = " + n_def); //default (package)
		System.out.println("Base klase n+pri = " + n_pro);
		System.out.println("Base klase n+pri = " + n_pub);
	}

}
