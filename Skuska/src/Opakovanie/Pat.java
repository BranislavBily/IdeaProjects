package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class Pat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prve, druhe, pocet = 0, pohar;
        System.out.println("Zadajte prve cislo : ");
        prve = in.nextInt();
        System.out.println("Zadajte druhe cislo : ");
        druhe = in.nextInt();
        if ( druhe < prve) {
            pohar = druhe;
            druhe = prve;
            prve = pohar;
        }
        while( prve <= druhe) {
            if (prve % 2 == 0) {
                System.out.println(prve);
                pocet++;
            }
            prve++;
            }
        System.out.print(pocet);
        }
}
