// prvi nacin dodavanja paketa: prelaskom misa preko naziva klase i import

package p2;

import p1.First; // drugi nacin je da sami otkucamo(importujemo)paket   npr. import p1.*; to importuje sve metode

//DAKLE: import paket.nazivKlase; - importuje se samo zadata klasa iz navedenog paketa
//DAKLE: import paket.*; - importuju se sve klase iz navedenog paketa

public class ImportPackage {

	public static void main(String[] args) {
		
		First f = new First(); // kreiranje objekta klase
		f.view(); // poziv funkcije za dati objekat

	}

}
