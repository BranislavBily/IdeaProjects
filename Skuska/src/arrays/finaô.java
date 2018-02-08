package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Branislav Bily on 4.4.2017.
 */
public class finaô {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random= new Random();
        System.out.print("Zapiste pocet deti : ");
        int dlzka = in.nextInt();
        int array [] = new int [dlzka];
        int sucet = 0; int max = 1; int min = 5;
        for ( int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5)+1;
            System.out.println(array[i]);
            if (array[i] > max ) {
                max = array[i];
            } else if ( array[i] < min) {
                min = array[i];
            }
        }
        for ( int num : array) {
            sucet += num;
        }
        System.out.println("Sucet cisel je : "+sucet);
        System.out.println("Aritmeticky priemer je : "+(float)sucet/dlzka+" , najlepsia znamka bola "+min+" , najhorsia znamka bola "+max);
    }
}
