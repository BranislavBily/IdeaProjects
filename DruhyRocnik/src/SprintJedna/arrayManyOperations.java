package SprintJedna;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;


/**
 * Created by Branislav Bily on 26.9.2017.
 * User inputs 8 number in to the array, them proceeds to change indexes of two of them and THEN programme outputs average
 * number and biggest number
 */
public class arrayManyOperations {
    static int A [] = new int[8];
    static int indexOfFirstNumber, indexOfSecondNumber;

    public static void userInput() {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < A.length; i++) {
            System.out.print("Please type number you want to save into the array: ");
            A[i] = in.nextInt();
        }
    }

    public static void changingOfTwoIndexes() {
        int glass = indexOfFirstNumber;
        indexOfFirstNumber = indexOfSecondNumber;
        indexOfSecondNumber = glass;
    }

    public static double averageNumber() {
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return (double) Math.round(sum / A.length * 100) / 100;
    }

    public static int biggestNumberInArray() {
        int max = A[0];
        for(int i = 1; i < A.length; i++) {
            if(max < A[i]) max = A[i];
        }
        return max;
    }

    public static void printOfArray(double averageNumber, int biggestNumber) {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ,");
        }
        System.out.println();
        System.out.println("Average number in the array was "+averageNumber);
        System.out.println("Biggest number in the array was "+biggestNumber);
    }

    public static void main(String[] args) {
        userInput();
        changingOfTwoIndexes();
        double averageNumberFromArray = averageNumber();
        int biggest = biggestNumberInArray();
        printOfArray(averageNumberFromArray,biggest);
    }
}
