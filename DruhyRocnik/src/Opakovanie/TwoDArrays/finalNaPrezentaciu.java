package Opakovanie.TwoDArrays;

import java.util.Scanner;
/**
 * Created by Branislav Bily on 20.9.2017.
 */

public class finalNaPrezentaciu {
    public static void main(String[] args) {
        int deti [] [] = nacitanie();
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte kolkeho ziaka ktoreho chcete priemernu znamku: ");
        int indexZiaka = sc.nextInt() - 1;
        double priemer = priemerneCislo(deti, indexZiaka);
        vypis(deti, priemer, indexZiaka + 1);
    }
    public static int [][] nacitanie() {
        Scanner sc = new Scanner(System.in);
        int vstup = 0;
        System.out.print("Zadajte pocet ziakov: ");
        int pocetDeti = sc.nextInt();
        int znamky [] [] = new int [pocetDeti] [3];
        for(int i = 0; i < pocetDeti; i++) {
            for(int j = 0; j < 3; j++) {
                i++;j++;
                System.out.print("Zadajte "+j+" znamku "+i+" ziaka: ");
                i--;j--;
                vstup = sc.nextInt();
                while(vstup > 5 || vstup < 1 ){
                    System.out.print("Zadajte moznu znamku: ");
                    vstup = sc.nextInt();
                }
                znamky[i][j] = vstup;
            }
        }
        return znamky;
    }
    public static double priemerneCislo(int deti [] [], int indexZiaka) {
        int i = indexZiaka;
        double sucet = 0;
        for(int j = 0; j < 3; j++) {
            sucet += deti[i][j];
        }
        return (double) Math.round(sucet / 3 * 100) / 100;
    }
    public static void vypis(int ziaci[][], double priemer, int indexZiaka) {
        for(int i = 0; i < ziaci.length; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(ziaci[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Priemerne znamka "+indexZiaka+". ziaka bola "+priemer);
    }
}
