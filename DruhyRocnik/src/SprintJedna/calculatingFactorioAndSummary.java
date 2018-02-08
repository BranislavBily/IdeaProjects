package SprintJedna;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 26.9.2017.
 */
public class calculatingFactorioAndSummary {
    static Scanner in = new Scanner(System.in);
    static int userInput;

    public static int inputFromUser() {
        System.out.println("Input your number: ");
        int userInput = in.nextInt();
        return userInput;
    }

    public static int calculatingFactorio(int userInput) {
        int factorioResult = 1;
        for(int i = 1; i < userInput + 1; i++) {
            factorioResult *= i;
        }
        return  factorioResult;
    }

    public static int calculatingSummary(int userInput) {
        int summaryResult = 0;
        for(int i = userInput; i <= 0; i++) {
            summaryResult += i;
        }
        return summaryResult;
    }

    public static void main(String[] args) {
        userInput = inputFromUser();
        if (userInput >= 1){
            System.out.println("Factorio of "+userInput+" is "+calculatingFactorio(userInput));
        } else System.out.println("Summary is "+ calculatingSummary(userInput));
    }
}
