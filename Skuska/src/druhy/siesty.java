package druhy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class siesty  {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String veta = in.nextLine();
        String sub = "";
        int pocet = 0;
        for ( int i = 0; i < veta.length(); i += 3) {
            sub = veta.substring(pocet,i);
            pocet=i;
            System.out.println(sub);
        }


    }
}
