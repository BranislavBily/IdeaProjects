package Opakovanie.proceduralneProgramovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 19.9.2017.
 * Program vypocita obvod a obsah trojuholnika z nacitaneho polomeru
 */
public class obvodObsahKruznica {
    public static double vypocetObvodu(double polomer) {
        /**vlozeny parameter som prevzal ako premennu polomer, nieco ako double polomer = vstupnyPolomer
         * procedura vrati vypocitany obvod zaokruhleny na dve desatinne miesta, vraciame sa naspat do void mainu
         */
        return (double) Math.round(2 * 3.14 * polomer * 100) / 100;
    }
    public static double vypocetObsahu(double polomer) {
        // opat vstupny parameter sa pre pochopenie vola polomer ale na mene nezalezi
        return (double) Math.round(3.14 * Math.pow(polomer, 2) * 100) / 100;
    }
    public static void vypisovanieVysledkov(double vypocitanyObvod, double vypocitanyObsah) {
        //parametre obvod a obsah si ulozime do vypocitanyObvod a vypocitanyObsah, nasledne ich vypiseme na konzolu
        System.out.print("Obvod kruznice je "+vypocitanyObvod+" , obsah kruznice je "+vypocitanyObsah);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Zadajte polomer kruznice: ");
        //Do premennej vstupny polomer pouzivatel zada velkost polomeru
        double vstupnyPolomer = in.nextInt();
        //zadana velkost sa vlozi do proceduri vypocetObvodu ako parameter, vid hore
        double obvod = vypocetObvodu(vstupnyPolomer);
        // do premennej obvod sme si ulozili cislo vypocitane v procedure vypocetObvodu, dalej spravime to iste len pre obsah
        double obsah = vypocetObsahu(vstupnyPolomer);
        /**do premennej obsah sa ulozi vypocitany obsah, dalej nasleduje procedura na vypisovanie
         * procedura vypisovanieVysledkov si ziada dva parametre, nas obvod a obsah
        */
        vypisovanieVysledkov(obvod, obsah);
    }
}
