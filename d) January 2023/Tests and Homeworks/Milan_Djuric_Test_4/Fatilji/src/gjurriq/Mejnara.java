package gjurriq;

import java.io.IOException;

public class Mejnara {

	public static void main(String[] args) throws IOException {
		
		Auto x = new Auto();
		
		x.unetiNazifAuta();
		x.unetiProizvajalcaAuta();
		x.unetiGodisceAuta();
		x.unetiPotrosljuAuta();
		
		System.out.println(x.toString());
		
		

	}

}
