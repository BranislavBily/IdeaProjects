package PrvyS;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 4.5.2017.
 */
public class Treti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,sucet,AP;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        sucet = a + b + c;
        AP = sucet / 3;
        System.out.print(AP);
    }
}
