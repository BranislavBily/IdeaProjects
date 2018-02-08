package Opakovanie.zadania;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Program na vypocitanie hlbky studne podla dlzky padu kamena
 */
public class kamenStudna {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Zadajte dlzka padania kamena: ");
        double pad = in.nextInt();
        double hlbka = 0.5 * 10 * Math.pow(pad, 2);
        System.out.print("Hlbka studne je: " +hlbka+" metrov.");


    }
}
