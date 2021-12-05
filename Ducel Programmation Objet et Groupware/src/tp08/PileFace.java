package tp08;

public class PileFace {

	public static void main(String[] args) {
		/*pile = 1, face = 2*/
		Aleat jet = new Aleat(2);
		int j =0, pile=0, face=0;
		//plutôt avec un for
		do {
		int i = jet.get();
		//System.out.println(i);
		j++;
		if (i==1) {pile++;}
		else {face++;}
		}while (j<1000);
		System.out.println(pile);
		System.out.println(face);

	}

}
