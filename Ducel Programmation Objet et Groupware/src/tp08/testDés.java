package tp08;

public class testD�s {
	public static void main(String[] args) {
		TroisD�s d1 = new TroisD�s();
		TroisD�s d2 = new TroisD�s();
		TroisD�s d3 = new TroisD�s();
		lancerD�s(d1, d2, d3);
		/*System.out.println(d1.lancerD�s("Fanny"));
		System.out.println(d2.lancerD�s("Fanny"));
		System.out.println(d3.lancerD�s("Fanny"));*/
	}
	
	//pour lancer sur 3 d�s directement
	public static void lancerD�s(TroisD�s d1, TroisD�s d2, TroisD�s d3) {
		System.out.println(d1.lancerD�s("Fanny"));
		System.out.println(d2.lancerD�s("Fanny"));
		System.out.println(d3.lancerD�s("Fanny"));
	
	}
}
