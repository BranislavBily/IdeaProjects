package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 14.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Mind that the tasks are usually badly written, this is prime example
 */
public class Task10WeightsToyingWithClasses {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Weight[] weights;

    public static void main(String[] args) throws IOException {
        System.out.print("Input number of weights: ");
        int numberOfWeights = inputFromUser();
        weights = new Weight[numberOfWeights];
        generationOfWeights();
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i].getWeight()+" ");
        }
        boolean foundTheH = false;
        while (!foundTheH) {
            System.out.print("Input the number H: ");
            int H = inputFromUser(); //I suppose this number should be loaded from console, but task does not specify this
            foundTheH = findingTheH(H);
        }
    }

    public static int inputFromUser() throws IOException {
        while(true) {
            try {
                return Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Please, ");
            }
        }
    }

    public static void generationOfWeights() throws IOException {
        int maxWeight;
        for (int i = 0; i < weights.length; i++)   {
            System.out.print("Input max value of range the weight will generate their weight (in grams): ");
            maxWeight = inputFromUser();
            Weight weight = new Weight(maxWeight);
            weights[i] = weight;
        }
    }

    public static boolean findingTheH(int H) {
        boolean found = false;
        for (int i = 0; i < weights.length; i++) {
            for (int j = i + 1; j < weights.length; j++) {
                System.out.print(weights[i].weight+"="+weights[j].weight+" ");
            }
            System.out.println();
        }
        return found;
    }
}
