package druhy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class dvanast  {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String veta = in.nextLine();
        String pali = "";
        for ( int i = veta.length()-1; i >= 0; i --) {
            char pismeno = veta.charAt(i);
            pali +=pismeno;
        }
        System.out.print(pali);
    }
}
