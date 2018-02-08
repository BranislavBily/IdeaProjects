package ulohy;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 08.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */

public class Sorty {

    public static int[] mergeSort(int pole[]) {
        double doublePole [] = mergeSort(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] mergeSort(double pole[]) {
        return pole;
    }

    public static int[] quickSort(int pole[]) {
        double doublePole [] = quickSort(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] quickSort(double pole[]) {

        return pole;
    }

    public static int[] insertionSort(int pole[]) {
        double doublePole [] = insertionSort(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] insertionSort(double pole[]) {
        for (int i = 0; i < pole.length - 1; i++) {
            int j = i + 1;
            double tmp = pole[j];
            while(j > 0 && tmp > pole[j - 1]) {
                pole[j] = pole[j - 1];
                j--;
            }
            pole[j] = tmp;
        }
        return pole;
    }

    public static int[] selectionSort(int pole[]) {
        double doublePole [] = selectionSort(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] selectionSort(double pole[]) {
        for (int i = 0; i < pole.length - 1; i++) {
            int indexMaxCisla = i;
            for (int j = i + 1; j < pole.length; j++) {
                if( pole[j] > pole[indexMaxCisla]) indexMaxCisla = j;
            }
            double tmp = pole[i];
            pole[i] = pole[indexMaxCisla];
            pole[indexMaxCisla] = tmp;
        }
        return pole;
    }

    public static int[] bubbleSort(int pole[]) {
        double doublePole [] = bubbleSort(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

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

    private static int[] DoubleToInt(double pole[]) {
        int intPole [] = new int[pole.length];
        for (int i = 0; i < pole.length; i++) {
            intPole[i] = (int) pole[i];
        }
        return intPole;
    }

    private static double[] intToDouble(int intPole[]) {
        double doublePole [] = new double[intPole.length];
        for (int i = 0; i < intPole.length; i++) {
            doublePole[i] = intPole[i];
        }
        return doublePole;
    }
}