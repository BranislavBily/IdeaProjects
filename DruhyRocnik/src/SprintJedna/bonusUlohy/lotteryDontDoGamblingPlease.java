package SprintJedna.bonusUlohy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 30.9.2017.
 * Basically its a Lotto
 */
public class lotteryDontDoGamblingPlease {
    public static int[] parseToInt(String input) {
        int gueses [] = new int [input.length() / 2 + 1];
        input = input.replace(" ", "");
        for(int i = 0; i < input.length(); i++) {
            String helper = input.substring(i, i+1);
            gueses[i] = Integer.parseInt(helper);
        }
        return gueses;
    }

    public static int[] generateWinningNumbers(int lenght){
        int lottery [] = new int[lenght];
        for(int i = 0; i < lenght; i++) {
            double helper = Math.random() * 10 ;
            lottery[i] = (int) Math.round(helper);
        }
        return lottery;
    }

    public static void checkForWinnings(int lenght, int[] gueses, int[] winingNumbers) {
        int numberOfCorrectNumbers = 0;
        for(int i = 0; i < lenght; i++) {
            if(gueses[i] == winingNumbers[i]) {
                System.out.print(" You correctly guessed number " + gueses[i]+".");
                numberOfCorrectNumbers++;
            }
        }
        System.out.println("Altogether you correctly guessed "+numberOfCorrectNumbers+" numbers.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputFromUser;
        System.out.print("Please type your guesses: ");
        inputFromUser = in.nextLine();
        int guesses [] = parseToInt(inputFromUser);
        int winningNumbers [] = generateWinningNumbers(guesses.length);
        for(int i = 0; i < guesses.length; i++) {
            System.out.print(" "+guesses[i]);
        }
        System.out.println();
        for(int i = 0; i < guesses.length; i++) {
            System.out.print(" "+winningNumbers[i]);
        }
        System.out.println();
        checkForWinnings(guesses.length, guesses, winningNumbers);
    }
}
