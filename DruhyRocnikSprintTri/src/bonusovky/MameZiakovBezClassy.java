package bonusovky;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 11.01.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class MameZiakovBezClassy {

    public static void vypisujemPole(int ziaci[][]) {
        for (int i = 0; i < ziaci.length; i++) {
            for (int j = 0; j < ziaci[i].length; j++) {
                System.out.print(ziaci[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rozneVypoctyRobimTu(int ziaci[][]) {
        double AP;
        int max = 1, min = 5, sucet, aktualneCislo;
        for (int i = 0; i < ziaci.length; i++) {
            sucet = 0;
            for (int j = 0; j < ziaci[i].length; j++) {
                aktualneCislo = ziaci[i][j];
                sucet += aktualneCislo;
                if( aktualneCislo > max) max = aktualneCislo;
                else if (aktualneCislo < min) min = aktualneCislo;
            }
            AP = (double) Math.round(sucet / ziaci[i].length * 100) / 100;
            System.out.println("Aritmeticky priemer "+i+". ziaka je: "+AP+", jeho najhorsia znamka je: "+max+", jeho najlepsia " +
                               "znamka je: "+min);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte pocet ziakov: ");
        int pocetZiakov = sc.nextInt(), pocetZnamok;
        int ziaci[][] = new int[pocetZiakov][];
        for(int i = 0; i < pocetZiakov; i++) {
            i++;
            System.out.print("Zadajte pocet znamok "+i+". ziaka: ");
            i--;
            pocetZnamok = sc.nextInt();
            ziaci[i] = new int[pocetZnamok];
            for (int j = 0; j < pocetZnamok; j++) {
                i++;j++;
                System.out.print("Zadajte "+j+". znamku "+i+". ziakovi: ");
                i--;j--;
                ziaci[i][j] = sc.nextInt();
            }
        }
        vypisujemPole(ziaci);
        rozneVypoctyRobimTu(ziaci);
    }
}
