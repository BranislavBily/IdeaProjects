/**
 * Created by Branislav Bily on 7.2.2017.
 */
import java.util.Scanner;


public class Dva {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String veta = in.nextLine();
        int pocet=0;
        for (int i =0 ;i <veta.length();i++) {
            char pismeno = veta.charAt(i);
            if (pismeno == 'a'){
                pocet++;
            }
        }
        System.out.println(pocet);

    }

}

