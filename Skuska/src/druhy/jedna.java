package druhy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class jedna {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String veta = in.nextLine();
        System.out.println(veta.length());
        String odzadu = "";
        for ( int i = veta.length()-1; i >= 0; i--) {
            char pismeno = veta.charAt(i);
            odzadu += pismeno;
        }
        System.out.print(odzadu);


    }

}
