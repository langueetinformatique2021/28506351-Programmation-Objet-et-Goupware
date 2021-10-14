package tp02;

public class B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divise(26));
		System.out.println(divise(10));
	}

	/** Test de divisibilite par 13
	 * @param n	entier
	 * @return 	n/2 si l'entier est divisible par 13, sinon n+2
	 */
	public static int divise(int n) {
		if ((n % 13) == 0) return n/2;
		else return n+2;
	}
}
