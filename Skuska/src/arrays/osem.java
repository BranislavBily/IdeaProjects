package arrays;

import java.util.Random;

/**
 * Created by Branislav Bily on 21.3.2017.
 */
public class osem {

    public static void main(String[] args) {
        int [] B; B = new int[10];int max= -51;int pocet=0;
        Random random = new Random();
        for (int i = 0; i < B.length; i++){
            B[i]=random.nextInt(101)-50;
            if (B[i] > max) {
                max = B[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i <B.length; i++){
            if (B[i] == max){
                pocet++;
            }
        }
        System.out.print(pocet);


    }
}
