package Opakovanie.zadania.skolaHodina;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 22.9.2017.
 * Zadavanie polomeru kym sa nezada nula, pre kazde r vypocita obvod obsah kruznice, povrch a objem gule.
 */
public class pocitanieObjemuObvodu {
    static Scanner in = new Scanner(System.in);
    static float polomer;
    public static void nacitaniePolomerov(){
        System.out.print("Zadajte polomer: ");
        polomer = in.nextFloat();
        while(polomer != 0) {
            System.out.println("Obvod kruznice je "+vypocetObvod(polomer)+" , obsah kruznice "+vypocetObsah(polomer));
            System.out.println("Povrch gule je "+vypocetPovrch(polomer)+" , objem gule "+vypocetObjem(polomer));
            System.out.print("Zadajte novy polomer polomer: ");
            polomer = in.nextFloat();
        }
        System.exit(0);
    }
    public static double vypocetObvod(double polomer) {
        double medzivypocet = Math.PI * 2 * polomer;
        return Math.round(medzivypocet * 100) / 100;
    }
    public static double vypocetObsah(double polomer) {
        double medzivypocet = Math.PI * Math.pow(polomer, 2);
        return Math.round(medzivypocet * 100) / 100;
    }
    public static double vypocetPovrch(double polomer) {
        double medzivypocet = 4 * Math.PI * Math.pow(polomer, 2);
        return Math.round(medzivypocet * 100) / 100;
    }
    public static double vypocetObjem(double polomer) {
        double medzivypocet = 4 / 3 * Math.PI * Math.pow(polomer, 3);
        return Math.round(medzivypocet * 100) / 100;
    }
    public static void main(String[] args) {
        nacitaniePolomerov();
    }
}
