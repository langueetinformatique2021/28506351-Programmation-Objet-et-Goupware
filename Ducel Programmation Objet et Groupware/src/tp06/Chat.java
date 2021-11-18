package tp06;

/** Cr�ation d'une classe chat d�riv�e de la classe F�lin et impl�mentant l'interface Domesticable */
public class Chat extends Felin implements Domesticable {
	
	String nom;
	
	/** Instancier la classe chat */
	public Chat() {
		super("chat");
		// TODO Auto-generated constructor stub
	}
	
	public void domestiquer(String nom) {
		//System.out.println("Je m'appelle "+nom);
		domestique = true;
		this.nom = nom;
	}

	@Override
	public String nom() {
		return nom;
	}
	
	/** Pr�ciser le cri */
	public void crie() {
		if (domestique == true)
			System.out.println("miaou");
		else
			System.out.println("MIAOU");
	}
	
	public void presente() {
		super.presente();
		if (domestique == true)
			System.out.println("Je m'appelle "+nom);
	}
}
