
import es.*;

public class exercice21 {

	public static void main(String[] args) {

		// écrire votre code ici...
		Ecriture.uneChaine("Entrer un entier : ") ;
		int a = Lecture.unEntier();
                Ecriture.nouvelleLigne();
                Ecriture.uneChaine("Entrer un deuxième entier : ");
                a = a * Lecture.unEntier();
                Ecriture.uneChaine("Le produit de ces deux entiers est : ");
                Ecriture.unEntier(a);
                Ecriture.nouvelleLigne();
               
        }

}
