package djuric;

public class A extends Thread{
	
	public void run() {
		int i = 1;
		while(i<=10) {
			System.out.println("i: " + i);
			
			// sleep(vrednostUMilisekundama)  -- suspendujemo resurse na neko vreme
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			i++;
		}
		
	}

}

// sleep(milisekunde) - privremeno zaustavlja (suspenduje) izvrsavanje niti
// argument metode sleep je u interval cekanja zadat u milisekundama

// metoda sleep() u klasi Thread moze da izazove izuzetak InterruptedException
// desice se izuzetak ukoliko neka druga nit pozeli da prekine ovu suspendovanu nit

