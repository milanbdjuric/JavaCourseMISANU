package djuric;

import java.io.*;

public class Mejn {

	public static void main(String[] args) throws IOException  {
		
		File x = new File("D:/djuric.txt");  // pravimo instancu klase fajl (uvedene preko java.io.*;) 
		
		x.createNewFile();   // kreiramo fajl u rootu particije D  

		FileWriter fw = new FileWriter("D:/djuric.txt");  // pravimo instancu klase FileWriter (takodje uvedene preko java.io.*;) 
		
		fw.write("Ja sam programer! "); // unosimo String u fajl
		
		fw.close();  // zatvaramo FileWriter

		

		
		
		

	}

}
