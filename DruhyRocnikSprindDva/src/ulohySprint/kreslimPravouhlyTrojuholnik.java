package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * Kamo toto je take blbe zadanie ze mi je zle
 */
public class kreslimPravouhlyTrojuholnik {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader
            ("C:\\programovanie\\textPreUlohy\\kreslimPravouhlyTrojuholnik.txt"));
            double prepona = Integer.parseInt(br.readLine());
            double odvesna = odvesnaVypocitaj(prepona);
            double obsah = obsahVypocitaj(odvesna);
            nakreslenie(odvesna, obsah);
            System.out.println("Zapis uspesne vykonany.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static double odvesnaVypocitaj(double prepona) {
        prepona = Math.pow(prepona, 2);
        double odvesna = (double)Math.round(Math.sqrt(prepona / 2) * 100) / 100 ;
        return odvesna;
    }
    public static double obsahVypocitaj(double odvesna) {
        return (double) Math.round(Math.pow(odvesna, 2) / 2 * 100) / 100;
    }
    public static void nakreslenie(double odvesna, double obsah) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            for(int i = 1; i < odvesna + 2; i++) {
                for(int j = 1; j < i + 1; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.write("Velkost odvesny: "+odvesna);
            bw.write(" Obsah trojuholnika: "+obsah);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
