package arrays;

import java.util.Random;

/**
 * Created by Branislav Bily on 21.3.2017.
 */
public class sedem {

    public static void main(String[] args) {
        int [] d; d = new int [15];int pocet= 0;
        Random random= new Random();
        for ( int i = 0; i < d.length; i++){
            d[i]=random.nextInt(140)-20;
            if(d[i] < 21 && d[i] > - 1){
                pocet++;
            }
        }
        System.out.print(pocet);
    }
}
