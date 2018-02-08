package Opakovanie.zadania.skolaHodina;

/**
 * Created by Branislav Bily on 22.9.2017.
 * Vygenerovanie z <0, 120> aritmeticky priemer cisel z intervalu <0, 20>
 */
public class achVlastneToIste {
    static int B [] = new int [20];
    static int pocetZIntervalu = 1, sucet = 0;
    static double priemer;

    public static void generaciaDoPola(int B []) {
        for(int i = 0; i < 20; i++) {
            double generacia = Math.random() * 120;
            B[i] = (int)Math.round(generacia);
        }
    }
    public static void hladanieNajvacsieho(int B[]) {
        for(int i = 0; i < 20; i++) {
            if (B[i] >= 0 && B[i] <= 20 ) {
                sucet += B[i];
                pocetZIntervalu++;
            }

        }
        priemer = Math.round(sucet / pocetZIntervalu * 100) / 100;
    }
    public static void vypisovanie(int [] B) {
        for(int i = 0; i < 20; i++)System.out.print(B[i]+" ");
        System.out.println();
        System.out.println("Aritmeticky priemer cisel z intervalu <0, 20> je: "+priemer);
    }

    public static void main(String[] args) {
        generaciaDoPola(B);
        hladanieNajvacsieho(B);
        vypisovanie(B);
    }
}
