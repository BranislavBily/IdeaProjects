package Opakovanie.TwoDArrays;


/**
 * Created by Branislav Bily on 20.9.2017.
 * Like same thing again but this time Im looking for numbers in interval <-50, 50> and this time from EVEN rows
 */
public class almostSameThingAgain {
    public static int generating() {
        return (int) Math.round(Math.random() * 200 - 100);
    }
    public static void main(String[] args) {
        int numberOfThoseNumbers = 0;
        double A [] [] = new double[5][5], sumOfNumbers = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                A[i][j] = generating();
                if ( i % 2 != 0 && A[i][j] >= -50 && A[i][j] <= 50 ) {
                    System.out.print("|"+A[i][j]+"| ");
                    sumOfNumbers += A[i][j];
                    numberOfThoseNumbers++;
                } else System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        double result = (double) Math.round(sumOfNumbers / numberOfThoseNumbers * 100) / 100;
        System.out.println("Average of numbers from even rows and these ones that are in interval <-50, 50> is : "+result);
    }
}
