package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Branislav Bily on 10.3.2017.
 */
public class dva {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random = new Random();
        int [] C; C = new int[10];int pocet=0; int a = 100;
        for (int i =0; i < 10; i++) {
            C[i]=random.nextInt(200)+1;
            if ( C[i] == 100) {
                pocet++;
           }
        }
        System.out.print(pocet);

    }
}
