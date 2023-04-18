package djuric;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mejn {

	public static void main(String[] args) throws IOException {
		
		// OSNOVNE UI OPERACIJE (ulazno - izlazne operacije)
		
		// Za UI operacije Java koristi tokove (stream-ove); oni omogucuju rad sa podacima
		// Obezbedjuju nacin za rad sa podacima koji se primaju i salju
		
		// klasa koja omogucuje da se poveze tastatura sa stream-om (tokom) je data input stream
		
		DataInputStream dis = new DataInputStream(System.in);
		
		// Povezivanje fajla sa klasom FileOutputStream - podatke koje unosimo saljemo u zadat fajl
		
		FileOutputStream fos = new FileOutputStream("rezultat.txt");
		
		System.out.println("Unesite string (unos prekinite unosom karaktera $)");
		
		// read()    - metoda za citanje podataka koje unosimo
		// write()   - da upisemo
		
		char ch;
		
		while((ch = (char)dis.read()) != '$') {
			fos.write(ch);
		}
		fos.close();
		 
		
		
		
	}

}
