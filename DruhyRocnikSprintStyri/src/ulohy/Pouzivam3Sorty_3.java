package ulohy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 09.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Pouzivam3Sorty_3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] inicializaciaPola(int riadky, int stlpce) {
        int pole[][] = new int[riadky][stlpce];
        return pole;
    }

    public static int[][] generaciaCiselDoPola(int pole[][]) {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                double generovaneCislo = Math.random() * 120 - 20;
                pole[i][j] = (int) generovaneCislo;
            }
        }
        return pole;
    }

    public static int nacitanie() {
        try {
            int riadok = Integer.parseInt(br.readLine());
            return riadok;
        } catch (IOException e) {
            System.out.print("Nastala chyba");
        }
        return 0;
    }

    public static void vypisovanie(int pole[][]) {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.printf("%-4d ", pole[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] vypocetHlavnejDiagonaly(int pole[][]) {
        int diagonala [] = new int[pole.length];
        for (int i = 0; i < pole.length; i++) {
            diagonala[i] = pole[i][i];
        }
        diagonala = Sorty.insertionSortOdNajvacsieho(diagonala);
        pole = vratenieDiagonalyDoPola(pole, diagonala);
        return pole;
    }

    public static int[][] vratenieDiagonalyDoPola(int pole[][], int diagonala[]) {
        for (int i = 0; i < pole.length; i++) {
            pole[i][i] = diagonala[i];
        }
        return pole;
    }

    public static int [][] vypocetVedlajsejDiagonaly(int pole[][]) {
        int diagonaly [] = new int[pole.length];
        int index = 0;
        int j = 0;
        for (int i = pole.length - 1; i >= 0 ; i--) {
            diagonaly[index]= pole[j][i];
            j++;
            index++;
        }
        diagonaly = Sorty.selectionSortOdNajvacsieho(diagonaly);
        pole = vratenieVedlajsejDiagonalyDoPola(pole, diagonaly);
        return pole;
    }

    public static int[][] vratenieVedlajsejDiagonalyDoPola(int pole[][], int diagonala[]) {
        int index = 0;
        int j = 0;
        for (int i = pole.length-1; i >= 0 ; i--) {
            pole[j][i] = diagonala[index];
            j++;
            index++;
        }
        return pole;
    }

    public static void main(String[] args) {
        int B[][] = inicializaciaPola(5, 5);
        B = generaciaCiselDoPola(B);
        vypisovanie(B);
        System.out.print("Nacitajte riadok ktory chcete zoradit: ");
        int riadok = nacitanie();
        B[riadok] = Sorty.bubbleSortOdNajmensieho(B[riadok]);
        vypisovanie(B);
        System.out.print("Nacitajte riadok ktory chcete zoradit: ");
        riadok = nacitanie();
        B[riadok] = Sorty.insertionSortOdNajmensieho(B[riadok]);
        vypisovanie(B);
        B = vypocetHlavnejDiagonaly(B);
        vypisovanie(B);
        System.out.println("Hlavna diagonala zmenena.");
        B = vypocetVedlajsejDiagonaly(B);
        vypisovanie(B);
        System.out.println("Vedlajsia diagonala zmenena.");

    }
}