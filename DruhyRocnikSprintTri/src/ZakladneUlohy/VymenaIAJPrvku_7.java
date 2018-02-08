package ZakladneUlohy;

import java.util.Scanner;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 20.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Po vygenerovani vymenime I a J prvok v poli
 */
public class VymenaIAJPrvku_7 {

    public static int[][] generacia() {
        int D [][] = new int[7][5];
        for(int i = 0; i < D.length; i++) {
            for(int j = 0; j < D[i].length; j++) {
                D[i][j] = (int)Math.round(Math.random() * 50 - 100);
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
        return D;
    }

    public static int nacitanie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nacitajte index  prvku: ");
        int index = sc.nextInt();
        return index;
    }


    public static int[][] tuPrebiehaVymena(int D[][], int i, int j) {
        int pohar, riadokI = 0, riadokJ = 0;
        riadokI = i / 6;
        i = (i - 1) % 5;
        riadokJ = j / 6;
        j = (j - 1) % 5;
        pohar = D[riadokI][i];
        D[riadokI][i] = D[riadokJ][j];
        D[riadokJ][j] = pohar;
        vypisovanie(D);
        return D;
    }

    public static void vypisovanie(int D[][]) {
        System.out.println();
        for(int i = 0; i < D.length; i++) {
            for (int j = 0; j < D[i].length; j++) {
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int D[][] = generacia();
        int i,j;
        i = nacitanie();
        j = nacitanie();
        vypisovanie(D);
        tuPrebiehaVymena(D, i, j);
    }
}
