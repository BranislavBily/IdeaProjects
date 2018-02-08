package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class trinast {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Zadajte pismeno : ");
        char pismeno = in.next().charAt(0);
        if(pismeno < 65 || pismeno > 122) {
            System.out.print("Nezadal si pismeno.");
        } else if (pismeno < 91) {
            pismeno += 32;
            System.out.print(pismeno);
        } else {
            pismeno -= 32;
            System.out.print(pismeno);
        }

    }
}
