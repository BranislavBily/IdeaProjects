package tasks;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 22.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class test {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 5, 4, 3},
                {2, 4, 2, 1, 6},
                {5, 4, 3, 2, 1},
                {8, 2, 1, 4, 6},
                {2, 5, 34, 1, 9}
        };
        for (int numbers[] :
                array) {
            for (int number :
                    numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println();

        array = insertionSortVedla(array);

        for (int numbers[] :
                array) {
            for (int number :
                    numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int[][] selectionSort(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[maxIndex][maxIndex] < array[j][j]) {
                    maxIndex = j;
                }
            }
            int tmp = array[maxIndex][maxIndex];
            array[maxIndex][maxIndex] = array[i][i];
            array[i][i] = tmp;
        }
        return array;
    }

    public static int[][] selectionSortVedlajsia(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[4 - j][j] > array[4 - maxIndex][maxIndex]) {
                    maxIndex = j;
                }
            }
            int tmp = array[4 - i][i];
            array[4 - i][i] = array[4 - maxIndex][maxIndex];
            array[4 - maxIndex][maxIndex] = tmp;
        }
        return array;
    }

    public static int[][] insertionSort(int array[][]) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int tmp = array[j][j];
            while (j > 0 && tmp > array[j - 1][j - 1]) {
                array[j][j] = array[j - 1][j - 1];
                j--;
            }
            array[j][j] = tmp;
        }
        return array;
    }

    public static int[][] insertionSortVedla(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int tmp = array[j][4 - j];
            while (j > 0 && tmp > array[j - 1][4 - j + 1]) {
                array[j][4 - j] = array[j - 1][4 - j + 1];
                j--;
            }
            array[j][4 - j] = tmp;
        }
        return array;
    }


    public static int binary(int[] array, int leftIndex, int righIndex, int value) {
        if (leftIndex == righIndex && array[leftIndex] != value) {
            return -1;
        }
        int middleIndex = leftIndex + (righIndex - leftIndex) / 2;
        if (array[middleIndex] == value) {
            return middleIndex;
        }
        if (middleIndex < value) {
            return binary(array, middleIndex + 1, righIndex, value);
        } else {
            return binary(array, leftIndex, Math.max(leftIndex, middleIndex - 1), value);
        }
    }


}
