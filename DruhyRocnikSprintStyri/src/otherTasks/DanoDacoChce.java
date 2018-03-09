package otherTasks;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 04.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class DanoDacoChce {
    public static void main(String[] args) {
        int array[] = new int[20];
        double sum = 0, amount = 0;
        for (int i = 0; i < array.length; i++) {
            double generatedNumber = Math.random() * 120;
            array[i] = (int)generatedNumber;
            if(array[i] >= 0 && array[i] <= 20){
                sum += array[i];
                amount++;
                System.out.print(array[i]+" ");
            }
        }
        //Len zaokruhlenie na 2 desatine miesta nie je to extra potrebne
        double AP = (double) Math.round(sum / amount * 100) / 100;
        System.out.println();
        System.out.print(AP);
    }
}
