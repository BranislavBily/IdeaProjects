package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class ZenitJedna {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int postup [] = new int [18];
        postup[0] = 0;
        postup[1] = 1;
        System.out.println("Zadajte cislo K: ");
        int K = in.nextInt();
        while ( K < 0 || K > 16) {
            System.out.println("Prosim zapis cislo z intervalu 0 < K < 16");
            K = in.nextInt();
        }
        for( int i = 2; i < K+2; i++) {
            postup[i] = postup[i-1] + postup[i-2];
        }
        for( int i = 0; i < K; i++) {
            System.out.println("Na "+(i+1)+" hodine bolo "+postup[i]+" dievcat");
        }

    }

}
