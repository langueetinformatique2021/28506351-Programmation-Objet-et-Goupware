package devoir3;

public class Etudiant {
	/** attributs de classe
	on estime qu'un étudiant est caractérisé par 1 entier : son numéro étudiant
	+ des chaînes de caractères : nom, prénom, mention, parcours, niveau (M1 par exemple), mail de la fac
	+ des booléens pour savoir si l'étudiant est boursier, salarié, et s'il a un aménagement d'etude
	*/
	private int numeroEtudiant_;
	private String nom_, prenom_, mention_, parcours_, niveau_;
	private boolean boursier_, salarie_, amenagement_;
	
	//une méthode du constructeur pour initialiser des étudiants avec tous ces attributs
	/**
	 * CrÃ©ation et initialisation d'une nouvelle instance d'Etudiant
	 * @param numEtu, nom, prenom, mention, parcours, niveau, boursier, salarie, amenagement
	 */
	public Etudiant(int numEtu, String nom, String prenom, String mention, String parcours, String niveau, boolean boursier, boolean salarie, boolean amenagement) {
		numeroEtudiant_ = numEtu;
		nom_ = nom ; prenom_ = prenom; mention_ = mention; parcours_ = parcours ; niveau_ = niveau;
		boursier_ = boursier; salarie_ = salarie; amenagement_ = amenagement;
	}

}

