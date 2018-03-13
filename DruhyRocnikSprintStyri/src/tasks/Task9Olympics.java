package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 11.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task9Olympics {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static double[][] athletes;
    static double[] AM;
    static double[] longestThrow;

    public static void main(String[] args) throws IOException {
        initializingArray();
        int[] indexesOfFinalists = fillWithIndexes();
        letsPlay(athletes.length, indexesOfFinalists);
        indexesOfFinalists = indexesOfFinalists();
        System.out.println("Start of the second round.");
        letsPlay(indexesOfFinalists.length, indexesOfFinalists);
        results();
    }

    public static void initializingArray() throws IOException {
        System.out.print("Input number of athletes: ");
        athletes = new double[Integer.parseInt(br.readLine())][6];
        AM = new double[athletes.length];
        longestThrow = new double[athletes.length];
        Arrays.fill(longestThrow, 0);
    }

    public static void letsPlay(int numberOfAthletes, int[] indexes) throws IOException {
        for (int i = 0; i < numberOfAthletes ; i++) {
            for (int j = 0; j < 3; j++) {
                athletes[indexes[i]][j] = throwingTheSpear();
                if(longestThrow[i] < athletes[indexes[i]][j]) {
                    longestThrow[i] = athletes[indexes[i]][j];
                }
            }
            AM[i] = calculationOfAM(i);
        }
    }

    public static double throwingTheSpear() throws IOException {
        while(true) {
            try {
                System.out.print("Input the distance the spear has travelled: ");
                return Double.parseDouble(br.readLine());
            } catch(NumberFormatException e) {
                System.out.print("Please, ");
            }
        }
    }

    public static double calculationOfAM(int numberOfAthlete) {
        double sum = 0, amount = 0;
        for (int i = 0; i < 3; i++) {
            if(athletes[numberOfAthlete][i] != 0) {
                sum += athletes[numberOfAthlete][i];
                amount++;
            }
        }
        return (double) Math.round(sum / amount * 100) / 100;
    }

    public static int[] fillWithIndexes() {
        int[] array = new int[athletes.length];
        for (int i = 0; i < athletes.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] indexesOfFinalists() {
        int lenght = athletes.length;
        if(lenght > 8) {
            lenght = 8;
        }
        int[] indexes = new int[lenght];
        double[] AMClone = AM.clone();
        AMClone = Sort.quickSortDouble(AMClone, 0, AMClone.length);
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = Search.linearSearchDouble(AM, AMClone[i]);
        }
        return indexes;
    }

    public static void results() {
        int position, numberOfAthlete;
        double[] longestThrowsClone = longestThrow.clone();
        longestThrowsClone = Sort.quickSortDouble(longestThrowsClone, 0, longestThrowsClone.length);
        for (int i = 0; i < athletes.length; i++) {
            position = i + 1;
            numberOfAthlete = Search.linearSearchDouble(longestThrow, longestThrowsClone[i]);
            System.out.print(position+". athlete was athlete number "+numberOfAthlete+" with throw "+longestThrowsClone[i]);
            System.out.println();
        }
    }
}
