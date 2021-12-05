package devoir6;

public class testBlackJack {
	public static void main(String[] args) {
		/** On simplifie, le Blackjack se joue alors avec 2 cartes en main */
		Cartes c1 = new Cartes();
		Cartes c2 = new Cartes();

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
		/** Le but est que la somme des 2 cartes soit égale à 21 */
		int valeur_c1 = c1.tirer();
		int valeur_c2 = c2.tirer();
		if (valeur_c1+valeur_c2==21)
			throw new BlackJack("gagnant avec des cartes de valeur "+ valeur_c1 + " et " +valeur_c2);

	}

}