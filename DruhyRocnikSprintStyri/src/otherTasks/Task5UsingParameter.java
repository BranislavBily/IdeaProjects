package otherTasks;

import java.awt.*;
import java.util.*;
import tasks.Search;
import tasks.Sort;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task5UsingParameter {

    public static void main(String[] args) {
        int[][] F = generatingIntoArray();
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i].length; j++) {
                System.out.print(F[i][j]+" ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        Point indexLineary = findElementLineary(F, number);
        Point indexBinary = findElementBinary(F, number);

        output(indexBinary, indexLineary);
    }

    public static int[][] generatingIntoArray() {
        int F[][] = new int[5][4];
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i].length; j++) {
                double generatedNumber = Math.random() * 200 - 100;
                F[i][j] = (int) generatedNumber;
            }
        }
        return F;
    }

    public static Point findElementBinary (int[][] F, int yearnedNumber) {
        Point indexes = new Point();
        for (int i = 0; i < F.length; i++) {
            int sortedArray[] = new int[4];
            for (int j = 0; j < F[i].length; j++) {
                sortedArray[j] = F[i][j];
            }
            sortedArray = Sort.quickSort(sortedArray, 0, sortedArray.length );
            int indexInSortedArray = Search.binarySearchInt
                                     (sortedArray, 0, sortedArray.length -1, yearnedNumber);
            if(indexInSortedArray != -1) {
                int locationInUnsortedArray = Search.linearSearchInt(F[i], sortedArray[indexInSortedArray]);
                indexes.setLocation(i, locationInUnsortedArray);
                return indexes;
            }
        }
        return null;
    }

    public static Point findElementLineary(int[][] F, int yearnedNumber) {
        Point index = new Point();
        for (int i = 0; i < F.length; i++) {
            int found = Search.linearSearchInt(F[i], yearnedNumber);
            if(found != -1) {
                index.setLocation(i, found);
                return index;
            }
        }
        return null;
    }

    public static void output(Point binary, Point lineary) {
        if(binary != null) {
            System.out.println("Number was found by BinarySearch in matrix on position ["+binary.x+";"+binary.y+"].");
        } else {
            System.out.println("Number was not found by Binary Search.");
        }

        if(lineary != null) {
            System.out.println("Number was found by Linear Search in matrix on position ["+lineary.x+";"+lineary.y+"].");
        } else {
            System.out.println("Number was not found by Linear Search.");
        }
    }
}
