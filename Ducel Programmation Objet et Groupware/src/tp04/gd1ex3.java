package tp04;

public class gd1ex3 {
	//obtenir médiane de p1, p2, p3 dans p4
	public static void main(String[] args) {
		//int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p1 = 100, p2 = 9, p3 = 31, p4 = 4, p5 = 8;
			
		//la valeur du milieu (ni le min ni le max)
		if (p1 > p2) { 
			if (p3 > p1) //si p3 est le max et p2 le min
				p4 = p1; //alors p1 médiane
			else {
				if (p3>p2) //vérifier si p3 > p2 ; dans ce cas p2 min et p1 max
					p4 = p3; //si p1 max et p2 min alors p3 médiane (p2?)
				else p4 = p2;
			}
		}
		else { 
			if (p3 > p2) //si p3 max et p1 min
				p4 = p2; //alors p2 médiane
			else { //vérifier si p3 > p1
				if (p3>p1)
					p4 = p3;
				else p4=p1;
			}
		}
		System.out.println(p4);


	}
}
