package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 16.5.2017.
 */
public class druhydva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Zadajte pocet vran: ");
        int vstup = in.nextInt();
        int desat = 0;
        String jednotky [] = {"", "jedna","dva", "tri", "styri", "pat", "sest", "sedem", "osem", "devat"};
        String trapne [] = {"", "jedenast", "dvanast", "trinast", "strnast", "patnast", "sestnas", "sedemnast", "osemnast", "devatnast"};
        String desiatky [] = {"", "", "dvadsat", "tridsat", "styridsat", "patdesiat", "sestdesiat", "sedemdesiat", "osemdesiat", "devatdesiat"};
        while( vstup < 1 ) {
            System.out.println("Prosim zadaj spravne cislo.");
            vstup = in.nextInt();
        }
        if (vstup == 1) {
            System.out.print("Nad kominom letela " + jednotky[0] + " vrana.");
        }
        else if ( vstup > 1 && vstup < 5) {
            System.out.print("Nad kominom leteli " + jednotky[vstup] + " vrany.");
        }
        else if (vstup < 10) {
            System.out.print("Nad kominom letelo " + jednotky[vstup] + " vran.");
        }
        else if (vstup >= 10 && vstup < 20) {
            vstup %= 10;
            System.out.print("Nad kominom letelo " + trapne[vstup]+" vran.");
        }
        else if (vstup >= 20) {
            desat = Math.floorDiv(vstup, 10);
            vstup %= 10;
            System.out.print("Nad kominom letelo " + desiatky[desat] + " " + jednotky[vstup] + " vran.");
        }
    }
}
