package tp02;

/**Ex�cution de la m�thode divise m fois, avec i comme param�tre avec la premi�re it�ration puis le r�sultat du pr�c�dent appel aux it�rations suivantes
 * 
 * @author Fanny Ducel
 * @version 0.1 */

public class testAB {

	public static void main(String[] args) {
		/* Initialisation des variables : i, param�tre de la m�thode divise
		 j, compteur d'it�ration qui s'incr�mente jusqu'� arriver � m, nombre voulu d'it�rations */

		int i;
		int j;
		// m � modifier selon le nombre d'it�rations voulu
		int m = 10;
        for (i = 1, j = 1; j <= m; i = B.divise(i), j++) {
        	/*� chaque it�ration, i se met � jour pour prendre la valeur du pr�c�dent r�sultat de l'appel � la m�thode divise
        	et j s'incr�mente de 1*/
        	System.out.println(i);

        }
	}
}