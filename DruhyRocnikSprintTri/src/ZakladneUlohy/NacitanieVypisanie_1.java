package ZakladneUlohy;

import java.util.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * Nacitanie do pola a nasledne vypisanie toho co je v poli
 */

public class NacitanieVypisanie_1 {

    public static int[][] nacitanie() {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[5][2];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                j++;i++;
                System.out.print("Nacitajte cislo do " + j + ". stlpca v " + i + ". riadku: ");
                j--;i--;
                A[i][j] = sc.nextInt();
            }
        }
        return A;
    }

    public static void vypisanie(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                j++;i++;
                System.out.print("Toto je " + j + ". cislo z " + i + ". riadku je ");
                j--;i--;
                System.out.println(A[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nacitanie do pola a nasledne vypisanie toho co je v poli.");
        int[][] A = nacitanie();
        vypisanie(A);
    }
}
