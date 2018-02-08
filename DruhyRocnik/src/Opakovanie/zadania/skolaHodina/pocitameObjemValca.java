package Opakovanie.zadania.skolaHodina;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 22.9.2017.
 * Myslim ze self explanatory
 */
public class pocitameObjemValca {
    static float vyskaValca, polomerValca;
    static Scanner in = new Scanner(System.in);
    public static double pocitamObjem(double vyskaValca, double polomerValca) {
        double medzivypocet =  Math.PI * Math.pow(polomerValca, 2) * vyskaValca;
        return (double) Math.round(medzivypocet * 100) / 100;
    }
    public static void zadavanieUdajov() {
        System.out.print("Zadajte vysku valca: ");
        vyskaValca = in.nextFloat();
        if(vyskaValca < 0) {
            System.out.println("Vypocet ukonceny.");
            System.exit(0);
        }
        System.out.print("Zadajte polomer valca: ");
        polomerValca = in.nextFloat();
        if(polomerValca < 0) {
            System.out.println("Vypocet ukonceny.");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        zadavanieUdajov();
        double vysledok = pocitamObjem(vyskaValca, polomerValca);
        System.out.println(vysledok);

    }
}
