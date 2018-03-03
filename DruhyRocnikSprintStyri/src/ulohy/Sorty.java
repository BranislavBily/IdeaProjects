package ulohy;



/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 08.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */

public class Sorty {

    public static int[] mergeSortOdNajmensieho(int pole[]) {
        double doublePole [] = mergeSortOdNajvacsieho(intToDouble(pole));
        doublePole = reverseArray(doublePole);
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] mergeSortOdNajmensieho(double pole[]) {
        pole = mergeSortOdNajvacsieho(pole);
        pole = reverseArray(pole);
        return pole;
    }

    public static int[] mergeSortOdNajvacsieho(int pole[]) {
        double doublePole [] = mergeSortOdNajvacsieho(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] mergeSortOdNajvacsieho(double pole[]) {
        int dlzka = pole.length;
        if(dlzka < 2) return pole;
        else {
            int stred = dlzka / 2;
            double vlavo[] = new double[stred];
            double vpravo[] = new double[dlzka - stred];
            for (int i = 0; i < stred - 1; i++) {
                vlavo[i] = pole[i];
            }
            for (int i = stred; i < dlzka - 1; i++) {
                vpravo[i - stred] = pole[i];
            }
            mergeSortOdNajvacsieho(vlavo);
            mergeSortOdNajvacsieho(vpravo);
        }
        return pole;
    }

    public static int[] quickSortOdNajmensieho(int pole[], int start, int end) {
        double doublePole [] = quickSortOdNajvacsieho(intToDouble(pole), start, end);
        doublePole = reverseArray(doublePole);
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] quickSortOdNajmensieho(double pole[], int start, int end) {
        pole = quickSortOdNajvacsieho(pole, start, end);
        pole = reverseArray(pole);
        return pole;
    }

    public static int[] quickSortOdNajvacsieho(int pole[], int start, int end) {
        double doublePole [] = quickSortOdNajvacsieho(intToDouble(pole), start, end);
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] quickSortOdNajvacsieho(double pole[], int start, int end) {
        int pIndex;
        if (start < end) {
            pIndex = partition(pole, start, end);
            quickSortOdNajvacsieho(pole, start, pIndex - 1);
            quickSortOdNajvacsieho(pole, pIndex + 1, end);
        }
        return pole;
    }

    public static int partition(double pole[], int start, int end) {
        double pivot = pole[end], temp;
        int pIndex;
        pIndex = start;
        for (int i = start; i < end; i++) {
            if (pole[i] <= pivot) {
                temp = pole[i];
                pole[i] = pole[pIndex];
                pole[pIndex] = temp;
                pIndex = pIndex + 1;
            }
        }
        temp = pole[pIndex];
        pole[pIndex] = pole[end];
        pole[end] = temp;
        return pIndex;
    }

    public static int[] insertionSortOdNajmensieho(int pole[]) {
        double doublePole [] = insertionSortOdNajvacsieho(intToDouble(pole));
        doublePole = reverseArray(doublePole);
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] insertionSortOdNajmensieho(double pole[]) {
        pole = insertionSortOdNajvacsieho(pole);
        pole = reverseArray(pole);
        return pole;
    }

    public static int[] insertionSortOdNajvacsieho(int pole[]) {
        double doublePole [] = insertionSortOdNajvacsieho(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] insertionSortOdNajvacsieho(double pole[]) {
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

    public static int[] selectionSortOdNajmensieho(int pole[]) {
        double doublePole [] = selectionSortOdNajvacsieho(intToDouble(pole));
        doublePole = reverseArray(doublePole);
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] selectionSortOdNajmensieho(double pole[]) {
        pole = selectionSortOdNajvacsieho(pole);
        pole = reverseArray(pole);
        return pole;
    }

    public static int[] selectionSortOdNajvacsieho(int pole[]) {
        double doublePole [] = selectionSortOdNajvacsieho(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] selectionSortOdNajvacsieho(double pole[]) {
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

    public static int[] bubbleSortOdNajmensieho(int pole[]) {
        double doublePole [] = bubbleSortOdNajvacsieho(intToDouble(pole));
        doublePole = reverseArray(doublePole);
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] bubbleSortOdNajmensieho(double pole[]) {
        pole = bubbleSortOdNajvacsieho(pole);
        pole = reverseArray(pole);
        return pole;
    }

    public static int[] bubbleSortOdNajvacsieho(int pole[]) {
        double doublePole [] = bubbleSortOdNajvacsieho(intToDouble(pole));
        pole = DoubleToInt(doublePole);
        return pole;
    }

    public static double[] bubbleSortOdNajvacsieho(double pole[]) {
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

    public static double[] reverseArray(double pole[]) {
        for(int i=0; i<pole.length/2; i++){
            double temp = pole[i];
            pole[i] = pole[pole.length -i -1];
            pole[pole.length -i -1] = temp;
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