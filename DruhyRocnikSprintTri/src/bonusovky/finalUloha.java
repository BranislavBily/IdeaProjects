package bonusovky;

import java.io.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 09.01.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class finalUloha {

    public static int[][] nacitanie() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\final.txt"));
        int tepy[][] = new int[5][6];
        String vstup = br.readLine();
        br.close();
        int index = 0;
        String vstupy[] = vstup.split(" ");
        for(int i = 0; i < tepy.length; i++) {
            for (int j = 0; j < tepy[i].length; j++) {
                tepy[i][j] = Integer.parseInt(vstupy[index]);
                index++;
            }
        }
        return tepy;
    }

    public static void vypisovanie(double AP[], int odporucane[], int tepy[][]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
        String cinnost[] = {"po behu", "pred cvicenim", "po cviceni", "pri vycerpanosti", "pri nastvanosti"};
        for(int i = 0; i < AP.length; i++) {
            int typCinnosti = tepy[i][0] - 1;
            bw.write("Vas priemerny tep "+cinnost[typCinnosti]+"  bol "+AP[i]+", zatial co odporucany tep pri tejto cinnosti je "+odporucane[typCinnosti]);
            System.out.println("Vas priemerny tep "+cinnost[typCinnosti]+"  bol "+AP[i]+", zatial co odporucany tep pri tejto cinnosti je "+odporucane[typCinnosti]);
            bw.newLine();
        }
        bw.close();
    }

    public static double[] vypocetAP(int tepy[][]) {
        double sucet;
        double AP[] = new double[tepy.length];
        for(int i = 0; i < tepy.length; i++) {
            sucet = 0;
            for (int j = 1; j < tepy[i].length; j++) {
                sucet += tepy[i][j];
            }
            AP[i] = (double) Math.round(sucet / (tepy[i].length - 1) * 100) / 100;
        }
        return AP;
    }

    public static void main(String[] args) throws IOException {
        int tepy [][] = nacitanie();
        double AP[] = vypocetAP(tepy);
        int odporucane[] = {100, 60, 85, 70, 75};
        vypisovanie(AP, odporucane, tepy);
    }
}
