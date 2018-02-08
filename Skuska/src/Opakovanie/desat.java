package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class desat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadajte cislo N : ");
        int pocet, cislo = 0;
        int N = in.nextInt();
        System.out.print("Prvocisla od 1 po "+N+" su: ");
        for (int i = 0; i <= N; i++) {
            pocet=0;
            for(cislo = i; cislo > 0; cislo--) {
                if(i % cislo==0) {
                    pocet++;
                }
            }
            if (pocet == 2) {
                System.out.print(i+", ");
            }
        }
    }
}
