package SprintJedna;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 26.9.2017.
 * User inputs value of two resistors and programme calculates resistance of parralel and serial zapojenie
 */
public class calculatingResistance {
    static Scanner in = new Scanner(System.in);
    static float resistorOne;
    static float resistorTwo;

    public static float calculationOfParralel(float resistorOne, float resistorTwo) {
        float wholeParralelResistance = Math.round((resistorOne + resistorTwo) / 2 * 100) / 100;
        return wholeParralelResistance;
    }

    public static float calculationOfSerial(float resistorOne, float resistorTwo) {
        return resistorOne + resistorTwo;
    }

    public static void inputFromUser() {
        System.out.print("Please input resistance of first resistor: ");
        resistorOne = in.nextFloat();
        System.out.print("Please input resistance of second resistor: ");
        resistorTwo = in.nextFloat();
    }

    public static void main(String[] args) {
        inputFromUser();
        float parralel = calculationOfParralel(resistorOne, resistorTwo);
        float serial = calculationOfSerial(resistorOne, resistorTwo);
        System.out.println("Paralelne zapojenie ma odpor "+parralel+" , seriove "+serial);
    }
}
