package tp08;

public class division {

	public static void main(String[] args) {
		int i=1000, j;
		try {
		do {i--; j = 1/i;} while (true);
		// TODO Auto-generated method stub
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("Reprise du contrôle d'exécution");
			e.printStackTrace();
			System.out.println("Sortie de programme");System.exit(0);
		}
		
	}

}
