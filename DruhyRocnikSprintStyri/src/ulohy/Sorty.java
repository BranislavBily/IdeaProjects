package ulohy;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 08.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */

public class Sorty {

    public static double[] bubbleSort(double array[]) {
        boolean change = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    change = true;
                }
            }
            if (!change) break;
        }
        return array;
    }

    public static int[] quicksort(int[] array, int leftBorder, int rightBorder){
        if(leftBorder < rightBorder){
            int boundary = leftBorder;
            for(int i = leftBorder + 1; i < rightBorder; i++){
                if(array[i] > array[leftBorder]){
                    swap(array, i, ++boundary);
                }
            }
            swap(array, leftBorder, boundary);
            quicksort(array, leftBorder, boundary);
            quicksort(array, boundary + 1, rightBorder);
        }
        return array;
    }
    public static void swap(int[] array, int leftIndex, int rightIndex){
        int tmp = array[rightIndex];
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = tmp;
    }
}