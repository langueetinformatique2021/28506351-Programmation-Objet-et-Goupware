package tp07;

public class Cercle extends FigureGeometrique implements Comparable {
	
	protected float rayon=0;

	public Cercle(float r) {
		super("noir");
		rayon = r;
	}
	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return (float)(2*Math.PI*rayon);
	}

	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return (float)(Math.PI*rayon*rayon);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Cercle c = (Cercle)o;
		if (c.rayon < rayon) return 
		return 0;
	}

}
