package djuric;

import java.util.*;    // importovanje sa znakom *  -- ucitavanje svega iz klase util, pa i skenera

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r, a;
		System.out.println("Unesite poluprecnik: ");
		r = sc.nextDouble();
		a = 3.14 * r * r;
		System.out.println("Povrsina kruga: " + a);

	}

}
