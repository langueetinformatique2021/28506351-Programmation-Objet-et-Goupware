package tp08;

public class TroisD�s {
	private Aleat des;
	
	public TroisD�s() {
		des = new Aleat(6);
	}

	int lancerD�s(String lanceur) {
		return des.get() ;
	}
}
