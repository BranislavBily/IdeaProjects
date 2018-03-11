package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args) throws IOException {
        initializingArray();
        letsPlay();
    }

    public static void initializingArray() throws IOException {
        System.out.print("Input number of athletes: ");
        athletes = new double[Integer.parseInt(br.readLine())][];
    }

    public static void letsPlay() {
        int numberOfThrows;
        if(athletes.length < 8) {
            numberOfThrows = 6;
        } else {
            numberOfThrows = 3;
        }
        loadingThrows(numberOfThrows);
    }

    public static void loadingThrows(int numberOfThrows) {
        for (int i = 0; i < athletes.length; i++) {
            for (int j = 0; j < numberOfThrows; j++) {
                for (int k = 0; k < athletes[i]; k++) {

                }
            }
        }
    }
}
