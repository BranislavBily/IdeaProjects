package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class Tri {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Zadajte pocet hviezdiciek: ");
        int pocet = in.nextInt();
        for ( int i = 0; i <= pocet; i++) {
            for(int x = 0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int i = pocet-1; i > 0; i--) {
            for(int x = 0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
