package djuric;

// Nit se moze napraviti i kada klasu Thread prosirimo novom naslednjenom klasom
// pa zatim napravimo instancu klase

// Nova potklasa mora da redefinise metodu run() 

public class A extends Thread{
	
	A (String s){
		super(s); // poziva se konstruktor Thread sledeceg oblika:	 public Thread(String imeNiti);
	}
	
	public void run() {
		for (int i = 1; i<=10; i++) {
			System.out.println(getName());
		}
	}
	

}
