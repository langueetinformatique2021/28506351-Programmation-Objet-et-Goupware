package tp04;

public class Iteration {
	public static void main(String[] args) {
		String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djame"};
		
		int imin = 0; // 1er élément liste
		
		//prenoms[0].compareTo(prenoms[1]);
		
		for (int i=1; i<prenoms.length; i++) { //faire commencer à 1, sinon comparaison inutile (car imin=0)
			if (prenoms[i].compareTo(prenoms[imin]) < 0) {
				imin = i;
			}
		}
		
		System.out.println(prenoms[imin]);

	}
}
