package devoir4;

public class TestArbre {
	public static void main(String[] args) {
		Arbre s = new Arbre("sapin",300);
		s.perdFeuilles(); //à commenter pour tester l'autre option
		s.decrit();
		s.photosynthese();
	}
}