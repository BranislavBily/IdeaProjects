package PrvyS;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 4.5.2017.
 */
public class JednDva {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int nosnost = in.nextInt();
        int naklad = in.nextInt();
        int jazdy = 0;
        while (naklad > 0){
            jazdy++;
            naklad -= nosnost;
            System.out.println(naklad);
        }
        System.out.print (jazdy);
    }
}
