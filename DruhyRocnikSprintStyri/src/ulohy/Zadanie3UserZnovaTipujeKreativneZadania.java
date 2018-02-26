package ulohy;

import java.io.*;

public class Zadanie3UserZnovaTipujeKreativneZadania {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int sizeOfArray = 10;
        int InputtedNumbers[] = inputFromUser(sizeOfArray);
        output(InputtedNumbers);
        InputtedNumbers = Sorty.quicksort(InputtedNumbers, 0, InputtedNumbers.length);
        output(InputtedNumbers);
        //InputtedNumbers = reverseArray(InputtedNumbers);
        //output(InputtedNumbers);
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

    public static int[] reverseArray(int array[]) {
        int lenght = array.length;
        for (int i = 0; i < lenght / 2 ; i++) {
            int temp = array[i];
            array[i] = array[lenght - i - 1];
            array[lenght - i  - 1] = temp;
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
            int indexOfFoundNumber = Vyhladavanie.binarySearch(array, 0, array.length, inputtedNumber);
            if(indexOfFoundNumber == -1) {
                System.out.println("Your number was no found in a array.");
            } else {
                System.out.println("Your number was found in a array on the index " +indexOfFoundNumber+ ".");
            }
        }
    }
}
