/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 19.01.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */

public class uloha2 {

    public static int[][] generovanieCisel() {
        int O[][] = new int[6][6];
        for(int i = 0; i < O.length; i++) {
            for (int j = 0; j < O[i].length; j++) {
                O[i][j] = (int) Math.round((Math.random()*137 - 12)) ;
            }
        }
        return O;
    }

    public static void hladanieAPocitanieAP(int O [][]) {
        double sucet = 0, pocet = 0, AP;
        int j;
        for(int i = 0; i < O.length;i++) {
            j = i;
            if(O[i][j] > 0) {
                sucet += O[i][j];
                pocet++;
            }
        }
        AP = (double) Math.round(sucet / pocet * 100) / 100;
        vypisovanie(O, AP);
        System.out.println(sucet+" "+pocet);
    }

    public static void vypisovanie(int O[][], double AP) {
        for (int i = 0; i < O.length; i++) {
            for (int j = 0; j < O[i].length; j++) {
                System.out.print(O[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Priemerne cislo z kladnych prvkov z hlavnej diagonaly je "+AP);
    }

    public static void main(String[] args) {
       int O[][] = generovanieCisel();
       hladanieAPocitanieAP(O);
    }
}
