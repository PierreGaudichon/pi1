/*
 * 
 */

import es.*;

/**
 *
 * @author iluso & brandouille
 */
public class exercices {

    public static int sommeChiffres(int n) {
        int toto = 0;
        while (n > 0) {
            toto += n % 10;
            n /= 10;
        }
        return toto;
    }

    public static double xk(double xk, double yk, double a, double b) {
        return Math.pow(xk, 2) - Math.pow(yk, 2) + a;
    }

    public static double yk(double xk, double yk, double a, double b) {
        return 2 * xk * yk + b;
    }

    public static double module(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        //return Math.sqrt(x+y);
    }

    public static double vitesseDiv(double a, double b) {
        double y = 0, x = 0, tx, ty, mo;
        for(int i = 1; i<=30; i++){
            tx = x; ty = y;
            x = xk(tx,ty,a,b);
            y = yk(tx,ty,a,b);
            mo = module(x, y);
            System.out.println("x : "+x+", y : "+y+", mod : "+mo);
            if(mo > 2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        //exo41
        //System.out.println("exo41 : sommeChiffres(1) = " + sommeChiffres(1) + ", sommeChiffres(99) = " + sommeChiffres(99) + ", sommeChiffres(2134876) = " + sommeChiffres(2134876) + ", sommeChiffres(9001001) = " + sommeChiffres(9001001));
        //System.out.println(vitesseDiv(0.1, 0.1));
    }
}
