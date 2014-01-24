
import es.*;

public class exercice23 {

    public static void main(String[] args) {

        int a, b, c, max;
        Ecriture.uneChaine("Entrer trois entiers :");
        Ecriture.nouvelleLigne();
        Ecriture.uneChaine("a = ");
        a = Lecture.unEntier();
        Ecriture.nouvelleLigne();
        Ecriture.uneChaine("b = ");
        b = Lecture.unEntier();
        Ecriture.nouvelleLigne();
        Ecriture.uneChaine("c = ");
        c = Lecture.unEntier();

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        if (max <= c) {
            max = c;
        }

        Ecriture.nouvelleLigne();
        Ecriture.uneChaine("Le maximum est : ");
        Ecriture.unEntier(max);
        Ecriture.nouvelleLigne();

        ////
        Ecriture.uneChaine("Entrer deux entiers :");
        Ecriture.nouvelleLigne();
        Ecriture.uneChaine("a = ");
        a = Lecture.unEntier();
        Ecriture.nouvelleLigne();
        Ecriture.uneChaine("b = ");
        b = Lecture.unEntier();

        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (a == b) {
            Ecriture.uneChaine("Mêmes valeurs absolues");
        } else {
            Ecriture.uneChaine("Valeurs absolues différentes");
        }

    }
}
