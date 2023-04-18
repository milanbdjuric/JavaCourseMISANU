package djuric;

public class GenerickaKlasa<GenerickiTip1, GenerickiTip2> {
	
	GenerickiTip1 objekat1;
	GenerickiTip2 objekat2;
	
	GenerickaKlasa(GenerickiTip1 x, GenerickiTip2 y){
		objekat1 = x;
		objekat2 = y;
	}

	public GenerickiTip1 getObjekat1() {
		return objekat1;
	}

	public void setObjekat1(GenerickiTip1 objekat1) {
		this.objekat1 = objekat1;
	}

	public GenerickiTip2 getObjekat2() {
		return objekat2;
	}

	public void setObjekat2(GenerickiTip2 objekat2) {
		this.objekat2 = objekat2;
	}
	}

