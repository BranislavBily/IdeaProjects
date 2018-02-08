package SprintJedna;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 26.9.2017.
 * Using sout we can create triangle with the size of the inputted number from user. Lets dive in
 */
public class drawingTriangle {
    public static void drawingOfTriangle(int sizeOfTriangle){
        for(int i = 1; i < sizeOfTriangle + 1; i++) {
            for(int j = 0; j < i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int userInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of the triangle: ");
        int input = in.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int inputFromUser = userInput();
        drawingOfTriangle(inputFromUser);
    }
}
