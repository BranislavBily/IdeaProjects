package ineZadania;

import ulohy.Sorty;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Zadanie1Zoradovanie {
    static int[] pole = new int[30];

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            pole[i] = nacitanieCisla();
        }
        vypis();
        pole = Sorty.quickSort(pole, 0, pole.length - 1);
        System.out.println("Pole bolo zoradene.");
        vypis();
    }

    public static int nacitanieCisla(){
        double vygenerovaneCislo = Math.random() * 100;
        int cislo = (int)vygenerovaneCislo;
        return cislo;
    }

    public static void vypis() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ", pole[i * 10 + j]);
            }
            System.out.println();
        }
    }

}
