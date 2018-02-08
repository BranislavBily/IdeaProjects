package ulohy;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 08.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */

public class Sorty {



    public static double[] bubbleSort(double pole[]) {
        boolean zmena = false;
        for (int i = 0; i < pole.length - 1; i++) {
            for (int j = 0; j < pole.length - i - 1; j++) {
                if (pole[j] < pole[j + 1]) {
                    double tmp = pole[j];
                    pole[j] = pole[j + 1];
                    pole[j + 1] = tmp;
                    zmena = true;
                }
            }
            if (!zmena) break;
        }
        return pole;
    }
}