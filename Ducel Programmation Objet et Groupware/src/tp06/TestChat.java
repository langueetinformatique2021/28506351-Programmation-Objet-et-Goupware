package tp06;

public class TestChat {
	public static void main(String[] args) {
		/** crée une instance de chat */
		Chat c = new Chat();
		//c.crie();
		/** le domestiquer */
		c.domestiquer("Minou");
		/** le présenter */
		c.presente();
		c.crie();
		
		/** crée un chat sauvage */
		Chat s = new Chat();
		s.presente();
		s.crie();
	}
}
