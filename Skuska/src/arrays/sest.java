package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.3.2017.
 */
public class sest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] Y; Y = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Napis slovko: ");
            Y[i]=in.nextLine();
        }
        Arrays.sort(Y);
        for (int i = 4; i >= 0; i--){
            System.out.println(Y[i]);
        }

    }
}
