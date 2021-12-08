package devoir6;

public class testBataille {
	public static void main(String[] args) {
		/**On programme l'équivalent d'une manche, chaque joueur tire une carte et la met face à l'autre*/
		/** 13 valeurs possibles : de 1 à 10, on traduit valet = 11, dame = 12, roi = 13 */
		Cartes c1 = new Cartes(13);
		Cartes c2 = new Cartes(13);

		int n= 0;
		try {
			while (true) {
				tirerCartesBataille(c1,c2);
				n++;
				if (c1.tirer() > c2.tirer()) {
					System.out.println("Le joueur 1 l'emporte ! " + c1.tirer() + " vs " + c2.tirer());
				}
				if (c1.tirer() < c2.tirer()) {
					System.out.println("Le joueur 2 l'emporte ! " + c1.tirer() + " vs " + c2.tirer());
				}
			}
		}

		catch (Bataille e) {
			System.out.println(e.getMessage() + " au bout de " + n + " tentatives");
		}
	}

	public static void tirerCartesBataille(Cartes c1, Cartes c2) throws Bataille {
		/** Il y a bataille quand les joueurs ont une carte de valeur identique */
		int valeur_c1 = c1.tirer();
		int valeur_c2 = c2.tirer();
		if (valeur_c1==valeur_c2)
			throw new Bataille("Bataille ! (avec des cartes de valeur "+ valeur_c1 + " et " +valeur_c2 + " )");

	}

}