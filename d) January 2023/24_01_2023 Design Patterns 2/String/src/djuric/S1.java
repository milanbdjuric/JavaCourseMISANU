package djuric;

public class S1 {

	public static void main(String[] args) {
		
		// Stringovi se predstavljanju klasom String
		
		String str = "qc894yt9yn..984()*^58979*5456$3yt";
		System.out.println(str);
		
		// Kreiranje stringa pomocu kljucne reci new
		
		String str1 = new String("Utorak, 24. januar. ");
		System.out.println(str1);
		
		// Inicijalizacija stringa postojecim stringom
		
		String s1 = "Podatak1";
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		// Inicijalizacija nizom char vrednosti
		
		char s3[] = {'J', 'a', 'v', 'a'};
		System.out.println(s3);
		String s4 = new String(s3);
		System.out.println(s4);
		
		// Inicijalizacija podnizom
		
		String s5 = new String(s3,1,3);
		System.out.println(s5);
		
		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";
		
		// Metoda equalsIgnoreCase leksikograski poredi stringove, ali ne pravi razliku izmedju malih i velikih slova.
		
		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + " equalsIgnoreCase " + s10 + " = " + s8.equalsIgnoreCase(s10));
		

		String s11 = "JAVA"; 
		String s12 = "JAVA"; 
		String s13 = "Java";
		
		String s14 = new String( "JAVA" ); 
		String s15 = new String( "JAVA" );
		System.out.println();
		
		System.out.println( s11 + " equals " + s12 + " = " + s11.equals( s12 ) ); 
		System.out.println( s11 + " == " + s12 + " = " + ( s11 == s12 ) ); 
		System.out.println( s11 + " equals " + s13 + " = " + s11.equals( s13 ) ); 
		System.out.println( s11 + " == " + s13 + " = " + ( s11 == s13 ) ); 
		System.out.println( s11 + " equals " + s14 + " = " + s11.equals( s14 ) ); 
		System.out.println( s11 + " == " + s14 + " = " + ( s11 == s14 ) ); 
		System.out.println( s14 + " equals " + s15 + " = " + s14.equals( s15 ) ); 
		System.out.println( s14 + " == " + s15 + " = " + ( s14 == s15 ) );
		
		// MOJNE -- ZA POREDZENJE STRINGOWA BRT
		
		
		String s16 = "JAVA"; 
		String s17 = "JAVA"; 
		String s18 = "Java";
		
		// Metoda copareTo poziva se kao: 
		// s1.compareTo(s2) 
		// vraca 0 ako su s1 i s2 jednaki, negativan broj ako je s1 manji, pozitivan broj ako je s1 veci od s2.
		
		System.out.println( s16 + " compared to " + s17 + " = " + s16.compareTo( s17 ) ); 
		System.out.println( s16 + " compared to " + s18 + " = " + s16.compareTo( s18 ) );
		
		
	}

}
