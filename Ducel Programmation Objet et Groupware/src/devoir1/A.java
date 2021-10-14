package devoir1;
/**
 * 
 * @author Fanny Ducel
 *
 */

public class A {
	
	//Pour tester la methode treize
	public static void main(String[] args) {
		System.out.println(treize(26));
		System.out.println(treize(10));
	}
	
	/** test de divisibilite par 13
	 * @param n	entier
	 * @return true si l'entier n est divisible par 13 sinon false
	 */
	public static boolean treize(int n) {
		if ((n % 13) == 0) return true;
		else return false;
	}
}
