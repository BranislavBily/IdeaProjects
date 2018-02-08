package Opakovanie.TwoDArrays;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 20.9.2017.
 * User inputs int numbers into 2D array A which consists of 2 rows and 3 columns. Calculate average of numbers in 2 column
 */
public class inputingAndAverage {
    public static void main(String[] args) {
        int A [] [] = new int [2] [3];
        int sum = 0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                i++;j++;
                System.out.println("Please input number into "+i+". row and "+j+". column: ");
                i--;j--;
                A[i][j] = in.nextInt();
            }
        }
        for(int j = 0; j < 3; j++) {
            sum += A[1][j];
        }
        System.out.print("Average number in second column is "+sum / 3);
        System.out.println();
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

    }
}
