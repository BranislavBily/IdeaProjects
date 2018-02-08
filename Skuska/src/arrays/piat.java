package arrays;

import java.util.Random;

/**
 * Created by Branislav Bily on 21.3.2017.
 */
public class piat {

    public static void main(String[] args) {
        Random random = new Random();
        float [] X; X = new float[10];
        float najmensie=10;
        for(int i = 0; i < X.length; i++){
            X[i]=random.nextFloat()*(10)+1;
            System.out.print(X[i]+"  ");
            if(X[i]<najmensie){
                najmensie=X[i];
            }
        }
        System.out.println();
        System.out.print(najmensie);


    }
}
