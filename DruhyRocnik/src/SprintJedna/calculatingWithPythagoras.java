package SprintJedna;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 26.9.2017.
 * Programme calculates 10 times lenght of hypotenuse, circumference and summary from radius that user inputs
 */
public class calculatingWithPythagoras {
    static Scanner in = new Scanner(System.in);
    static double sideA, sideB, hypotenuse;
    public static void userInput() {
        System.out.print("Zadajte dlzku strany A: ");
        sideA = in.nextDouble();
        while(sideA <= 0) {
            System.out.print("Zadajte spravne cislo strany: ");
            sideA = in.nextDouble();
        }
        sideA = (double) Math.round(sideA * 100) / 100;
        System.out.print("Zadajte dlzku strany B: ");
        sideB = in.nextDouble();
        while(sideB <= 0) {
            System.out.print("Zadajte spravne cislo strany: ");
            sideB = in.nextDouble();
        }
        sideB = (double) Math.round(sideB * 100) / 100;
    }

    public static void lenghtOfHypotenuse(double sideA, double sideB) {
        hypotenuse = (double) Math.round(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)) * 100) / 100;
        System.out.println("Dlzka prepony je: "+ hypotenuse);
    }

    public static void summaryAndCircumference(double sideA, double sideB) {
        double obsah = (double) Math.round(sideA * sideB / 2 * 100) / 100;
        double obvod = sideA + sideB + hypotenuse;
        System.out.println("Obvod trojuholnika je "+obvod+" , obsah je "+obsah);

    }

    public static void main(String[] args) {
        int numberOfDoubles = 0;
        while(numberOfDoubles < 10) {
            numberOfDoubles++;
            userInput();
            lenghtOfHypotenuse(sideA, sideB);
            summaryAndCircumference(sideA, sideB);
            System.out.println("Toto je "+numberOfDoubles+" kalkulacia.");
        }
    }
}

