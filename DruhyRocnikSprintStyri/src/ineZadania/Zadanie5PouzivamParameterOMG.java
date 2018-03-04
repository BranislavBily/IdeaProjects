package ineZadania;

import java.awt.*;
import java.util.*;
import ulohy.Vyhladavania;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * TOTO VELMI NEFUNGUJE NEBRAL BY SOM TO VELMI AKO PRIKLAD AK NEDOKONCIS TODO
 */
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
            //TODO Binarne si vyzaduje mat zoradene pole takze to by sa oplatilo niekedy implementovat
            int found = Vyhladavania.binarySearchInt(F[i], 0, F[i].length - 1, yearnedNumber);
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
            int found = Vyhladavania.linearSeachInt(F[i], yearnedNumber);
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
