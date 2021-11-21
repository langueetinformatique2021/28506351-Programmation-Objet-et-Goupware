package devoir4;

public class Peuplier extends Arbre implements Sciable {

	String objet; 
	boolean scie = false;
	
	/** Instancier la classe Peuplier */
	public Peuplier() {
		super("peuplier", 250);
		super.perdFeuilles();
	}
	
	/** Une méthode supplémentaire propre à cette classe, liée à l'interface Sciable */
	public void scier(String objet) {
		scie = true;
		this.objet = objet;
	}

	public String objet() {
		return objet;
	}
	
	public void decrit() {
		super.decrit();
		if (scie == true)
			System.out.println("On peut le scier pour en faire des " + objet +"s");
	}
}
