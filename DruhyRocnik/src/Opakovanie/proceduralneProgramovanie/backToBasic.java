package Opakovanie.proceduralneProgramovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 19.9.2017.
 * Program nacitava cisla pokial sa nezada nula, vypise najvyssiu hodnotu
 */
public class backToBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int vstup, najvacsia_hodnota;
        System.out.print("Zadajte vas vstup: ");
        vstup = in.nextInt();
        najvacsia_hodnota = vstup;
        while(vstup != 0) {
            if (vstup > najvacsia_hodnota) najvacsia_hodnota = vstup;
            System.out.print("Zadajte vas vstup: ");
            vstup = in.nextInt();
        }
        System.out.print("Program sa ukoncil, najvacsie cislo bolo "+najvacsia_hodnota);

    }
}
