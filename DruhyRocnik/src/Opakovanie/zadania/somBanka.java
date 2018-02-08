package Opakovanie.zadania;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Program na vypocet dlzky splacovania pozicky pri zadani vysky pozicky, vysky mesacnej splatky a uroku
 */
public class somBanka {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Zadajte vysku pozicky: ");
        double pozicka = in.nextDouble();
        System.out.print("Zadajte vysku mesacnej splatky: ");
        double splatka = in.nextDouble();
        System.out.print("Zadajte urok na splatke: ");
        double urok = in.nextDouble();
        pozicka *= urok;
        int mesiace = 0;
        while (pozicka >= splatka) {
            pozicka -= splatka;
            mesiace++;
        }
        double roky = Math.ceil(mesiace / 12);
        mesiace -= roky * 12;
        System.out.print("Splatka sa bude splacovat "+roky+" rokov a "+ mesiace+" mesiacov. ");


    }
}
