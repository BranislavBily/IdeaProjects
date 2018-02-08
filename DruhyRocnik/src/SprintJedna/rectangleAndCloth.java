package SprintJedna;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 26.9.2017.
 * User inputs two sides of the rectangle and length of the cloth that should go around edges. Is the length of the cloth
 * enough is the question.
 */
public class rectangleAndCloth {
    static Scanner in = new Scanner(System.in);
    static float sideA,sideB,cloth;

    public static float circumferenceOfRectagle(float sideA, float sideB) {
        return (sideA + sideB) * 2;
    }

    public static void userInput() {
        System.out.print("Please input a side of the rectangle: ");
        sideA = in.nextFloat();
        System.out.print("Please input b side of the rectangle: ");
        sideB = in.nextFloat();
        System.out.print("Please input length of the cloth: ");
        cloth = in.nextFloat();
    }

    public static void main(String[] args) {
        userInput();
        float circumference = circumferenceOfRectagle(sideA, sideB);
        if(cloth == circumference) System.out.println("Well without any waste it can be done.");
        else if (cloth > circumference) System.out.println("Cloth can go around the edges.");
        else System.out.println("Im sorry but the cloth is too short.");



    }
}
