
import es.*;

public class exercice24 {

    public static void main(String[] args) {

        int n, i, c=0;
        Ecriture.uneChaine("Entrer un entier positif : ");
        n = Lecture.unEntier();
        while (n < 0) {
            Ecriture.uneChaine("POSITIF !!");
            Ecriture.nouvelleLigne();
            Ecriture.uneChaine("Entrer un entier positif : ");
            n = Lecture.unEntier();
        }
        
        for (i = 0; i <= n; i++) {
            c=i+c; 
        }
Ecriture.uneChaine("Somme relou : ");
Ecriture.unEntier(c);   // c=(n+1)*n /2
    }

}
