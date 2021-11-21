package devoir4;

/** Création d'une sous-classe de Vegetal */
public class Arbre extends Vegetal {
	//ajout d'un attribut propre à cette sous-classe
	protected boolean caduc = false;
	
	/** Constructeur d'Arbre, fait appel au constructeur de Vegetal */
	public Arbre(String type, int hauteur) {
		super(type, hauteur, true); //tous les arbres ont des troncs
	}
	
	/** ajout d'une méthode propre à la sous-classe : perdre leurs feuilles (pour ceux à feuillage caduc) */
	public void perdFeuilles() {
		caduc = true;
	}
	
	/** description des caractéristiques d'Arbre */
	public void decrit() {
//appel de la méthode de la super classe
		super.decrit();
		String feuillage = (caduc) ? "caduc" : "persistant";
		System.out.println("Leur feuillage est " + feuillage) ;
		if (caduc = true)
			System.out.println("Ils perdent donc leurs feuilles en automne.");
}
	/** photosynthèse des arbres */
	public void photosynthese() {
		// TODO Auto-generated method stub
		System.out.println("Ils produisent de l'oxygène et absorbent du CO2 !");
	}
	
}
