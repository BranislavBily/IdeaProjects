package bonusovky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 22.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Z konzoly sa zada pocet ziakov a kolko maju znamok, potom ich znamky a vypocita sa AP, a najhorsiu znamku, zvysok zadania sa neda pochopit
 */
public class MameZiakov {

    private static ArrayList<Ziak> ziaci;

    public static int[][] nacitanie(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nacitajte pocet ziakov: ");
        int carovnePismenoN = sc.nextInt();
        int ziaci[][] = new int[carovnePismenoN][];
        for(int i = 0; i < carovnePismenoN; i++) {
            i++;
            System.out.print("Nacitajte pocet znamok "+i+"-teho ziaka.");
            i--;
            int carovnePismenoM = sc.nextInt();
            for(int j = 0; j < carovnePismenoM; j++) {
                j++;
                System.out.print("Nacijte "+j+". znamku: ");
                j--;
                ziaci[i][j] = sc.nextInt();
            }
        }
        return ziaci;
    }

    public static double[] vypocetAP(int[][] ziaci) {
        double AP[] = new double[ziaci.length];
        double sucet = 0, pocetCisel = 0;
        for(int i = 0; i < ziaci.length; i++) {
            for(int j = 0; j < ziaci[i].length;j++){
                sucet += ziaci[i][j];
                pocetCisel++;
            }
            AP[i] = (double) Math.round(sucet / pocetCisel * 100) / 100;
        }
        return AP;
    }

    public static int[] vypocetNajhorsejZnamky(int ziaci [][]) {
        int najhorsieZnamky[] = new int[ziaci.length];
        int najhorsiaZnamka = 1;
        for(int i = 0; i < ziaci.length; i++) {
            for(int j = 0; j < ziaci[i].length; j++ ) {
                if(ziaci[i][j] > najhorsiaZnamka) najhorsiaZnamka = ziaci[i][j];
            }
            najhorsieZnamky[i] = najhorsiaZnamka;
        }
        return najhorsieZnamky;
    }

    public static void vypis(int ziaci[][], double AP[], int najhorsieZnamky[]) {
        for(int i = 0; i < ziaci.length; i++) {
            for(int j = 0; j < ziaci[i].length; j++) {
                System.out.print(ziaci[i][j]+" ");
            }
            System.out.print("Najhorsia znamka tohto ziaka bola "+najhorsieZnamky[i]+", jeho priemer bol "+AP[i]);
            System.out.println();
        }
    }

    public static void main(String[] args){
        ziaci = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nacitajte pocet ziakov: ");
        int carovnePismenoN = sc.nextInt();
        for(int i = 0; i < carovnePismenoN; i++) {
            pridajZiaka();
        }
        vypisovanieZnamok();

    }

    public static void pridajZiaka() {
        Ziak ziak = new Ziak();
        // TODO FOR A Scanner a nieco take a
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte pocet znamok: ");
        int magickeCisloM = sc.nextInt();
        for(int i = 0; i < magickeCisloM; i++) {
            System.out.print("Zadajte znamku: ");
            ziak.pridajZnamku(sc.nextInt());
        }
        ziaci.add(ziak);
    }


    private static void vypisovanieZnamok() {
        for(int i = 0; i < ziaci.size(); i++) {
            i++;
            System.out.println("Ziak cislo " +i);
            i--;
            Ziak ziak = ziaci.get(i);
            System.out.println("jejho naj znamka " + ziak.getNajlepsiaZnamka());
            System.out.println("jejho naj znamka " + ziak.getNajhorsiaZnamka());
            System.out.println("jejho naj znamka " + ziak.priemerTaky());
        }
    }



    public static class Ziak {
        private ArrayList<Integer> znamky;
        private int najhorsiaZnamka;
        private int najlepsiaZnamka;

        public Ziak() {
            znamky = new ArrayList<>();
        }

        public void pridajZnamku(int znamka) {
            znamky.add(znamka);
        }

        public double priemerTaky() {
            double sucet = 0, pocet = 0;
            for(int i = 0; i < znamky.size(); i++) {
                sucet += znamky.get(i);
                pocet++;
            }
            return (double) Math.round(sucet / pocet * 100) / 100;
        }

        public int priemerOnaky() {
            // TODO
            return 0;
        }

        public int getNajhorsiaZnamka() {
            int najhorsiaZnamka = 1;
            for(int i = 0; i < znamky.size(); i++) {
                if(znamky.get(i) > najhorsiaZnamka) najhorsiaZnamka = znamky.get(i);
            }
            return najhorsiaZnamka;
        }

        public int getNajlepsiaZnamka() {
            int najlepsiaZnamka = 5;
            for(int i = 0; i < znamky.size(); i++) {
                if(znamky.get(i) < najlepsiaZnamka) najlepsiaZnamka = znamky.get(i);
            }
            return najlepsiaZnamka;
        }

    }

}