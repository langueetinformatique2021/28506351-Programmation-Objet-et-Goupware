package tp04;

public class Boucle1 {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0, i2 = s2.length() - 1;
		char c1, c2;
		boolean flag=false;

		c1 = s1.charAt(i1);
		c2 = s2.charAt(i2);
		
		if (s1.length() == s2.length()) {
			do {
			flag=true;
			}
		while (c1==c2);

		i1++;
		i2++;
	}
	}
}
