package arrays;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 10.3.2017.
 */
public class one {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a; a = new int [5];
        for (int i =0; i < 5; i++) {
            System.out.println("Zadajte hodnotu prvku: ");
            a[i] = in.nextInt();
        }
        for (int i =0; i < 5; i++) {
            System.out.println("Nazov: "+i+" , hodnota: "+a[i]);
        }



    }


}
