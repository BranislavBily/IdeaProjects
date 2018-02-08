package PrvyS;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 4.5.2017.
 */
public class Jedna {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int z,x,y;
        System.out.println("Zadajte x: ");
        x = in.nextInt();
        System.out.println("Zadajte y: ");
        y = in.nextInt();
        z = x + y;
        System.out.print(z);

    }
}

