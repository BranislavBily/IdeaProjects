package Opakovanie.TwoDArrays;


/**
 * Created by Branislav Bily on 20.9.2017.
 * Programme will generate random numbers <-100; 100> to 2D array U, find out how many numbers are positive and
 * print whole 2D array
 */
public class generatingRandom {
    public static double assign() {
        return Math.round(Math.random() * 200 - 100);
    }
    public static void main(String[] args) {
        double U [] [] = new double [3] [7];
        int positiveNubmers = 0;
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 7; j++) {
                U[i][j] = assign();
                System.out.print(U[i][j]+" ");
                if (U[i][j] >= 0) positiveNubmers++;
            }
            System.out.println();
        }
        System.out.print("There were "+positiveNubmers+" positive numbers generated into 2D array U");

    }
}
