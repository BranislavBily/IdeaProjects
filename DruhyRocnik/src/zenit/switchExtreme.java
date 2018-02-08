package zenit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Branislav Bily on 18.10.2017.
 */
public class switchExtreme {
    public static void main(String[] args) throws IOException  {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String vysledok = "";
        String jednotka [] = {"jeden","jedna", "dva", "tri", "styri", "pat", "sest", "sedem", "osem", "devat"};
        String desiatka [] = {"","dvadsat","tridsat", "styridsat", "patdesiat", "sestdesiat", "sedemdesiat", "osemdesiat", "devatdesiat", "sto" };
        int jednotky, desiatky;
        System.out.println("Zadaj cislo: ");
        int pocet = Integer.parseInt(in.readLine());
        jednotky = pocet % 10;
        desiatky = (pocet - jednotky) / 10;
        if (desiatky == 0) {
            vysledok = jednotka[jednotky];
        } else if (desiatky == 10) {
            vysledok = desiatka[desiatky - 1];
        } else if(desiatky == 1) {
            if(jednotky == 1) {
                vysledok = jednotka[jednotky - 1] + "ast";
            } else {
                vysledok = jednotka[jednotky] + "nast";
            }
        } else {
            vysledok = desiatka[desiatky - 1] + jednotka[jednotky];
        }
        System.out.println(vysledok);


    }
}
