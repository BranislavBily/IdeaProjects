package Opakovanie.zadania.skolaHodina;

/**
 * Created by Branislav Bily on 22.9.2017.
 * Hladanie kolko cisel je z intervalu <0, 20>
 */
public class hladanieZIntervalu {
    static int B [] = new int [20];
    static int pocetZIntervalu = 1;

    public static void generaciaDoPola(int B []) {
        for(int i = 0; i < 20; i++) {
            double generacia = Math.random() * 140 - 20;
            B[i] = (int)Math.round(generacia);
        }
    }
    public static void hladanieNajvacsieho(int B[]) {
        for(int i = 0; i < 20; i++) {
            if (B[i] >= 0 && B[i] <= 20 ) {
                pocetZIntervalu++;
            }
        }
    }
    public static void vypisovanie(int [] B) {
        for(int i = 0; i < 20; i++)System.out.print(B[i]+" ");
        System.out.println();
        System.out.println("Pocet cisel z intervalu <0, 20> je: "+pocetZIntervalu);
    }

    public static void main(String[] args) {
        generaciaDoPola(B);
        hladanieNajvacsieho(B);
        vypisovanie(B);
    }
}
