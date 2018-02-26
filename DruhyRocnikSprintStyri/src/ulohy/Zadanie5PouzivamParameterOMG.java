package ulohy;

import java.awt.*;
import java.util.Scanner;

public class Zadanie5PouzivamParameterOMG {
    static int F[][] = new int[5][4];

    public static void main(String[] args) {
        generatingIntoArray();
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i].length; j++) {
                System.out.print(F[i][j]+" ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        Point indexBinary = findElementBinary(number);
        Point indexLineary = findElementLineary(number);

        output(indexBinary, indexLineary);
    }

    public static void generatingIntoArray() {
        for (int i = 0; i < F.length; i++) {
            for (int j = 0; j < F[i].length; j++) {
                double generatedNumber = Math.random() * 200 - 100;
                F[i][j] = (int) generatedNumber;
            }
        }
    }

    public static Point findElementBinary (int yearnedNumber) {
        Point index = new Point();
        for (int i = 0; i < F.length; i++) {
            int found = Vyhladavanie.binarySearch(F[i], 0, F[i].length - 1, yearnedNumber);
            if(found != -1) {
                index.setLocation(i, found);
                return index;
            }
        }
        return null;
    }
    public static Point findElementLineary(int yearnedNumber) {
        Point index = new Point();
        for (int i = 0; i < F.length; i++) {
            int found = Vyhladavanie.linearSearch(F[i], yearnedNumber);
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
