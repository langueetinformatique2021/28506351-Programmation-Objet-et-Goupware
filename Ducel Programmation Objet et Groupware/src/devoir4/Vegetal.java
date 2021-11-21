package devoir4;

public abstract class Vegetal {
	private String esp�ce;
	private int hauteur_cm;
	private boolean tronc;
	
	/**
	 * cr�ation d'une nouvelle instance de la classe Vegetal
	 * 
	 * @param type   nom de l'esp�ce
	 * @param hauteur hauteur du v�g�tal en cm
	 * @param aTronc booleen selon si ce v�g�tal poss�de un tronc ou non
	 */
	public Vegetal(String type, int hauteur, boolean aTronc) {
		esp�ce = type;
		hauteur_cm = hauteur;
		tronc = aTronc;
	}

	/** description des caract�ristiques du v�g�tal */
	public void decrit() {
		System.out.println("Les " + esp�ce + "s sont des esp�ces de v�g�taux mesurant en moyenne " + hauteur_cm + " cm de haut");
		if (tronc==true) 
			System.out.println("Ils poss�dent un tronc");
	}

	/** ce qui est commun � tous les v�g�taux c'est de faire de la photosynth�se */
	public abstract void photosynthese();
}