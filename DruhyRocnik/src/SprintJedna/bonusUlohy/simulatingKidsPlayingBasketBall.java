package SprintJedna.bonusUlohy;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Branislav Bily on 30.9.2017.
 * Kids throwing balls at rims for some reason. If kid1 gets it in and kid2 does not, kid2 is out.
 */
public class simulatingKidsPlayingBasketBall {

    public static int generateThrow() {
        double help = Math.random() * 1;
        return (int) Math.round(help);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many kids are playing the game?");
        int N = in.nextInt();
        int kids [] = new int[N], eliminatedKids = 0;
        kids[0] = generateThrow();

    }
}
