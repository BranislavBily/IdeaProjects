package Opakovanie.zadania;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Vlastne to iste co predchadzajuce len nehladam sucet ale najdlhsiu stuzku.
 */
public class stuzkaASkolkaLenNajdlhsie {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int modra = 0, cervena = 0, biela = 0, dlzka;
        System.out.print("Zadajte pocet deti: ");
        int deti = in.nextInt();
        for (int i = 0; i < deti; i++) {
            System.out.print("Zadajte farbu stuzky: ");
            char vstup = in.next().charAt(0);
            switch(vstup) {
                case 'b' : System.out.print("Zadajte dlzku stuzky v centimetroch: ");
                    dlzka = in.nextInt();
                    if (dlzka > biela) biela = dlzka; break;
                case 'm' : System.out.print("Zadajte dlzku stuzky v centimetroch: ");
                    dlzka = in.nextInt();
                    if (dlzka > modra) modra = dlzka; break;
                case 'c' : System.out.print("Zadajte dlzku stuzky v centimetroch: ");
                    dlzka = in.nextInt();
                    if (dlzka > cervena) cervena = dlzka; break;
                default: System.out.println("Tuto farbu si deti do skolky brat nemali ste zly rodic.");
            }
        }
        System.out.print("Najdlhsia biela stuzka mala "+biela+" cm, modra stuzka "+modra+" cm a cervena stuzka "+cervena+" centimetrov.");
    }
}
