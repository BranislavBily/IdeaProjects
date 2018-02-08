package ZakladneUlohy;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 20.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Vymena prvkov medzi stlpcom a riadkom (v prvom)
 */
public class MenimVStlpciAVRiadku_6 {

    public static char[][] nacitanie() {
        char G[][] = new char[4][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < G.length; i++) {
            for (int j = 0; j < G[i].length; j++) {
                j++;
                i++;
                System.out.print("Zadajte pismeno do " + j + ". stlpca v " + i + ". riadku: ");
                j--;
                i--;
                G[i][j] = sc.next().charAt(0);
            }
        }
        return G;
    }

    public static void vypisanie(char G[][]) {
        System.out.println();
        for (int i = 0; i < G.length; i++) {
            for (int j = 0; j < G[i].length; j++) {
                System.out.print(G[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zoradenie(char G[][]) {
        char pohar;
        for (int i = 0; i < G.length; i++) {
            pohar = G[i][0];
            G[i][0] = G[0][i];
            G[0][i] = pohar;
        }
        vypisanie(G);
    }

    public static void main(String[] args) {
        char G[][] = nacitanie();
        vypisanie(G);
        zoradenie(G);
    }
}
