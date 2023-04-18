package djuric;

public class A<Temporary> { // genericka klasa. ovde je Temporary parametar tipa, koji ce biti zamenjen
	//stvarnim tipom kada se napravi objekat tipa A.
	
	Temporary object;
	
	A(Temporary object){
		this.object = object;  // konstruktor genericke klase
	}
	
	public void setObject(Temporary object) {  // setter
		this.object = object;
	}
	
	public Temporary getObject() {   // getter
		return object;
	}
	
	void prikaziTip() {   	//toString
		System.out.println("Tip Temporary je: " + object.getClass().getName());
	}

}
