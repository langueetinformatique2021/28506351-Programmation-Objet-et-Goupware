package devoir4;

public interface Sciable {
	/** Scier un arbre pour faire quelque chose de son bois
	 * @param objet objet créé avec le bois */
	 public abstract void scier(String objet);
	 
	/** Rend l'objet créé avec le bois
	 * @return objet créé */ 
	 public abstract String objet();
}