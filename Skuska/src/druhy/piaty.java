package druhy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class piaty  {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String jedna = in.nextLine();
        String dva = in.nextLine();
        String tri = in.nextLine();
        String alpha = jedna+dva+tri;
        System.out.print(alpha);

    }
}
