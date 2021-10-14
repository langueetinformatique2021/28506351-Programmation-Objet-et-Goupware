package tp02;

/**Exécution de la méthode divise m fois, avec i comme paramètre avec la première itération puis le résultat du précédent appel aux itérations suivantes
 * 
 * @author Fanny Ducel
 * @version 0.1 */

public class testAB {

	public static void main(String[] args) {
		/* Initialisation des variables : i, paramètre de la méthode divise
		 j, compteur d'itération qui s'incrémente jusqu'à arriver à m, nombre voulu d'itérations */

		int i;
		int j;
		// m à modifier selon le nombre d'itérations voulu
		int m = 10;
        for (i = 1, j = 1; j <= m; i = B.divise(i), j++) {
        	/*à chaque itération, i se met à jour pour prendre la valeur du précédent résultat de l'appel à la méthode divise
        	et j s'incrémente de 1*/
        	System.out.println(i);

        }
	}
}