package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class Sedem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vstup = in.nextInt();
        while(vstup != 1) {
            if (vstup % 2 == 0) {
                vstup /= 2;
                System.out.println(vstup);
            } else {
                vstup = vstup * 3 +1;
                System.out.println(vstup);
            }
        }
    }
}
