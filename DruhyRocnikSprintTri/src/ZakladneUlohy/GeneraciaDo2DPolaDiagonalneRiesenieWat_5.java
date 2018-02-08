package ZakladneUlohy;

import java.util.Arrays;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 20.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Vygenerovanie cisel a ich diagonalne zoradenie
 */
public class GeneraciaDo2DPolaDiagonalneRiesenieWat_5 {

    public static int[][] generacia() {
        int O[][] = new int[6][6];
        for (int i = 0; i < O.length; i++) {
            for (int j = 0; j < O[i].length; j++) {
                O[i][j] = (int) Math.round(Math.random() * 137 - 12);
            }
        }
        return O;
    }

    public static void zoradenie(int O[][]) {
        int diagonalne[] = new int[O.length];
        for (int i = 0; i < O.length; i++) {
            diagonalne[i] = O[i][i];
        }
        Arrays.sort(diagonalne);
        for (int i = 0; i < O.length; i++) {
            O[i][i] = diagonalne[i];
        }
        vypisanie(O);
    }

    public static void vypisanie(int O[][]) {
        System.out.println();
        for (int i = 0; i < O.length; i++) {
            for (int j = 0; j < O[i].length; j++) {
                System.out.print(O[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int O[][] = generacia();
        vypisanie(O);
        zoradenie(O);
    }
}
