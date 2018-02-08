package Opakovanie.zadania.skolaHodina;

/**
 * Created by Branislav Bily on 22.9.2017.
 * Vygeneruje udaje do pola B z intervalu <-50, 50>, zistit najvacsiu hodnotu a kolko krat sa opakovala
 */
public class parKalkulaciiVPoli {
    static int B [] = new int [15];
    static int najvacsieCisloVPoli = -51, pocetNajvacsich = 1;

    public static void generaciaDoPola(int B []) {
        for(int i = 0; i < 15; i++) {
            double generacia = Math.random() * 100 - 50;
            B[i] = (int)Math.round(generacia);
        }
    }
    public static void hladanieNajvacsieho(int B[]) {
        for(int i = 0; i < 15; i++) {
            if (B[i] == najvacsieCisloVPoli) pocetNajvacsich++;
            if (B[i] > najvacsieCisloVPoli) {
                najvacsieCisloVPoli = B[i];
                pocetNajvacsich = 1;
            }
        }
    }
    public static void vypisovanie(int [] B) {
        for(int i = 0; i < 15; i++)System.out.print(B[i]+" ,");
        System.out.println();
        System.out.println("Najvacsie cislo bolo "+ najvacsieCisloVPoli +" a v poli sa nachadzalo "+ pocetNajvacsich +" krat.");
    }

    public static void main(String[] args) {
        generaciaDoPola(B);
        hladanieNajvacsieho(B);
        vypisovanie(B);


    }
}
