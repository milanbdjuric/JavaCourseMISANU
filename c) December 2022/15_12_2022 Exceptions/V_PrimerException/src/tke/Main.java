package tke;

public class Main {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			System.out.println("a = " + a);
			
		//	int b = 10 / a;
			int c[] = {1};
			c[10] = 100;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Ufatilji smo exceptiona. " + e.getLocalizedMessage()); // javlja i kojie exception kace doda + e
		}
		System.out.println("Nakon try/catch bloka. ");

	}

}

// srodni exception mogu da se spajaju (oba su iz runtime exception nad-klase // ufatice samo 1 exception - na koji prvi naidje
