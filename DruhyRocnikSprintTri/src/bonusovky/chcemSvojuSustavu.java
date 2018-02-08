package bonusovky;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 23.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Zmena cisla do sustavy zadanej
 */
public class chcemSvojuSustavu {

    public static String premenaZ10DoX(int x, int cislo) {
        char z [] = {'A', 'B', 'C', 'D', 'E', 'F'};
        String vysledok = "", vys = "";
        int c;
        while(cislo != 0) {
            c = cislo % x;
            if(c > 9) vys += z[c - 10];
            else vys += c;
            cislo /= x;
        }
        for (int i = vys.length()-1; i >= 0; i--) {
            vysledok += vys.charAt(i);
        }
        return vysledok;
    }

    public static String premenaZXDo10(int sustavaB, String cisloPoPremene) {

        String vysledok = "";
        return vysledok;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nacitajte v akej sustave chcete mat cislo: ");
        int sustavaA = sc.nextInt();
        System.out.print("Zadajte desiatkove cislo: ");
        int desiatkoveCislo = sc.nextInt();
        String vysledok = premenaZ10DoX(sustavaA, desiatkoveCislo);
        System.out.print("Zadajte do akej sustavy chcete vase cislo premenit: ");
        int sustavaB = sc.nextInt();
        String finalVysledok = premenaZXDo10(sustavaB, vysledok);


    }
}
