package devoir3;

public class Promotion {
private String[] listeEtudiants_;
	
	/** Création d'une promotion (méthode du constructeur)
	 * 
	 * @param listeEtudiants liste contenant des objets "étudiants" (créés par la classe Etudiant.java)
	 */
	public Promotion(String[] listeEtudiants) {
		
	}
	
	/**liste d'étudiants de la promotion
	 * @return la liste d'étudiants */
	public String[] ListeEtudiants() {
		//accesseur en lecture
		return listeEtudiants_;
	}
	
	/** Compter le nombre d'étudiants d'une promotion
	 * 
	 * @param Promotion la liste des étudiants de la promotion
	 * @return le nombre d'étudiants (la taille de la liste)
	 */
	public static int nbEtudiants(String[] Promotion) {
		
	}
	
	/** Faire l'appel de la promotion en cours, déterminer la liste des présents 
	 * (par exemple avec un système de boucles en if avec des bool qui parcourent la liste Promotion et demande si chaque étudiant est là ou non, ceux qui sont présents sont mis dans la liste Presents)
	 * @param Promotion : la liste des étudiants de la promotion
	 * @return la liste des étudiants présents
	 */
	public static String[] appel(String[] Promotion) {
		
	}
}
