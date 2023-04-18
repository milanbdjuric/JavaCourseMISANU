package djuric;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		DataInputStream d = new DataInputStream(System.in);
		FileOutputStream f = new FileOutputStream("d:/djuric.java");
		
		int x;
		
		System.out.println("Unosi / za stop je $.");
		
		while((x = (char)d.read()) != '$') {
			f.write(x);
		}
		
	

	}

}
