package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * Take zadania vytvorene tazko sa rozumie len tak proste rob ked toto citas kamo sorry ale tak ja ti nepomozem
 * lebo tak su tie ulohy pisane ze ani teraz neviem co to vlastne bude robit nie to neskor je mi to luto
 */
public class otravneZadania {
    static String meno, priezvisko;
    static int vek;
    public static void main(String[] args) {
        nacitajSubor();
        vypisSubor();
        nastavVek(18);
        vypisSubor();
        System.out.println("Zapis uspesne vykonany.");
    }
    public static void nacitajSubor() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\otravneZadania.txt"));
            String vsetko = br.readLine();
            br.close();
            String []rozdelenie = vsetko.split(" ");
            meno = rozdelenie[0]; priezvisko = rozdelenie[1]; vek = Integer.parseInt(rozdelenie[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void vypisSubor() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            bw.write("Meno: "+meno+" ");
            bw.write("Priezvisko: "+priezvisko+" ");
            bw.write("Vek: "+vek+" ");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void nastavVek(int novy) {
        vek = novy;
    }
}
