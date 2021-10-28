package tp05;

public class gestion_dates {
	/** calcul du nombre de jours entre aujourd'hui et le 14 juillet 2022 */
	//voir correction pour autre manière

	public static void main(String[] args) {
		// Instanciation de deux objets de type date
				Date today = new Date(28,10,2021); 
				Date dfin = new Date(14,07,2022);
				int nbJours = 0;

				today.Afficher(); dfin.Afficher();
				//do { today.Incrementer(); today.Afficher(); i=i+1; }
				do { today.Incrementer(); nbJours++; }
				while (today.CompareTo(dfin));
				
				System.out.println("C'est dans "+nbJours+" jours");
	}
		}

