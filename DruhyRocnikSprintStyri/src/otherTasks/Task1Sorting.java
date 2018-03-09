package otherTasks;

import tasks.Sort;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task1Sorting {
    static int[] array = new int[30];

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            array[i] = numberInput();
        }
        output();
        array = Sort.quickSort(array, 0, array.length - 1);
        System.out.println("Pole bolo zoradene.");
        output();
    }

    public static int numberInput(){
        double generatedNumber = Math.random() * 100;
        int number = (int)generatedNumber;
        return number;
    }

    public static void output() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ", array[i * 10 + j]);
            }
            System.out.println();
        }
    }

}
