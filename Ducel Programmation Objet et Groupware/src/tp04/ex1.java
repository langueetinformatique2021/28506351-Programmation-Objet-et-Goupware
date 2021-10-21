package tp04;

public class ex1 {
	
	//en fait ex2 du grand 1, voir Conditionnelle1 dans packages prof pour correction du 1 (retard)
	//ajouter instructions structurées par branchements conditionnels permettant d'obtenir le max des variables p1, p2, p3 dans p4

	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		if (p1 < p2) {
			if (p3 < p1)
				p4 = p3;
			else p4 = p1;
		}
		else {
			if (p3 < p2)
				p4 = p3;
			else 
				p4 = p2;
		}
		
		System.out.println(p4);


	}

}
