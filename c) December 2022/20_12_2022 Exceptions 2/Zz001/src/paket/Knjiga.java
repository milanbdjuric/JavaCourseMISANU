package paket;

import java.io.*;

public class Knjiga {

	private String naziv; 
	private String autor; 
	private String izdavac; 
	
	public void unetiNazivKnjige() { 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		while(true) { 
			try { 
				System.out.print("Unesite naziv knjige: "); 
				naziv = bf.readLine(); 
				if(!naziv.isBlank()) 
					break;
				} catch(Exception e) { 
					System.out.println("Pogrešan unos. Greška " + e.getLocalizedMessage());
					} 
			}		
	}
	

	
	public String toString() { return "\nNaziv knjige: " + naziv + "\nAutor knjige: " + autor + "\nIzdavač: " + izdavac; } }
