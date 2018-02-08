package Opakovanie.zadania.skolaHodina;

import java.util.Scanner;


/**
 * Created by Branislav Bily on 22.9.2017.
 * V poli sa budu vymienat veci podla vstupu uzivatela
 */
public class vymenaVPoli {
    // Definovanie do vsetkeho
    static int S [] = new int[10];
    static Scanner in = new Scanner(System.in);


    public static void zaplnitPole(int [] S) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Zaplnte pole: ");
            S[i] = in.nextInt();
        }
    }
    public static void vymenVPoli(int [] S) {
        System.out.println("Zadajte prvy pohar: ");
        int poharJeden = in.nextInt();
        while(poharJeden < 0 || poharJeden > 15) {
            System.out.println("Zadajte prvy pohar: ");
            poharJeden = in.nextInt();
        }
        System.out.println("Zadajte druhy pohar: ");
        int poharDva = in.nextInt();
        while(poharDva < 0 || poharDva > 15) {
            System.out.println("Zadajte prvy pohar: ");
            poharDva = in.nextInt();
        }
        System.out.println("Zadajte treti pohar: ");
        int poharTri = 0;
        poharTri = S[poharJeden-1];
        S[poharJeden-1] = S[poharDva-1];
        S[poharDva-1] = poharTri;
    }
    public static void vypisovanie(int [] S) {
        for(int i = 0; i < S.length; i++)System.out.print(S[i]+" ,");
        System.out.println();
    }
    public static void main(String[] args) {
        zaplnitPole(S);
        vypisovanie(S);
        vymenVPoli(S);
        vypisovanie(S);
    }
 }

