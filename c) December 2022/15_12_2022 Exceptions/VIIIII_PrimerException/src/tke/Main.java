package tke;

public class Main {

	public static void main(String[] args) {
		
		finallyBlockWithException fbwe = new finallyBlockWithException();
		
		try {
			fbwe.procA();
		} catch (Exception e) {
			System.out.println("Exception smo fatilji.");
		}
		fbwe.procB();
		fbwe.procC();
		
	}

}
