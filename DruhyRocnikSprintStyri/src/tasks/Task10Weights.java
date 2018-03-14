package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 14.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task10Weights {

    static int[] weights;

    public static void main(String[] args) throws IOException {
        System.out.print("Input number of weights: ");
        int numberOfWeights = inputFromUser();
        weights = new int[numberOfWeights];
        System.out.print("Input max weight of the weights: ");
        int maxWeight = inputFromUser();
        generatingWeights(maxWeight);
        boolean foundTheH = false;
        do {
            System.out.print("Input the H: ");
            int H = inputFromUser(); //I suppose this number should be loaded from console, but task does not specify this
            foundTheH = searchingForTheSumOFH(H);
        } while(!foundTheH);
    }

    public static int inputFromUser() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                return Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Please, ");
            }
        }
    }

    public static void generatingWeights(int maxWeight) {
        for (int i = 0; i < weights.length; i++) {
            double generatedNumber = Math.random() * maxWeight;
            weights[i] = (int) generatedNumber;
            System.out.print(weights[i]+" ");
        }
    }

    public static boolean searchingForTheSumOFH(int H) {
        for (int i = 0; i < weights.length; i++) {
            for (int j = i + 1; j < weights.length; j++) {
                if(weights[i] + weights[j] == H) {
                    System.out.printf("H was succesfully summed by numbers %d and %d", weights[i], weights[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
