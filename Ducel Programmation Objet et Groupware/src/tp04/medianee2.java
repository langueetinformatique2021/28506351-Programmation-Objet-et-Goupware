package tp04;

public class medianee2 {

	public static void main(String[] args) {
		//pour que valeur soit m�diane, doit �tre inf�rieure � 2 valeurs et sup�rieure � 2 valeurs
		//faire chaque cas : cas o� p1 est la m�diane, p2 est m�diane, ...
		//int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6=0;
		int p1 = 3, p2 = 10, p3 = 2, p4 = 4, p5 = 8;
			
		//si p1 est m�diane = inf�rieur � 2 autres valeurs
		if ((p1>p2 && p1>p3) | (p1>p2 && p1>p4) | (p1>p2 && p1>p5) | (p1>p3 && p1>p4) | (p1>p3 && p1>p5)| (p1>p4 && p1>p5)) {
			//+ sup�rieur � 2 autres valeurs
			if ((p1<p2 && p1<p3) | (p1<p2 && p1<p4) | (p1<p2 && p1<p5) | (p1<p3 && p1<p4) | (p1<p3 && p1<p5)| (p1<p4 && p1<p5)) {
				p6 = p1; 
			}}
		
		//pour que p2 soit m�diane
		if ((p2>p1 && p2>p3) | (p2>p1 && p2>p4) | (p2>p1 && p2>p5) | (p2>p3 && p2>p4) | (p2>p3 && p2>p5)| (p2>p4 && p2>p5)) { 
			//+ sup�rieur � 2 autres valeurs
			if ((p2<p1 && p2<p3) | (p2<p1 && p2<p4) | (p2<p1 && p2<p5) | (p2<p3 && p2<p4) | (p2<p3 && p2<p5)| (p2<p4 && p2<p5)) {
				p6 = p2; 
			} }
		
		//pour que p3 soit m�diane
		if ((p3>p1 && p3>p2) | (p3>p1 && p3>p4) | (p3>p1 && p3>p5) | (p3>p2 && p3>p4) | (p3>p2 && p3>p5)| (p3>p4 && p3>p5)) { 
				//+ sup�rieur � 2 autres valeurs
				if ((p3<p1 && p3<p2) | (p3<p1 && p3<p4) | (p3<p1 && p3<p5) | (p3<p2 && p3<p4) | (p3<p2 && p3<p5)| (p3<p4 && p3<p5)) {
					p6 = p3; 
				} }
				
		//pour que p4 soit m�diane
		if ((p4>p1 && p4>p2) | (p4>p1 && p4>p3) | (p4>p1 && p4>p5) | (p4>p2 && p4>p3) | (p4>p2 && p4>p5)| (p4>p3 && p4>p5)) { 
			//+ sup�rieur � 2 autres valeurs
			if ((p4<p1 && p4<p2) | (p4<p1 && p4<p3) | (p4<p1 && p4<p5) | (p4<p2 && p4<p3) | (p4<p2 && p4<p5)| (p4<p3 && p4<p5)) {
				p6 = p4; 
				} }
			
		//pour que p5 soit m�diane (A FAIRE)
		if ((p5>p1 && p5>p2) | (p5>p1 && p5>p3) | (p5>p1 && p5>p4) | (p5>p2 && p5>p3) | (p5>p2 && p5>p4)| (p5>p3 && p5>p4)) { 
				//+ sup�rieur � 2 autres valeurs
			if ((p5<p1 && p5<p2) | (p5<p1 && p5<p3) | (p5<p1 && p5<p4) | (p5<p2 && p5<p3) | (p5<p2 && p5<p4)| (p5<p3 && p5<p4)) {
				p6 = p5; 
				} }
			
		System.out.println(p6);


		}
}