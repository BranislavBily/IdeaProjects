package SprintJedna.bonusUlohy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 27.9.2017.
 * User inputs amount of money and programme calculates how many banknotes and change will be required to pay
 */

// TODO: 30.9.2017 Slight inconsistencies in change calculation
public class bankNotesAndChange {
    static double moneyFromUser;

    public static void calculatingBanknotes() {
        int notes [] = new int [] {500, 200, 100, 50, 20, 10, 5};
        boolean used;
        int appearing [] = new int [notes.length];
        for(int i = 0; i < notes.length; i++) {
            if (moneyFromUser >= notes[i]) {
                used = true;
                appearing[i] = (int) Math.floor(moneyFromUser / notes[i]);
                moneyFromUser = moneyFromUser - (appearing[i] * notes[i]);
                printingTheBankNotes(notes[i], used, appearing[i] );
            }
            else {
                used = false;
                printingTheBankNotes(notes[i], used, appearing[i]);
            }
        }
    }

    public static void printingTheBankNotes(double value, boolean used, int times) {
        if(used)System.out.println("Bank note with value of "+value+" was used "+times+" time/s.");
        else System.out.println("Bank note with value of "+value+" was not used.");
    }

    public static void calculatingChange() {
        double change [] = new double[] {2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
        boolean used;
        int appearing [] = new int[change.length];
        for(int i = 0; i < change.length; i++) {
            if(moneyFromUser >= change[i]) {
                appearing[i] = (int) Math.floor(moneyFromUser / change[i]);
                moneyFromUser = moneyFromUser - (appearing[i] * change[i]);
                used = true;
                printingChange(change[i], used, appearing[i]);
            }
            else {
                used = false;
                printingChange(change[i], used, appearing[i]);
            }
        }
    }

    public static void printingChange(double value,boolean used, int times) {
        if(used)System.out.println("Change with value of "+value+" was used "+times+" time/s.");
        else System.out.println("Change with value of "+value+" was not used.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input amount of money you want to exchange: ");
        moneyFromUser = in.nextFloat();
        calculatingBanknotes();
        calculatingChange();
    }
}
