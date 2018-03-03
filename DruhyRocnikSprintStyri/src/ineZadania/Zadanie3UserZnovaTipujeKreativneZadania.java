package ineZadania;

import java.io.*;
import ulohy.Sorty;
import ulohy.Vyhladavania;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Zadanie3UserZnovaTipujeKreativneZadania {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int sizeOfArray = 10;
        int InputtedNumbers[] = inputFromUser(sizeOfArray);
        output(InputtedNumbers);
        InputtedNumbers = Sorty.quickSortOdNajmensieho(InputtedNumbers, 0, InputtedNumbers.length - 1);
        output(InputtedNumbers);
        userPlaysFunGameNow(InputtedNumbers);
    }

    public static int[] inputFromUser(int size) throws IOException {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input your number: ");
            while ((array[i] = Integer.parseInt(br.readLine())) < 0) {
                System.out.print("Your input was incorrect, try again: ");
            }
        }
        return array;
    }

    public static void output(int array[]) {
        for (int number :
                array) {
            System.out.printf("%2d ", number);
        }
        System.out.println();
    }

    public static void userPlaysFunGameNow(int array[]) throws IOException {
        int inputtedNumber;
        while((inputtedNumber = Integer.parseInt(br.readLine())) > 0) {
            int indexOfFoundNumber = Vyhladavania.binarySearch(array, 0, array.length - 1, inputtedNumber );
            if(indexOfFoundNumber == -1) {
                System.out.println("Your number was no found in a array.");
            } else {
                System.out.println("Your number was found in a array on the index " +indexOfFoundNumber+ ".");
            }
        }
    }
}
