package tp04;

public class Boucle2 {
	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		boolean flag = false;

		if (s1.length() == s2.length()) {
			int i = 0, n = s1.length(); //attention mettre une variable de boucle (sinon entre/sort jamais)
			while (i<n) {
				if (s1.charAt(i) != s2.charAt(n - i - 1))
					break;
				i++;
			}
			if (i == n)
				flag = true;

		}

		System.out.println(flag);
	}


}