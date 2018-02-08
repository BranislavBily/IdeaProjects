package Opakovanie.zadania;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Program na vypocitanie poctu ciest vytahom pri nosnosti 150kg a troch ludoch z ktorych ani jeden nemoze vazit viac ako nosnost
 */
public class vytahDilema {
    public static void main(String[] args) {
        int nosnost = 150;
        Scanner in = new Scanner (System.in);
        double ludia [] = new double [3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Zadajte vahu cloveka: ");
            ludia[i] = in.nextDouble();
            if (ludia[i] > nosnost) {
                System.out.print("Clovek je prilis tazky, odvedte ho a donesne lahsiu osobu: ");
                ludia[i] = in.nextDouble();
            }
        }
        if ( ludia[0] + ludia[1] + ludia[2] <= 150) {
            System.out.print("Vytah ide iba jednu cestu.");
        } else if (ludia[0] + ludia[1] <= 150 || ludia[1] + ludia[2] <= 150 ) {
            System.out.print("Vytah pojde dva krat.");
        } else {
            System.out.print("Vytah pojde tri krat.");
        }

    }
}
