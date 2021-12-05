package tp08;

public class testDés {
	public static void main(String[] args) {
		TroisDés d1 = new TroisDés();
		TroisDés d2 = new TroisDés();
		TroisDés d3 = new TroisDés();
		lancerDés(d1, d2, d3);
		/*System.out.println(d1.lancerDés("Fanny"));
		System.out.println(d2.lancerDés("Fanny"));
		System.out.println(d3.lancerDés("Fanny"));*/
	}
	
	//pour lancer sur 3 dés directement
	public static void lancerDés(TroisDés d1, TroisDés d2, TroisDés d3) {
		System.out.println(d1.lancerDés("Fanny"));
		System.out.println(d2.lancerDés("Fanny"));
		System.out.println(d3.lancerDés("Fanny"));
	
	}
}
