package tp05;

public class Carafe {
	//2 attributs privés
	private int contenu_, capacite_;
	
	/** creation carafe vide d'une capacite donnee
	 * 
	 * @param capacite de la carafe en litres
	 */
	
	//5 méthodes publiques = opérations Remplir, Vider, Contenu, Capacite, Transvaser
	//méthode du constructeur = initialise donc même nom que classe
	
	/** creation carafe vide d'une capacite donnee
	 * @param capacite de la carafe en L
	 */
	public Carafe(int capacite) {
		capacite_ = capacite;
		contenu_ = 0;
	}

	/** creation carafe vide d'une capacite donnee
	 * @param capacite de la carafe en L
	 * @param contenu quantite d'eau en litres contenue dans la carafe
	 */
	public Carafe(int capacite, int contenu) {
		capacite_ = capacite;
		if (contenu > capacite)
			//preciser qu'on ne peut pas avoir + d'eau que la capacite de la carafe le permet (pt pas 10L dans une carafe de 5)
			contenu_ = capacite;
		else contenu_ = contenu;
	}
	
	/** remplir completement une carafe*/
	public void Remplir() {
		contenu_ = capacite_;
	}
	
	/** vider completement une carafe */
	public void Vider() {
		contenu_ = 0;
	}
	
	/**contenu d'une carafe
	 * @return contenu en litres */
	public int Contenu() {
		//accesseur en lecture
		return contenu_;
	}
	
	/**capacite d'une carafe
	 * @return capacite en litres */
	public int Capacite() {
		//accesseur en lecture
		return capacite_;
	}
	
	/** transvaser une carafe à une autre
	 * @param autreC l'autre carafe */
	public void Transvaser(Carafe autreC) {
		//2 cas : il reste assez de place dans la carafe pour prendre le contenu de la 1re (il y a - d'eau dans la 1re que de place restante dans la 2e)
		if (Contenu() < (autreC.Capacite() - autreC.Contenu())) {
			//ajoute contenu de la 1re dans la deuxieme
			autreC.contenu_ += Contenu();
			//vide la 1re
			Vider();
		}
		else {
			contenu_ -= autreC.Capacite() - autreC.Contenu();
			autreC.Remplir();
		}
		
	}
}
