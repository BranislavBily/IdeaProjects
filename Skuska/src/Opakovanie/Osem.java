package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class Osem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prvyBod [] = new int[2];
        int druhyBod [] = new int[2];
        System.out.println("Zadajte suradnice prveho bodu : ");
        for (int i = 0; i < 2; i++) {
            prvyBod[i] = in.nextInt();
        }
        System.out.println("Zadajte suradnice druhu bodu : ");
        for (int i = 0; i < 2; i++) {
            druhyBod[i] = in.nextInt();
        }
        double a = druhyBod[0]-prvyBod[0];
        double b = druhyBod[1]-prvyBod[1];
        double AnaDruhu = Math.pow(a, 2);
        double BnaDruhu = Math.pow(b, 2);
        double CnaDruhu = Math.sqrt(AnaDruhu + BnaDruhu) * 100; //Pytagorova veta, * 100 aby som ho mohol neskor zaokruhlit
        double prepona = (double) Math.round(CnaDruhu) / 100; // dlzka prepony je odmocnena a zaokruhlena na dve desatine
        double suradnicaX = (double) (druhyBod[0] + prvyBod[0]) / 2; //dlzka X usecky
        double suradnicaY = (double) (druhyBod[1] + prvyBod[1]) / 2; //dlzka Y usecky
        System.out.println("Dlzka stredovej usecky je "+prepona+
                           "cm, suradnice stredu tejto usecky su ["+suradnicaX+";"
                            +suradnicaY+"].");

    }
}
