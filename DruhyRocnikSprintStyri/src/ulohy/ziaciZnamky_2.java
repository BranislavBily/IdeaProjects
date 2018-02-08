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
            for (int j = 0; j < ziaci[i].length - 1; j++) {
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

    public static double[][] vypocetAP(double[][] ziaci) {
        double sucet, pocetZnamok;
        for (int i = 0; i < ziaci.length; i++) {
            sucet = 0;
            pocetZnamok = ziaci[i].length - 1;
            for (int j = 0; j < pocetZnamok; j++) {
                sucet += ziaci[i][j];
            }
            ziaci[i][ziaci[i].length - 1] = (double) Math.round(sucet / pocetZnamok * 100) / 100;
            System.out.println(ziaci[i][ziaci[i].length - 1]);
        }
        return ziaci;
    }

    public static void main(String[] args) {
        int skuska[] = {3, 1, 2, 5};
        skuska = Sorty.insertionSort(skuska);
        for (int cislo :
                skuska) {
            System.out.println(cislo);
        }
        System.out.print("Nacitajte pocet deti: ");
        int pocetDeti = nacitanie();
        double ziaci[][] = new double[pocetDeti][];
        for (int i = 0; i < ziaci.length; i++) {
            i++;
            System.out.printf("Nacitajte pocet znamok %1d ziaka: ", i);
            i--;
            // pridam este jeden prvok kde ulozim AP
            int pocetZnamok = nacitanie() + 1;
            ziaci[i] = new double[pocetZnamok];
        }
        ziaci = zadanieZnamok(ziaci);
        ziaci = vypocetAP(ziaci);
    }
}
