package ulohy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 08.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Ziaci zadaju pocet znamok a znamky, treba zoradit ich AP
 */
public class ziaciZnamky_2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int nacitanie() throws InputMismatchException {
        try {
            return Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.print("Chyba pri nacitani.");
        }
        return 0;
    }

    public static double[][] zadanieZnamok(double[][] ziaci) {
        for (int i = 0; i < ziaci.length; i++) {
            for (int j = 0; j < ziaci[i].length; j++) {
                i++;
                j++;
                System.out.printf("Zadajte %1d znamku %2d ziaka: ", i, j);
                i--;
                j--;
                ziaci[i][j] = nacitanie();
                while (ziaci[i][j] > 5 || ziaci[i][j] < 0) {
                    System.out.print("Zadali ste nemozne cislo, skuste znova: ");
                    ziaci[i][j] = nacitanie();
                }
            }
        }
        return ziaci;
    }

    public static void vypis(double AP[]) {
        for (int i = 0; i < AP.length; i++) {
            System.out.printf("%1d ziak mal priemer %2.2f\n", i + 1, AP[i]);
        }
    }

    public static double[] vypocetAP(double[][] ziaci) {
        double sucet, pocetZnamok;
        double [] AP = new double[ziaci.length];
        for (int i = 0; i < ziaci.length; i++) {
            sucet = 0;
            pocetZnamok = ziaci[i].length;
            for (int j = 0; j < pocetZnamok; j++) {
                sucet += ziaci[i][j];
            }
            AP[i] = (double) Math.round(sucet / pocetZnamok * 100) / 100;
        }
        return AP;
    }

    public static double[][] nacitaniePoctuZnamok(double ziaci[][]) {
        for (int i = 0; i < ziaci.length; i++) {
            i++;
            System.out.printf("Nacitajte pocet znamok %1d ziaka: ", i);
            i--;
            int pocetZnamok = nacitanie();
            ziaci[i] = new double[pocetZnamok];
        }
        return ziaci;
    }

    public static void main(String[] args) {
        System.out.print("Nacitajte pocet deti: ");
        int pocetDeti = nacitanie();
        double ziaci[][] = new double[pocetDeti][];
        ziaci = nacitaniePoctuZnamok(ziaci);
        ziaci = zadanieZnamok(ziaci);
        double AP [] = vypocetAP(ziaci);
        AP = Sorty.bubbleSortOdNajmensieho(AP);
        vypis(AP);
    }
}
