package ulohy;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 15.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class vyhladavania {

    public static int linearSearch(int pole[], int hladame) {
        for (int i = 0; i < pole.length; i++) {
            if(pole[i] == hladame) return i;
        }
        return -1;
    }

    public static int binarySearch(int pole[], int hladame) {
        return;
    }

}
