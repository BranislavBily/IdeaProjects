/**
 * Created by Branislav Bily on 7.2.2017.
 */
import java.util.Scanner;


public class Jedna {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        char prvy=in.next().charAt(0);
        char druhy=in.next().charAt(0);
        char treti=in.next().charAt(0);
        char stvrty=in.next().charAt(0);
        char piaty=in.next().charAt(0);
        String veta= "" + prvy + druhy + treti + stvrty + piaty;
        System.out.println(veta);
    }

}
