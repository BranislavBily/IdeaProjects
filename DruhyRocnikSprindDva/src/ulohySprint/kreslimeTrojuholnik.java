package ulohySprint;

import java.io.*;
/**
 * Created by Branislav Bily on 27.10.2017.
 * V txt subore je nacitana velkost trojuholnika ktoru je nasledne nakresleny do ineho txt suboru
 */
public class kreslimeTrojuholnik {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\kreslimeTrojuholnik.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            int velkost = Integer.parseInt(br.readLine());
            br.close();
            for(int i = 0; i < velkost + 1; i++) {
                for(int j = 0; j < i; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }
            for(int k = velkost - 1; k > 0; k--) {
                for(int l = k; l > 0; l--) {
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.close();
            System.out.println("Zapis uspesne vykonany.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
