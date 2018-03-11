package tasks;

import otherTasks.Task5UsingParameter;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 09.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task6BinaryAndLinearRow {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int F [][] = new int[5][4];

    public static void main(String[] args) throws IOException {
        F = generationOfNumbers();
        output();
        System.out.print("Input number you are searching for: ");
        int searchedNumber = inputOfNumber();
        Point indexBinary = Task5UsingParameter.findElementBinary(F, searchedNumber);
        Point indexLineary = Task5UsingParameter.findElementLineary(F, searchedNumber);
        Task5UsingParameter.output(indexBinary, indexLineary);
    }
    
    public static int[][] generationOfNumbers() {
        int array[][] = new int[5][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double generatedNumber =  Math.random() * 200 - 100;
                array[i][j] = (int) generatedNumber;
            }
        }
        return array;
    }

    public static void output() {
        for (int row[] :
                F) {
            for (int number :
                    row) {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }

    public static int inputOfNumber() throws IOException {
        return Integer.parseInt(br.readLine());
    }

}
