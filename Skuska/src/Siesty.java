/**
 * Created by Branislav Bily on 7.2.2017.
 */
import java.util.Scanner;


public class Siesty {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String veta= in.nextLine();
        String trim = veta.trim();
        if (trim.isEmpty()) {
            System.out.println("Empty");
        }
        else {
            System.out.println(trim.split("\\s+").length-1);
        }
    }

}

