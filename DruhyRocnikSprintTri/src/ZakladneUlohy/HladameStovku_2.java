package ZakladneUlohy;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 19.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Hladame 100 v 2D poli to je sranda to
 */
public class HladameStovku_2 {

    public static int[][] nacitanie() {
        int C[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                j++;i++;
                System.out.print("Zadajte cislo do " + j + ". stlpca v " + i + ". riadku: ");
                j--;i--;
                C[i][j] = sc.nextInt();
            }
        }
        return C;
    }

    public static int hladameStovky(int C[][]) {
        int pocetStoviek = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                if (C[i][j] == 100) pocetStoviek++;
            }
        }
        return pocetStoviek;
    }

    public static void main(String[] args) {
        System.out.println("Hladame 100 v 2D poli to je sranda to.");
        int C[][] = nacitanie();
        int pocetStoviek = hladameStovky(C);
        System.out.println("Pocet nacitanych stoviek je: "+pocetStoviek);
    }
}
