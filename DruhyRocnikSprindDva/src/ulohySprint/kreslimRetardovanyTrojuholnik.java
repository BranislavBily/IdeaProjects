package ulohySprint;

import java.io.*;

public class kreslimRetardovanyTrojuholnik {
    public static double odvesnaVypocitaj(double prepona) {
        double odvesna = Math.sqrt(Math.pow(prepona, 2) / 2);
        return odvesna;
    }

    public static double obsahVypocitaj(double odvesna) {
        double obsah = odvesna * odvesna / 2;
        return obsah;
    }

    public static void vykresliSa(double prepona, double odvesna, double obsah) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
        for(int i = 1; i <= prepona; i++) {
            for(int j = 1; j <= i; j++) {
                if(i < prepona) {
                    if (j == 1 || j == i) bw.write("*");
                    else bw.write(" ");
                }
                else bw.write("*");
            }
            bw.newLine();
        }
        bw.write("Dlzka odvesien je "+odvesna+", obsah tohto trojuholnika je "+obsah);
        bw.close();
        System.out.println("Zapis do suboru bol uspesne vykonany.");

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader
                ("C:\\programovanie\\textPreUlohy\\kreslimRetardovanyTrojuholnik.txt"));
        String vstup = br.readLine();
        br.close();
        double velkost = Integer.parseInt(vstup);
        double odvesna = odvesnaVypocitaj(velkost);
        double obsah = obsahVypocitaj(odvesna);
        vykresliSa(velkost,odvesna, obsah);
    }
}
