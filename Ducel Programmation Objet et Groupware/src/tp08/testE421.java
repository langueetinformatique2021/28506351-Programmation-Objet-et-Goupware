package tp08;

public class testE421 {
	public static void main(String[] args) {
			TroisDés d1 = new TroisDés();
			TroisDés d2 = new TroisDés();
			TroisDés d3 = new TroisDés();
			try {
				while (true)
					lancerDes421(d1, d2, d3);
			}

			catch (E421 e) {
				System.out.println(e.getMessage());
			}
		}

		public static void lancerDes421(TroisDés d1, TroisDés d2,TroisDés d3) throws E421 {
			if ((d1.lancerDés("F") == 4) && (d2.lancerDés("F") == 2) && (d3.lancerDés("F") == 1))
				throw new E421("gagnant");

		}

	}