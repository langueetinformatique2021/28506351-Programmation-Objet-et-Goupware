package tp01;
/**
 * 
 * @author Fanny
 *
 */

public class PairImpair {

	public static void main(String[] args) {
		/**
		 * @param args
		 */

		// TODO Auto-generated method stub
		System.out.println(pair(11));
		System.out.println(pair(10));
		System.out.println(pair(11));
		System.out.println(pair(10));
	}

	public static boolean impair(int val) {
		/** test d'imparite
		 * @param val entier
		 * @return true si l'entier est impair, false sinon
		 */
		// Renvoie le contraire du resultat de la methode pair
		return (!pair(val));
	}
	
	public static boolean pair(int val) {
		/** test de parite
		 * @param val entier
		 * @return true si l'entier est pair, sinon false
		 */
		//Si la division par 2 est égale à 0, renvoie true, sinon faux
		if ((val % 2) == 0) return true;
		else return false;
	}
}
