package tp04;

public class mediane2 {
	//TEST (obsol�te)
	//obtenir m�diane de p1, p2, p3, p4, p5 dans p6
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6=0;
		//int p1 = 100, p2 = 9, p3 = 31, p4 = 4, p5 = 8;
			
		//la valeur du milieu (ni le min ni le max)
		if (p2 > p1) { //alors p1 peut pas �tre le max
			if (p3 > p2) //alors p1 peut pas �tre le max et p3 + grand que p1 (p3>p2>p1)
				if (p4 > p3) //alors p3 peut pas �tre le max et p4>p3>p2>p1
					if (p5 > p4) //alors p5>p4>p3>p2>p1
						p6 = p3; //alors p3 m�diane
			else { //si p3 < p2
				if (p3>p1) //v�rifier si p3 > p2 ; dans ce cas p2 > p3 > p1
					if (p4 > p2) //si p4>p2>p3>p1
						if (p5 > p4) //alors p5>p4>p2>p3>p1
							p6 = p2; //alors p3 m�diane
				else { //si p2 > p1
					
				}
			/*else {
				if (p)
			}*/
			}
		}
		else { //si p1 > p2
			if (p3 > p2) //si p3 max et p1 min
				p6 = p2; //alors p2 m�diane
			else { //v�rifier si p3 > p1
				if (p3>p1)
					p6 = p3;
				else p6=p1;
			}
		}
		System.out.println(p6);

}
}