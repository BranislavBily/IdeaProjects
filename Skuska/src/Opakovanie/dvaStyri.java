package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 16.5.2017.
 */
public class dvaStyri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zadane [] = new int[6];
        int pocet = 0;
        for (int i = 0; i < 6; i++) {
            zadane[i] = in.nextInt();
            for (int x = 0; x < i; x++) {
                while (zadane[i] == zadane[x] || zadane[i] < 1 || zadane[i] > 49) {
                    System.out.print("Zadali ste zle cislo, prosim zadajte ine cislo: ");
                    zadane[i] = in.nextInt();
                    x = 0;
                }
            }
        }
        int vyherne [] = new int[6];
        for (int i = 0; i < 6; i++) {
            vyherne[i] = (int) Math.ceil(Math.random() * 49);
            for (int x = 0; x < i; x++) {
                while (vyherne[i] == vyherne[x]) {
                    vyherne[i] = (int) Math.ceil(Math.random() * 49);
                    x = 0;
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            for (int x = 0; x < 6; x++) {
                if (vyherne[x] == zadane[i]){
                    pocet++;
                    System.out.println("Trafili ste cislo "+vyherne[x]+"!");
                }
            }
        }
        switch(pocet) {
            case 6 : System.out.println("Gratulujeme vyhrali ste!");
            case 5 : System.out.println("Gratulujeme k druhej cene!");
            case 4 : System.out.println("Gratulujeme k tretej cene!");
            default: System.out.println("Bohuzial ste prehrali. Pocet trafenych cisel: "+pocet);
        }
        System.out.print("Vyherny tiket bol: ");
        for(int i = 0; i < 6; i++) {
            System.out.print(vyherne[i]+", ");
        }
    }
}
