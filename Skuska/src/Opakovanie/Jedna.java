package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 10.5.2017.
 */
public class Jedna {
    public static void main(String[] args) {
        int vstup [] = new int [3];
        Scanner in = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Zadajte cislo : ");
            vstup[i] = in.nextInt();
        }
        if (vstup[0] > vstup[1]) {
            if (vstup[1] > vstup[2]) {
                System.out.print("Stredne cislo bolo nahrane ako druhe : "+vstup[1]);
            } else if (vstup[0] > vstup[2]) {
                System.out.print("Stredne cislo bolo nahrane ako tretie : "+vstup[2]);
            } else {
                System.out.print("Stredne cislo bolo nahrane ako prve : "+vstup[0]);
            }
        } else {
            if (vstup[0] > vstup[2]) {
                System.out.print("Stredne cislo bolo nahrane ako prve : "+vstup[0]);
            } else if (vstup[1] > vstup[2]) {
                System.out.print("Strednebolo nahrane ako tretie : "+vstup[2]);
            } else {
                System.out.print("Stredne cislo bolo nahrane ako druhe : "+vstup[1]);
            }
        }


    }
}
