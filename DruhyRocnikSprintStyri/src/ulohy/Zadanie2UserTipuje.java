import java.io.*;

public class Zadanie2UserTipuje {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int array[] = new int[25];

    public static void main(String[] args) throws IOException {
        generatintToArray();
        quesses(3);
    }

    public static void generatintToArray() {
        for (int i = 0; i < array.length; i++) {
            double generatedNumber = Math.random() * 100 - 50;
            array[i] = (int) generatedNumber;
        }
    }

    public static void printOfArray() {
        for (int number :
                array) {
            System.out.printf("%1d ", number);
        }
    }

    public static boolean checkingHisQuess() throws IOException {
        System.out.print("\nInput your guess: ");
        int guess = Integer.parseInt(br.readLine());
        int index = Vyhladavanie.binarySearch(array, 0, array.length, guess);
        if( index == -1 ) {
            System.out.printf("Your guess %2d was not found in a array. \n", guess);
            return false;
        }
        else {
            System.out.println("Your guess was found among the generated numbers.");
            return true;
        }
    }

    public static void quesses(int numberOfQuesses) throws IOException {
        boolean atLeastOneGuess = false;
        for (int i = 0; i < numberOfQuesses; i++) {
            atLeastOneGuess = checkingHisQuess();
        }
        if(!atLeastOneGuess) {
            printOfArray();
            atLeastOneGuess = checkingHisQuess();
        }
        if(!atLeastOneGuess) System.out.println("\nHow can you be this stupid.");
    }

}
