package druhy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class jedenast  {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String retazec = in.nextLine();
        String podretazec = in.nextLine();
        if ( retazec.contains(podretazec)) {
            System.out.print("Nachadza sa.");
        }
        else {
            System.out.print("Nope.");
        }
    }
}
