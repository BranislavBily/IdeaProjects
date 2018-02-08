package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * Zo suboru nacitava pismena a hlada kolko 'A' sa nachadza v subore. Ak najde 'X' prestane pocitat.
 */
public class kymNenajdeX {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\kymNenajdeX.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            String vsetko = br.readLine();
            br.close();
            int pocetA = 0;
            String pismena [] = vsetko.split(" ");
            for(String pismenoString : pismena) {
                char pismeno = pismenoString.charAt(0);
                if(pismeno == 'X') break;
                else if (pismeno == 'A') pocetA++;
            }
            bw.write(""+pocetA);
            bw.close();
            System.out.println("Zapis uspesne vykonany.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
