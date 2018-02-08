package Opakovanie.proceduralneProgramovanie;
import java.util.Scanner;

/**
 * Created by Branislav Bily on 24.9.2017.
 */
public class premenaZDecimalnehoDoVsetkeho {
    static Scanner in = new Scanner(System.in);

    public static String dividingWork(int numberForConversion, int systemOfOutput) {
        String resultOfCalculation = "";
        resultOfCalculation =  fromDecimal(numberForConversion, systemOfOutput);
        return resultOfCalculation;
    }

    public static String allInputsFromUser() {
        String result = "";
        System.out.println("Zadajte do akej sustavy si prajete prekonvertovat cislo: ");
        int systemOfCalculatedNumber = in.nextInt();
        System.out.println("Zadajte ake cislo chcete prekonvertovat: ");
        int actualNumberToConvert = in.nextInt();
        result = dividingWork(actualNumberToConvert, systemOfCalculatedNumber);
        return result;
    }

    public static String fromDecimal(int decimal, int divisor){
        String resultFromDecimal = "";
        do {
            switch (decimal % divisor) {
                case 10 : resultFromDecimal += 'A';break;
                case 11 : resultFromDecimal += 'B';break;
                case 12 : resultFromDecimal += 'C';break;
                case 13 : resultFromDecimal += 'D';break;
                case 14 : resultFromDecimal += 'E';break;
                case 15 : resultFromDecimal += 'F';break;
                default: resultFromDecimal += decimal % divisor;
            }
            decimal = (int) Math.floor(decimal / divisor);
        } while(decimal > 0);
        resultFromDecimal = new StringBuffer(resultFromDecimal).reverse().toString();
        return resultFromDecimal;
    }

    public static void main(String[] args) {
        String finalResult =  allInputsFromUser();
        System.out.println("Vase cislo bolo prekonvertovane na: "+finalResult);
    }
}
