package Opakovanie.proceduralneProgramovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 19.9.2017.
 * Program nacita cislo a vypise pocet cislic mensich ako 5
 * prosim nepozeraj sa na kod je to mess proste
 */
public class pocitanieCislic {
    public static void main(String[] args){
        int pocet_cislic = 0;
        System.out.print("Zadajte cislo ktore chcete overit: ");
        Scanner in = new Scanner (System.in);
        int vstupne_cislo = in.nextInt();
        String cislice = Integer.toString(vstupne_cislo);
        for (int i = cislice.length() - 1; i >= 0; i--) {
            String pomoc = "";
            pomoc += cislice.charAt(i);
            int cislica = Integer.parseInt(pomoc);
            if ( cislica < 5) {
                //System.out.println(" v if.");
                pocet_cislic++;
            }
        }
        System.out.println("Pocet cislic mensich ako 5 bolo: "+pocet_cislic);
    }

}
