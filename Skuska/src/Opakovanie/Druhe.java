package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class Druhe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadajte vstup: ");
        int vstup = in.nextInt();
        switch(vstup) {
            case 6 : System.out.print("Dobre rano."); break;
            case 12 : System.out.print("Dobry den."); break;
            case 19 : System.out.print("Dobry vecer."); break;
            default: System.out.print("Dovidenia"); break;
        }
    }
}
