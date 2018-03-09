package tasks;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 08.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */

public class Sort {

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

    public static int[] bubbleSort(int array[]) {
        double doubleArray[] = intToDouble(array);
        doubleArray = bubbleSort(doubleArray);
        array = doubleToInt(doubleArray);
        return array;
    }

    public static int[] bubbleSortAscendingInt(int array[]) {
        array = bubbleSort(array);
        double doubleArray[] = intToDouble(array);
        doubleArray = reverseArray(doubleArray);
        array = doubleToInt(doubleArray);
        return array;
    }

    public static double[] bubbleSortAscending(double array[]) {
        array = bubbleSort(array);
        return reverseArray(array);
    }

    public static int[] quickSort(int[] array, int leftBorder, int rightBorder){
        if(leftBorder < rightBorder){
            int boundary = leftBorder;
            for(int i = leftBorder + 1; i < rightBorder; i++){
                if(array[i] > array[leftBorder]){
                    swap(array, i, ++boundary);
                }
            }
            swap(array, leftBorder, boundary);
            quickSort(array, leftBorder, boundary);
            quickSort(array, boundary + 1, rightBorder);
        }
        return array;
    }

    public static double[] quickSortDouble(double[] array, int leftBorder, int rightBorder){
        if(leftBorder < rightBorder){
            int boundary = leftBorder;
            for(int i = leftBorder + 1; i < rightBorder; i++){
                if(array[i] > array[leftBorder]){
                    swapDouble(array, i, ++boundary);
                }
            }
            swapDouble(array, leftBorder, boundary);
            quickSortDouble(array, leftBorder, boundary);
            quickSortDouble(array, boundary + 1, rightBorder);
        }
        return array;
    }

    public static void swap(int[] array, int leftIndex, int rightIndex){
        int tmp = array[rightIndex];
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = tmp;
    }

    public static void swapDouble(double[] array, int leftIndex, int rightIndex){
        double tmp = array[rightIndex];
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = tmp;
    }

    public static int[] insertionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int tmp = array[j];
            while (j > 0 && tmp > array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = tmp;
        }
        return array;
    }

    public static int[] inertionSortAscending(int array[]) {
        array = insertionSort(array);
        double doubleArray[] = intToDouble(array);
        doubleArray = reverseArray(doubleArray);
        array = doubleToInt(doubleArray);
        return array;
    }

    public static int[] selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) maxIndex = j;
            }
            int tmp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = tmp;
        }
        return array;
    }

    public static int[] doubleToInt(double array[]) {
        int intArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = (int) array[i];
        }
        return intArray;
    }

    public static double[] intToDouble(int array[]) {
        double doubleArray[] = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = (double) array[i];
        }
        return doubleArray;
    }

    public static double[] reverseArray(double array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

}