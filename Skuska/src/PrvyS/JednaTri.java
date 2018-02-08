package PrvyS;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 4.5.2017.
 */
public class JednaTri {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int vek = in.nextInt();
        if (vek >= 0 && vek <= 11) {
            System.out.print("Dieta");
        } else if (vek >=12 && vek <= 18) {
            System.out.print ("Mlady");
        } else if (vek >=19 && vek <= 35) {
            System.out.print ("Starsi");
        } else if (vek >=36 && vek <= 60) {
            System.out.print ("Stredny");
        } else {
            System.out.print("Stary");
        }
    }
}
