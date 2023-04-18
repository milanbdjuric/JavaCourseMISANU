package djuric;

import java.util.Stack;

public class Mejnara {

	public static void main(String[] args) {
		
		Krug k = new Krug(10.5);
		
		System.out.println("Povrsina je: " + k.uzmiPovrsinu());
		
		Pravougaonik p = new Pravougaonik(3, 5);
		
		System.out.println("Povrsina je: " + p.uzmiPovrsinu());
		
		Stack stek = new Stack();
		
		stek.push(k);
		stek.push(p);
		

	}

}
