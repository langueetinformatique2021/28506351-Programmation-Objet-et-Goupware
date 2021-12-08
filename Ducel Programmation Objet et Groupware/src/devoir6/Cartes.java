package devoir6;

import tp08.Aleat;

public class Cartes {
	private Aleat carte;
	
	public Cartes(int x) {
	/** selon le jeu de cartes les valeurs sont différentes donc on choisit en temps voulu */
		carte = new Aleat(x);
	}

	int tirer() {
		return carte.get() ;
	}
}
