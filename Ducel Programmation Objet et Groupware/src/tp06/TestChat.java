package tp06;

public class TestChat {
	public static void main(String[] args) {
		/** cr�e une instance de chat */
		Chat c = new Chat();
		//c.crie();
		/** le domestiquer */
		c.domestiquer("Minou");
		/** le pr�senter */
		c.presente();
		c.crie();
		
		/** cr�e un chat sauvage */
		Chat s = new Chat();
		s.presente();
		s.crie();
	}
}
