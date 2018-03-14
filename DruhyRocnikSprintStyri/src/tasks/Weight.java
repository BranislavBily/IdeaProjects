package tasks;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 14.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Weight {

    static int weight;

    Weight(int max) {
        generateWeight(max);
    }

    private static void generateWeight(int maxWeight) {
        double generatedNumber = Math.random() * maxWeight;
        weight = (int) generatedNumber;
    }

    public static int getWeight() {
        return weight;
    }
}
