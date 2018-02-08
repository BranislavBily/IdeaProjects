import java.util.Scanner;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 19.01.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class uloha1 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] nacitavanie(int znamkyZiaka[]) {
        for(int i = 0; i < znamkyZiaka.length; i++) {
            System.out.print("Zadajte znamku: ");
            do {
                znamkyZiaka[i] = sc.nextInt();
            } while(znamkyZiaka[i] > 5 || znamkyZiaka[i] < 1);

        }
        return znamkyZiaka;
    }

    public static void vypisovanie(int ziaci[], double AP, int min, int max) {
        for (int i = 0; i < ziaci.length; i++) {
                System.out.print(ziaci[i]+" ");
            }
            System.out.print(", priemerna znamka: "+AP+", najhorsia znamka "+max+", najlepsia "+min);
            if(AP <= 1.5 && max <= 2) System.out.print(". Ziak prospel s vyznamenanim.");
            else if(AP <= 2 && max <= 3) System.out.print(". Ziak prospel velmi dobre");
            else if(max <= 4) System.out.print(". Ziak prospel");
            else if(max == 5) System.out.print(". Ziak neprospel");
            System.out.println();
    }


    public static void vsetkyVypocty(int ziaci[][]) {
        double sucet = 0, pocet;
        double AP;
        for(int i = 0; i < ziaci.length;i++) {
            sucet = 0;
            int min = 5, max = 1;
            for (int j = 0; j < ziaci[i].length; j++) {
                sucet += ziaci[i][j];
                if(ziaci[i][j] < min) min = ziaci[i][j];
                if(ziaci[i][j] > max) max = ziaci[i][j];
            }
            pocet = ziaci[i].length;
            AP = (double) Math.round(sucet / pocet * 100) / 100;
            vypisovanie(ziaci[i], AP, min, max);
        }
    }

    public static void main(String[] args) {
        System.out.print("Zadajte pocet ziakov: ");
        int pocetZiakov = sc.nextInt(), pocetZnamok;
        int ziaci [][] = new int[pocetZiakov][];
        for(int i = 0; i < ziaci.length; i++) {
            i++;
            System.out.print("Zadajte pocet znamok "+i+". ziaka: ");
            i--;
            pocetZnamok = sc.nextInt();
            ziaci[i] = new int[pocetZnamok];
            ziaci[i] = nacitavanie(ziaci[i]);
        }
        vsetkyVypocty(ziaci);
    }
}
