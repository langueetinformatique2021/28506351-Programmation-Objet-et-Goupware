package devoir3;

public class Promotion {
private String[] listeEtudiants_;
	
	/** Cr�ation d'une promotion (m�thode du constructeur)
	 * 
	 * @param listeEtudiants liste contenant des objets "�tudiants" (cr��s par la classe Etudiant.java)
	 */
	public Promotion(String[] listeEtudiants) {
		
	}
	
	/**liste d'�tudiants de la promotion
	 * @return la liste d'�tudiants */
	public String[] ListeEtudiants() {
		//accesseur en lecture
		return listeEtudiants_;
	}
	
	/** Compter le nombre d'�tudiants d'une promotion
	 * 
	 * @param Promotion la liste des �tudiants de la promotion
	 * @return le nombre d'�tudiants (la taille de la liste)
	 */
	public static int nbEtudiants(String[] Promotion) {
		
	}
	
	/** Faire l'appel de la promotion en cours, d�terminer la liste des pr�sents 
	 * (par exemple avec un syst�me de boucles en if avec des bool qui parcourent la liste Promotion et demande si chaque �tudiant est l� ou non, ceux qui sont pr�sents sont mis dans la liste Presents)
	 * @param Promotion : la liste des �tudiants de la promotion
	 * @return la liste des �tudiants pr�sents
	 */
	public static String[] appel(String[] Promotion) {
		
	}
}
