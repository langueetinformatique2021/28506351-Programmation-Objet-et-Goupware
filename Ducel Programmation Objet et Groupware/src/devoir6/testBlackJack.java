package devoir6;

public class testBlackJack {
	public static void main(String[] args) {
		/** On simplifie, le Blackjack se joue alors avec 2 cartes en main */
		
		/**simplification : 11 valeurs possibles : l'as vaut 1 ou 11, 2 vaut 2, etc jusqu'? 10, les figures valent 10*/
		Cartes c1 = new Cartes(11);
		Cartes c2 = new Cartes(11);

		int n= 0;
		try {
			while (true) {
				tirerCartesBlackJack(c1,c2);
				n++;
			}
		}

		catch (BlackJack e) {
			System.out.println(e.getMessage() + " au bout de " + n + " tentatives");
		}
	}

	public static void tirerCartesBlackJack(Cartes c1, Cartes c2) throws BlackJack {
		/** Le but est que la somme des 2 cartes soit ?gale ? 21 */
		int valeur_c1 = c1.tirer();
		int valeur_c2 = c2.tirer();
		if (valeur_c1+valeur_c2==21)
			throw new BlackJack("gagnant avec des cartes de valeur "+ valeur_c1 + " et " +valeur_c2);

	}

}