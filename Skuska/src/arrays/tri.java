package arrays;

import java.util.Random;


/**
 * Created by Branislav Bily on 10.3.2017.
 */
public class tri {

    public static void main(String[] args) {
        Random random = new Random();
        int [] I;I = new int[20];int sucet=0;int pocet= 0;
        for (int i = 0; i < 20; i++) {
            I[i]=random.nextInt(140)-20;
            if ( I[i] >= -10 && I[i] <= 20) {
                sucet+=I[i];
                pocet++;
            }
        }
        System.out.println("AP= "+sucet/pocet);

    }
}
