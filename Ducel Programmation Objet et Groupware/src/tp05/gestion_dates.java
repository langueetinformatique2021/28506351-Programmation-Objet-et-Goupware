package tp05;

public class gestion_dates {
	/** calcul du nombre de jours entre aujourd'hui et le 14 juillet 2022 */

	public static void main(String[] args) {
		// Instanciation de deux objets de type date
				//Date today = new Date(); 
				Date today = new Date(28,10,2021); 
				//Date dfin = new Date();
				Date dfin = new Date(14,07,2022);
				int i = 0;

				today.Afficher(); dfin.Afficher();
				//do { today.Incrementer(); today.Afficher(); i=i+1; }
				do { today.Incrementer(); i=i+1; }
				while (today.CompareTo(dfin));
				
				System.out.println("C'est dans "+i+" jours");
	}
		}

