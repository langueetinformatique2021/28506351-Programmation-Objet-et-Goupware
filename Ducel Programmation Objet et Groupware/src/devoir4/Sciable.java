package devoir4;

public interface Sciable {
	/** Scier un arbre pour faire quelque chose de son bois
	 * @param objet objet cr�� avec le bois */
	 public abstract void scier(String objet);
	 
	/** Rend l'objet cr�� avec le bois
	 * @return objet cr�� */ 
	 public abstract String objet();
}