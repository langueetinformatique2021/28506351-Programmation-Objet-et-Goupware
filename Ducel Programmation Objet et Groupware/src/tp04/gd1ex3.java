package tp04;

public class gd1ex3 {
	//obtenir médiane de p1, p2, p3 dans p4
	//médiane (pour série impaire) = valeur de rang N+1/2 (N est l'effectif, valeurs triées dans ordre croissant)
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
				
		//la valeur du milieu (ni le min ni le max)
		if (p1 > p2) {
			if (p3 > p1)
				p4 = p1;
			else p4 = p2;
		}
		else {
			if (p3 > p2)
				p4 = p2;
			else 
				p4 = p1;
		}
		System.out.println(p4);


	}
}
