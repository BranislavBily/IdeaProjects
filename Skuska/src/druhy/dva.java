package druhy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class dva {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String cislo = in.nextLine();
        if ( cislo.charAt(2) == '5' || cislo.charAt(2) == '6') {
            System.out.print("Zena.");
        }
        else {
            System.out.print("Muz.");
        }


    }
}
