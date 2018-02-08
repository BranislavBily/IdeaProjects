package arrays;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.3.2017.
 */
public class bonus3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N; int M; int [] kruh; int pocet =1; int vylucovanie=0;
        System.out.println("Zadajte pocet ludi v kruhu: ");
        N=in.nextInt();
        kruh= new int[N];
        System.out.println("Zadajte cislo vylucitela: ");
        M= in.nextInt();
        vylucovanie+=M;
        for (int i = 0; i < N; i ++) {
            kruh[i] = 0;
        }
        System.out.println("");
        while (pocet < N) {
            for (int i = 0; i < N; i++) {
                if (i+1 == vylucovanie) {
                    if (kruh[i] !=0) {
                        vylucovanie++;
                    }
                    else {
                        kruh[i] = pocet;
                    }
                }
            }
            if ( vylucovanie + M <= N) {
                vylucovanie += M;
            }
            else {
                vylucovanie= vylucovanie+M-N;
            }
            pocet++;
        }
        for (int i = 0; i < N; i++) {
            int x = i+1;
            if (kruh[i] == 0) {
                System.out.println(x+" clovek zomrel ako posledny. ");
            }
            else {
                System.out.println(x + " clovek sa zabil ako " + kruh[i] + ". ");
            }
        }

    }
}
