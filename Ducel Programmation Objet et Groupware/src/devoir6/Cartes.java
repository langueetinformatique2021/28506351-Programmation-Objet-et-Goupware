package devoir6;

import tp08.Aleat;

public class Cartes {
	private Aleat carte;
	
	public Cartes() {
/**simplification : 11 valeurs possibles : l'as vaut 1 ou 11, 2 vaut 2, etc jusqu'à 10, les figures valent 10*/
		carte = new Aleat(11);
	}

	int tirer() {
		return carte.get() ;
	}
}
