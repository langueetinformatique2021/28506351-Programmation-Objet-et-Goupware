package devoir4;

public abstract class Vegetal {
	private String espèce;
	private int hauteur_cm;
	private boolean tronc;
	
	/**
	 * création d'une nouvelle instance de la classe Vegetal
	 * 
	 * @param type   nom de l'espèce
	 * @param hauteur hauteur du végétal en cm
	 * @param aTronc booleen selon si ce végétal possède un tronc ou non
	 */
	public Vegetal(String type, int hauteur, boolean aTronc) {
		espèce = type;
		hauteur_cm = hauteur;
		tronc = aTronc;
	}

	/** description des caractéristiques du végétal */
	public void decrit() {
		System.out.println("Les " + espèce + "s sont des espèces de végétaux mesurant en moyenne " + hauteur_cm + " cm de haut");
		if (tronc==true) 
			System.out.println("Ils possèdent un tronc");
	}

	/** ce qui est commun à tous les végétaux c'est de faire de la photosynthèse */
	public abstract void photosynthese();
}