package Opakovanie.zadania;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Program ktory vymeni cislice od predu do
 */
public class rotaciaCislic {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Zadajte cislo do tisic ktore chcete otocit: ");
        int vstup_uzivatela = in.nextInt();
        String vstup = Integer.toString(vstup_uzivatela);
        String pomoc = "";
        for (int i = vstup.length() - 1; i >= 0; i--) {
             pomoc += vstup.charAt(i);
        }
        int cislo = Integer.parseInt(pomoc);
        System.out.print(cislo);

    }
}
