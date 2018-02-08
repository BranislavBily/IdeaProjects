package ZakladneUlohy;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 19.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Teraz uz pocitame AP to je uz iny level
 */
public class AritmetickyPriemer_3 {

    public static int[][] nacitanie() {
        int A[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                j++;i++;
                System.out.print("Zadajte cislo do " + j + ". stlpca v " + i + ". riadku: ");
                j--;i--;
                A[i][j] = sc.nextInt();
                while (A[i][j] > 5 || A[i][j] < 0) {
                    System.out.print("Zadali ste nemoznu znamku, opravte sa: ");
                    A[i][j] = sc.nextInt();
                }
            }
        }
        return A;
    }

    public static double vypocetAP(int A[][]) {
        double sucet = 0, pocetCisel = A.length * A[0].length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                sucet += A[i][j];
            }
        }
        double AP = (double) Math.round(sucet / pocetCisel * 100) / 100;
        return AP;
    }

    public static void vypis(int A[][], double AP) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Aritmeticky priemer vsetkych cisle je: " + AP);
    }


    public static void main(String[] args) {
        System.out.println("Pocitame AP jej hura.");
        int A[][] = nacitanie();
        double AritmetickyPriemer = vypocetAP(A);
        vypis(A, AritmetickyPriemer);
    }
}
