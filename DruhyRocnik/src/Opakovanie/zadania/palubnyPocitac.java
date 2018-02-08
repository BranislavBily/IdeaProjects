package Opakovanie.zadania;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Program na simulaciu pocitacoveho pocitaca, zadanie vzdialenosti a casu, vypocitanie priemernej rychlosti
 */
public class palubnyPocitac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Zadajte vzdialenost ktoru preslo auto v kilometroch: ");
        double vzdialenost = in.nextDouble();
        System.out.print("Zadajte cas za ktory auto preslo spominanu vzdialenost v hodinach: ");
        double cas = in.nextDouble();
        double priemernaRychlost = vzdialenost / cas;
        System.out.print("Auto malo priemernu rychlost "+priemernaRychlost+" km/h.");

    }
}
