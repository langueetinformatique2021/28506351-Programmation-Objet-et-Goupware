package tp08;

public class TroisDés {
	private Aleat des;
	
	public TroisDés() {
		des = new Aleat(6);
	}

	int lancerDés(String lanceur) {
		return des.get() ;
	}
}
