package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * V zadani je vytvorenie funkcii tak ich tu vytvorim pozeraj sa
 */
public class skusamFunkcie {
    static String[] rozdelenie;

    public static void main(String[] args) {
        nacitajSubor();
        praca(rozdelenie);
        System.out.println("Zapis uspesne vykonany.");
    }

    public static void nacitajSubor() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\skusamFunkcie.txt"));
            String vsetko = br.readLine();
            br.close();
            rozdelenie = vsetko.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void praca(String[] mena) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            for (String slovo : mena) bw.write(slovo + " ");
            bw.write("pracuju na nejakom projekte.");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
