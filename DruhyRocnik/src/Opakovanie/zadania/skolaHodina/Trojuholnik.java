package Opakovanie.zadania.skolaHodina;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 22.9.2017.
 * 10 krat pocita obvod obsah prepona trojuholnika
 */
public class Trojuholnik {
    static Scanner in = new Scanner(System.in);
    static double stranaA, stranaB, prepona;
    public static void nacitanieUdajov() {
        System.out.print("Zadajte dlzku strany A: ");
        stranaA = in.nextDouble();
        while(stranaA <= 0) {
            System.out.print("Zadajte spravne cislo strany: ");
            stranaA = in.nextDouble();
        }
        stranaA = (double) Math.round(stranaA * 100) / 100;
        System.out.print("Zadajte dlzku strany B: ");
        stranaB = in.nextDouble();
        while(stranaB <= 0) {
            System.out.print("Zadajte spravne cislo strany: ");
            stranaB = in.nextDouble();
        }
        stranaB = (double) Math.round(stranaB * 100) / 100;
    }
    public static void dlzkaPrepony(double stranaA, double stranaB) {
        prepona = (double) Math.round(Math.sqrt(Math.pow(stranaA, 2) + Math.pow(stranaB, 2)) * 100) / 100;
        System.out.println("Dlzka prepony je: "+prepona);
    }
    public static void obsahAObvod(double stranaA, double stranaB) {
        double obsah = (double) Math.round(stranaA * stranaB / 2 * 100) / 100;
        double obvod = stranaA + stranaB + prepona;
        System.out.println("Obvod trojuholnika je "+obvod+" , obsah je "+obsah);

    }
    public static void main(String[] args) {
        int pocetDvojic = 0;
        while(pocetDvojic < 10) {
            pocetDvojic++;
            nacitanieUdajov();
            dlzkaPrepony(stranaA, stranaB);
            obsahAObvod(stranaA, stranaB);
            System.out.println("Toto je "+pocetDvojic+" kalkulacia.");
        }
    }
}
