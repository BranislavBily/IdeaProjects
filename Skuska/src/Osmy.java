/**
 * Created by Branislav Bily on 7.2.2017.
 * encryption
 */
import java.util.Scanner;


public class Osmy {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String veta = in.nextLine();
        String novy = "";
        int zozadu = veta.length();
        int a = 0, length = veta.length();

        for (int i = 0; i < length; i+=2) {
            char pismeno = veta.charAt(a);
            a++;
            novy+=pismeno;
            char druhe = veta.charAt(zozadu-1);
            novy+=druhe;
            zozadu--;
        }
        if (veta.length() % 2 != 0) {
            novy=novy.substring(0, length);
        }
        System.out.println(novy);


    }

}



