package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * Nacita znamky a vypocita aritmeticky priemer
 */
public class znamkyAP {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\znamkyAP.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            String vsetko = br.readLine();
            br.close();
            String[] rozdelenie = vsetko.split(" ");
            int znamky[] = new int[rozdelenie.length];
            int sucet = 0, pocetCisel = 0;
            double AP;
            for (int i = 0; i < rozdelenie.length; i++) {
                znamky[i] = Integer.parseInt(rozdelenie[i]);
                sucet += znamky[i];
                pocetCisel++;
            }
            AP = (double) Math.round(sucet / pocetCisel * 100) / 100;
            bw.write("" + AP);
            bw.close();
            System.out.println("Zapis uspesne vykonany.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
