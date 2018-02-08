package SprintJedna;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 26.9.2017.
 * User inputs radius and programme calculates circumference of a circle, summary of circle, volume of a sphere and surface of sphere
 */
public class calculatingFromRadius {
    static Scanner in = new Scanner(System.in);
    static float radius;
    public static void nacitaniePolomerov(){
        System.out.print("Please input radius: ");
        radius = in.nextFloat();
        while(radius != 0) {
            System.out.println("Circumference of circle "+ calculatingCircumference(radius)+" , summary of circle "+ calculatingSummary(radius));
            System.out.println("Surface of sphere "+ calculatingSurface(radius)+" , volume of sphere "+ calculatingVolume(radius));
            System.out.print("Please input new radius: ");
            radius = in.nextFloat();
        }
        System.exit(0);
    }

    public static double calculatingCircumference(double polomer) {
        double medzivypocet = Math.PI * 2 * polomer;
        return (double) Math.round(medzivypocet * 100) / 100;
    }

    public static double calculatingSummary(double polomer) {
        double medzivypocet = Math.PI * Math.pow(polomer, 2);
        return (double) Math.round(medzivypocet * 100) / 100;
    }

    public static double calculatingSurface(double polomer) {
        double medzivypocet = 4 * Math.PI * Math.pow(polomer, 2);
        return (double) Math.round(medzivypocet * 100) / 100;
    }
    public static double calculatingVolume(double polomer) {
        double medzivypocet = 4 / 3 * Math.PI * Math.pow(polomer, 3);
        return (double) Math.round(medzivypocet * 100) / 100;
    }

    public static void main(String[] args) {
        nacitaniePolomerov();
    }
}
