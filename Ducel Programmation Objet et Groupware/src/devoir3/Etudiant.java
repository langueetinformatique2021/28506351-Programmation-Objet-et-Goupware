package devoir3;

public class Etudiant {
	/** attributs de classe
	on estime qu'un �tudiant est caract�ris� par 1 entier : son num�ro �tudiant
	+ des cha�nes de caract�res : nom, pr�nom, mention, parcours, niveau (M1 par exemple), mail de la fac
	+ des bool�ens pour savoir si l'�tudiant est boursier, salari�, et s'il a un am�nagement d'etude
	*/
	private int numeroEtudiant_;
	private String nom_, prenom_, mention_, parcours_, niveau_;
	private boolean boursier_, salarie_, amenagement_;
	
	//une m�thode du constructeur pour initialiser des �tudiants avec tous ces attributs
	/**
	 * Création et initialisation d'une nouvelle instance d'Etudiant
	 * @param numEtu, nom, prenom, mention, parcours, niveau, boursier, salarie, amenagement
	 */
	public Etudiant(int numEtu, String nom, String prenom, String mention, String parcours, String niveau, boolean boursier, boolean salarie, boolean amenagement) {
		numeroEtudiant_ = numEtu;
		nom_ = nom ; prenom_ = prenom; mention_ = mention; parcours_ = parcours ; niveau_ = niveau;
		boursier_ = boursier; salarie_ = salarie; amenagement_ = amenagement;
	}

}

