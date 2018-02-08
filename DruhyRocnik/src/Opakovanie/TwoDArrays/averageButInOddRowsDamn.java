package Opakovanie.TwoDArrays;


/**
 * Created by Branislav Bily on 20.9.2017.
 * Just generating numbers into 2D array A with 5 rows and 5 columns from <1, 100>, calculating average from odd rows
 * Z neznameho dovodu nezaokruhluje cisla, kto vie preco
 */
public class averageButInOddRowsDamn {
    public static int generating() {
        return (int) Math.round(Math.random() * 99 + 1);
    }
    public static void main(String[] args) {
        double A [] [] = new double[5][5];
        double averageFromEven, sumOfEven = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                A[i][j] = generating();
                if ( i % 2 == 0) {
                    System.out.print("|"+A[i][j]+"| ");
                    sumOfEven +=  A[i][j];
                } else System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        averageFromEven = (double) Math.round( sumOfEven / 15 * 100) / 100;
        System.out.println("Average number in odd rows is : " +averageFromEven);

    }
}
