package tp08;

public class testE421 {
	public static void main(String[] args) {
			TroisD�s d1 = new TroisD�s();
			TroisD�s d2 = new TroisD�s();
			TroisD�s d3 = new TroisD�s();
			try {
				while (true)
					lancerDes421(d1, d2, d3);
			}

			catch (E421 e) {
				System.out.println(e.getMessage());
			}
		}

		public static void lancerDes421(TroisD�s d1, TroisD�s d2,TroisD�s d3) throws E421 {
			if ((d1.lancerD�s("F") == 4) && (d2.lancerD�s("F") == 2) && (d3.lancerD�s("F") == 1))
				throw new E421("gagnant");

		}

	}