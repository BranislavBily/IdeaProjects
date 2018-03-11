package tasks;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Search {

    public static int binarySearchDouble(double[] array, int leftIndex, int rightIndex, double value) {
        if (leftIndex == rightIndex && array[leftIndex] != value) {
            return -1;
        }
        int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
        if (array[middleIndex] == value) {
            return middleIndex;
        } else if  (array[middleIndex] > value) {
            return binarySearchDouble(array, middleIndex + 1, rightIndex, value);
        } else return binarySearchDouble(array, leftIndex, Math.max(leftIndex, middleIndex - 1), value);
    }

    public static int binarySearchInt(int[] array, int leftIndex, int rightIndex, int value) {
        double doubleArray[] = Sort.intToDouble(array);
        return binarySearchDouble(doubleArray, leftIndex, rightIndex, (double) value);
    }

    public static int binarySearchChar(char[] array, int leftIndex, int rightIndex, char value){
        if(leftIndex == rightIndex && array[leftIndex] != value) {
            return -1;
        }
        int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
        if(array[middleIndex] == value) {
            return middleIndex;
        } else if(array[middleIndex] > value) {
            return binarySearchChar(array, middleIndex + 1, rightIndex, value);
        } else {
            return binarySearchChar(array, leftIndex, Math.max(leftIndex, middleIndex - 1), value);
        }
    }

    public static int linearSearchDouble(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int linearSearchInt(int array[], int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int linearSearchChar(char array[], char value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }


}
