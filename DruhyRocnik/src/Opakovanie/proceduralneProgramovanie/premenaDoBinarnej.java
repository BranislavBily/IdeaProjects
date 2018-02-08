package Opakovanie.proceduralneProgramovanie;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Branislav Bily on 19.9.2017.
 * Converting of inputted decimal number into binary
 */
public class premenaDoBinarnej {

    /**
     * This method converts <code>long</code> in decimal to binary
     * @param inputInDecimal number in decimal
     * @return converted number in <code>String</code>
     */
    private static String conversionToBinary(long inputInDecimal) {
        //checks how many octets will be needed to be outputted
        int numberOfDecimals;
        if (inputInDecimal > 255) numberOfDecimals = 15; else numberOfDecimals = 7;
        //return Integer.toBinaryString(decimal);
        String convertedToBinary = "";
        do{
            long resultOfPower = (long) Math.pow(2, numberOfDecimals);
            //if input is greater or equals to resultOfThePower, its subtracts the result and add 1 to the String
            if (inputInDecimal >= resultOfPower) {
                inputInDecimal -= resultOfPower;
                convertedToBinary += 1;
            } else {
                //if its not then it adds 0 to the String
                convertedToBinary += 0;
            }
            // separates the String into octets for easier readability
            if (numberOfDecimals % 8 == 0) convertedToBinary += " ";
            //subtracts one so the programme can continue by checking lower numbers
            numberOfDecimals--;
        } while (numberOfDecimals != -1);
        return convertedToBinary;
    }

    private static long getDecimalFromUser() {
        Long inputFromUser = Long.MAX_VALUE;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Please input decimal number: ");
            try {
                inputFromUser = in.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("Input was wrong!");
                in.nextLine();
                continue;
            }

            //input from user is checked and the programme will not continue until user inputs number lower than 2^16
            if (inputFromUser > Math.pow(2, 16)) {
                System.out.print("Please input number lower than 2^16: ");
            }
        } while(inputFromUser > Math.pow(2, 16));
        return inputFromUser;
    }

    public static void main (String[] args) {
        System.out.println(conversionToBinary(getDecimalFromUser()));
    }
}
