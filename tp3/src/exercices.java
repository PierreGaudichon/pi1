
import es.*;
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

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // sum to i
    public static double Ttoi(double x, int i) {
        double t = 0;
        for (int n = 0; n <= i; n++) {
            t = Ttoi(x, i - 1) + Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return t;
    }

    // at i
    public static double Tati(double x, int i) {
        double t = 0;
        for (int n = 0; n <= i; n++) {
            t = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return t;
    }

    public static double ex331(double x, double e) {
        double t = 0;
        int i = 0;

        do {
            t = Ttoi(x, i - 1) + Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        } while (Math.abs(Tati(x, i)) <= e);

        return t;

    }

    public static void main(String[] args) {
        //  ex311();
        //  ex312();
        //System.out.println(ex321(6));
        System.out.println(Ttoi(2, 8));
        System.out.println(ex331(2, 0.001));
    }
}
