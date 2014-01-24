
import es.*;
import Robot.*;
import static java.lang.Math.*;

public class exercices {

    public static void ex311() {
        for (int i = 1; i <= 20; i++) {
            Ecriture.unEntier(i * i);
            Ecriture.nouvelleLigne();
        }
    }

    public static void ex312() {
        for (int i = 0; i < 100; i++) {
            if (pow(i, 3) - 18 * pow(i, 2) + 5 * i - 1 >= 0) {
                Ecriture.unEntier(i);
                Ecriture.nouvelleLigne();
            }
        }
    }

    public static long ex321(int n) {
        if (n <= 1) {
            return n;
        } else {
            return ex321(n - 1) + ex321(n - 2);
        }
    }

/*    // factorial(x)=x! pour l'exo
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
  // soit il y a une erreur, soit la formule est fausse... Dans tous les cas la boucle for n'est pas executée sans un e très grand.
    public static double T(double x, int i) {
        return Math.pow(-1, i) * (Math.pow(x, 2 * i + 1) / factorial(2 * i + 1));
    }

    public static double ex331(double x, double e) {
        double n = 0;
        for (int i = 0; Math.abs(T(x,i))<=e ;i++ ) {
            n = T(x,i-1)+T(x,i);
        }
        return n;
    }
*/
    
    public static void ex341(){
        
    }
    
    public static void main(String[] args) {
        //  ex311();
        //  ex312();
        //  System.out.println(ex321(6));
        //  System.out.println(ex331(2, 0.001));
        //  System.out.println(Math.sin(2));
    }
}
