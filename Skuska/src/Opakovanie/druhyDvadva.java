package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 16.5.2017.
 * druhyDva pomocou 2D array Stringu
 */
public class druhyDvadva {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Zadajte pocet vran: ");
    int vstup = in.nextInt();
    int desat = 0;
    String veci [][] = new String[][] {
            {"", "jedna", "dva", "tri", "styri", "pat", "sest", "sedem", "osem", "devat"},
            {"", "jedenast", "dvanast", "trinast", "strnast", "patnast", "sestnas", "sedemnast", "osemnast", "devatnast"},
            {"", "", "dvadsat", "tridsat", "styridsat", "patdesiat", "sestdesiat", "sedemdesiat", "osemdesiat", "devatdesiat"}
    };
        while( vstup < 1 ) {
        System.out.println("Prosim zadaj spravne cislo.");
        vstup = in.nextInt();
    }
        if (vstup == 1) {
        System.out.print("Nad kominom letela " + veci[0][0] + "vrana.");
    }
        else if ( vstup > 1 && vstup < 5) {
        System.out.print("Nad kominom leteli " + veci[0][vstup] + " vrany.");
    }
        else if (vstup < 10) {
        System.out.print("Nad kominom letelo " + veci[0][vstup] + " vran.");
    }
        else if (vstup >= 10 && vstup < 20) {
        vstup %= 10;
        System.out.print("Nad kominom letelo " + veci[1][vstup]+" vran.");
    }
        else if (vstup >= 20) {
        desat = Math.floorDiv(vstup, 10);
        vstup %= 10;
        System.out.print("Nad kominom letelo " + veci[2][desat] + " " + veci[0][vstup] + " vran.");
    }
}
}
