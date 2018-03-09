package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 09.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task3UsingThreeSortsAtTheSameTime {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] inicializationOfAnArray(int rows, int columns) {
        int array[][] = new int[rows][columns];
        return array;
    }

    public static int[][] generationOfNumbers(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double generatedNumbers = Math.random() * 120 - 20;
                array[i][j] = (int) generatedNumbers;
            }
        }
        return array;
    }

    public static int input() {
        try {
            int row = Integer.parseInt(br.readLine());
            return row;
        } catch (IOException e) {
            System.out.print("Error occured");
        }
        return 0;
    }

    public static void outputOfArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-4d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] calculationOfMainDiagonal(int array[][]) {
        int diagonal [] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            diagonal[i] = array[i][i];
        }
        diagonal = Sort.insertionSort(diagonal);
        array = insertDiagonalBackToTheArray(array, diagonal);
        return array;
    }

    public static int[][] insertDiagonalBackToTheArray(int array[][], int diagonal[]) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = diagonal[i];
        }
        return array;
    }

    public static int [][] calculationOfMinorDiagonal(int array[][]) {
        int diagonals [] = new int[array.length];
        int index = 0;
        int j = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            diagonals[index]= array[j][i];
            j++;
            index++;
        }
        diagonals = Sort.selectionSort(diagonals);
        array = insertMinorDiagonalBackToTheArray(array, diagonals);
        return array;
    }

    public static int[][] insertMinorDiagonalBackToTheArray(int array[][], int diagonals[]) {
        int index = 0;
        int j = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            array[j][i] = diagonals[index];
            j++;
            index++;
        }
        return array;
    }


    public static void main(String[] args) {
        int B[][] = inicializationOfAnArray(5, 5);
        B = generationOfNumbers(B);
        outputOfArray(B);
        System.out.print("Insert row you want to sort using bubbleSort: ");
        int row = input();
        B[row] = Sort.bubbleSortAscendingInt(B[row]);
        outputOfArray(B);
        System.out.print("Insert row you want to sort using insertionSort: ");
        row = input();
        B[row] = Sort.inertionSortAscending(B[row]);
        outputOfArray(B);
        B = calculationOfMainDiagonal(B);
        outputOfArray(B);
        System.out.println("Main diagonal changed.");
        B = calculationOfMinorDiagonal(B);
        outputOfArray(B);
        System.out.println("Minor diagonal changed.");

    }
}