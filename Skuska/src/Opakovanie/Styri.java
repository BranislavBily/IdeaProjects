package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class Styri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pocet = 0;
        System.out.print("Zadajte char : ");
        char pismeno = in.next().charAt(0);
        if (pismeno == 'A') {
            pocet++;
        }
        while (pismeno != 'X') {
            System.out.print("Zadajte char : ");
            pismeno = in.next().charAt(0);
            if (pismeno == 'A') {
                pocet++;
            }
        }
        System.out.println("Pocet pismena A bol "+pocet);
    }
}