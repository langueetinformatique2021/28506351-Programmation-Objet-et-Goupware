package devoir5;

import java.util.Calendar;
import java.util.Date;

/** Classe Calendar 2 dérivée de Calendar
 * @author Fanny
 */
public class Calendar2 extends Calendar {
	boolean cours = false ;
	//devient vrai si l'objet est créé pendant le cours
	/**création d'un objet (ici type calendrier) et initialisation de sa date et heure de création*/
	Calendar calendar = Calendar.getInstance();
	Date trialTime = new Date();
	
	/** affiche la date et l'heure de la création de l'objet 
	 * @return */
	public void creation() {
		calendar.setTime(trialTime);
		System.out.println(trialTime);
		//cours devient vrai si objet créé le jeudi entre 9h30 et 12h
		 int jour = calendar.get(Calendar.DAY_OF_WEEK);
		 int heure = calendar.get(Calendar.HOUR_OF_DAY);
		 //jeudi = 5 (car lundi = 2)
		 if (jour==5 && heure<12 && heure>9){
			 cours = true;
			 System.out.println("L'objet a été créé pendant le cours");
		 }	 
	}
	
	/** affiche la date et l'heure courante */
	public void afficher() {
		Date courante = new Date();
		System.out.println(courante);
	}
	
	/** affiche le nombre de secondes depuis la création de l'objet 
	 * @return */
	public void duree() {
		long duree = calendar.getTimeInMillis();
		long maintenant = getTimeInMillis();
		System.out.println(maintenant-duree);
	}
	
	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(int field, int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void roll(int field, boolean up) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		// TODO Auto-generated method stub
		return 0;
	}
}
