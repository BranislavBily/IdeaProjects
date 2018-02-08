package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class devat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vstup = in.nextInt();
        while( vstup < 1 || vstup > 3999) {
            System.out.print("Zadali ste nespravne Rimske cislo. Zadajte znova: ");
            vstup = in.nextInt();
        }
        while (vstup >= 1000) {
            System.out.print("M");
            vstup -= 1000;
        }
        while (vstup >= 900) {
            System.out.print("CM");
            vstup -= 900;
        }
        while (vstup >= 500) {
            System.out.print("D");
            vstup -= 500;
        }
        while (vstup >= 400) {
            System.out.print("CD");
            vstup -= 400;
        }
        while (vstup >= 100) {
            System.out.print("C");
            vstup -= 100;
        }
        while (vstup >= 90) {
            System.out.print("XC");
            vstup -= 90;
        }
        while (vstup >= 50) {
            System.out.print("L");
            vstup -= 50;
        }
        while (vstup >= 40) {
            System.out.print("XL");
            vstup -= 40;
        }
        while (vstup >= 10) {
            System.out.print("X");
            vstup -= 10;
        }
        while (vstup >= 9) {
            System.out.print("IX");
            vstup -= 9;
        }
        while (vstup >= 5) {
            System.out.print("V");
            vstup -= 5;
        }
        while (vstup >= 4) {
            System.out.print("IV");
            vstup -= 4;
        }
        while (vstup >= 1) {
            System.out.print("I");
            vstup -= 1;
        }
    }

}
