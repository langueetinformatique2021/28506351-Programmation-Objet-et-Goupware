package tp06;

/** Cr�ation et gestion d'animaux */
public abstract class Animal {
	private String esp�ce;
	private int nb_pattes = 0;

	/**
	 * cr�ation d'une nouvelle instance de la classe Animal
	 * 
	 * @param type   nom de l'esp�ce
	 * @param pattes nombre de pattes
	 */
	public Animal(String type, int pattes) {
		esp�ce = type;
		nb_pattes = pattes;
	}

	/** pr�sentation des caract�ristiques de l'animal */
	public void presente() {
		System.out.println("je suis un repr�sentant de l'esp�ce des " + esp�ce + "s et j'ai " + nb_pattes + " pattes");
	}

	/** cri de l'animal */
	public abstract void crie();
}