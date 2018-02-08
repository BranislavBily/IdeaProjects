package PrvyS;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 4.5.2017.
 */
public class JednaJedna {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int kladne = 0, zaporne = 0;
       if (a >= 0) {
           kladne++;
       } else {
           zaporne++;
       }
       System.out.print("Kladne " + kladne + " , zaporne " + zaporne);
    }
}
