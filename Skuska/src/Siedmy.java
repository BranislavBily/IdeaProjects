/**
 * Created by Branislav Bily on 7.2.2017.
 */
import java.util.Scanner;


public class Siedmy {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String veta= in.nextLine();
        for (int i= veta.length()-1; i >=0; i--) {
            char pismeno =veta.charAt(i);
            System.out.print(pismeno);
        }


    }

}


