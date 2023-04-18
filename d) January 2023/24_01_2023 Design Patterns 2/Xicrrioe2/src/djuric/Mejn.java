package djuric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mejn {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream("d:/djuric.java");
		
		int x;
		
		while((x = f.read()) != -1) {
			System.out.print((char)x);
		}
		
		f.close();
		
	}

}
