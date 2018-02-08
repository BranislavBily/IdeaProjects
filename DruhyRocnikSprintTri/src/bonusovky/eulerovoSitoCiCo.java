package bonusovky;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 19.01.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class eulerovoSitoCiCo {

    public static int[] jaPlnimPole(int cislaSuTu[]) {
        for(int i = 0; i < cislaSuTu.length; i++) {
            cislaSuTu[i] = i + 2;
        }
        return cislaSuTu;
    }

    public static int[] jaVyradzujem(int cislaSuTu[]) {
        for (int i = 0; i < cislaSuTu.length; i++) {
            if(cislaSuTu[i] > 0) {
                for (int j = i + 1; j < cislaSuTu.length; j++) {
                    if(cislaSuTu[j] % cislaSuTu[i] == 0 ) cislaSuTu[j] = 0;
                }
            }
        }
        return cislaSuTu;
    }

    public static void jaVypisujem(int cislaSuTu[]) {
        for (int i = 0; i < cislaSuTu.length; i++) {
            if(cislaSuTu[i] > 0) System.out.print(cislaSuTu[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte cislo do ktoreho chcete hladat: ");
        int strop = sc.nextInt();
        int cislaSuTu[] = new int[strop - 1];
        cislaSuTu = jaPlnimPole(cislaSuTu);
        cislaSuTu = jaVyradzujem(cislaSuTu);
        jaVypisujem(cislaSuTu);
    }
}
