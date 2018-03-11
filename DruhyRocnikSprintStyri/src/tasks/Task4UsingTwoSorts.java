package tasks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 11.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task4UsingTwoSorts {

    static char F[][] = new char[5][3];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        inputFromUser();
        outputToConsole();
        System.out.print("Please input index of array you want to sort: ");
        int indexOfQuickSort = Integer.parseInt(br.readLine());
        F[indexOfQuickSort] = Sort.quickSortChar(F[indexOfQuickSort], 0, F[indexOfQuickSort].length - 1);
        outputToConsole();
        System.out.print("Please input index of array you want to sort using merge sort: ");
        int indexOfMergeSort = Integer.parseInt(br.readLine());
        F[indexOfMergeSort] = Sort.mergeSortChar(F[indexOfMergeSort], 0, F[indexOfMergeSort].length - 1);
        outputToConsole();
    }

    public static void inputFromUser() throws IOException {
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i].length; j++) {
                System.out.print("Please input letter: ");
                F[i][j] = br.readLine().charAt(0);
            }
        }
    }

    public static void outputToConsole() {
        for (char[] letters:
             F) {
            for (char letter :
                    letters) {
                System.out.print(letter+" ");
            }
            System.out.println();
        }
    }
}
