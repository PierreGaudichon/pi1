
import es.*;
import static java.lang.Math.pow;

public class exercices {

    public static void ex311() {
        for (int i = 1; i <= 20; i++) {
            Ecriture.unEntier(i * i);
            Ecriture.nouvelleLigne();
        }
    }

    public static void ex312() {
        for (int i = 0; i < 100; i++) {
            if(pow(i, 3) - 18 * pow(i, 2) + 5 * i - 1 >= 0){
                Ecriture.unEntier(i);
                Ecriture.nouvelleLigne();
            }
        }
    }

    public static long ex321(int n){
        if (n <= 1) return n;
        else return ex321(n-1) + ex321(n-2);
    }
    
    public static long ex331(long x, long e){
        return 0;
        
    }
    
    public static void main(String[] args) {
        //  ex311();
        //  ex312();
        //System.out.println(ex321(6));
        ex331(6,2);
    }
}
