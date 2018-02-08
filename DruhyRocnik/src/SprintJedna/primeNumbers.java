package SprintJedna;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 26.9.2017.
 * User inputs number lower than 20, that number is guantity of prime numbers generated with a programme
 */
public class primeNumbers {
    static Scanner in = new Scanner(System.in);
    static int numberN;
    public static void userInput() {
        System.out.println("Please enter number of prime numbers you want us to calculate: ");
        numberN = in.nextInt();
    }

    public static void calculatingPrimeNumbers(int N) {
        int repetitions, numberInCalculation, primeNumbersAlreadyCalculated = 0, i = 0;
        while(primeNumbersAlreadyCalculated < N) {
            i++;
            repetitions=0;
            for(numberInCalculation = i; numberInCalculation > 0; numberInCalculation--) {
                if(i % numberInCalculation == 0) {
                    repetitions++;
                }
            }
            if (repetitions == 2) {
                System.out.print(i+", ");
                primeNumbersAlreadyCalculated++;
            }
        }
    }

    public static void main(String[] args) {
    userInput();
    calculatingPrimeNumbers(numberN);
    }
}
