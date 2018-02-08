package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 3.11.2017.
 * Pracujeme s textom. Vdaka zadaniu absolutne netusim co ma by v subore. Tak som isiel tichy freestyle
 */
public class pracaSTextom {
    static String znaky = "";
    public static void nacitajSubor() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\pracaSTextom.txt"));
            znaky = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void vypisSuboru(char pismenko, int pocetZnakov) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            bw.write(znaky);
            bw.newLine();
            bw.write(pismenko);
            bw.newLine();
            bw.write(""+pocetZnakov);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static char pismenoNaIndexe(int index) {
        return znaky.charAt(index - 1);
    }
    public static int pocetZnakov() {
        return znaky.length();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Zadajte index pismenka ktore chcete najst: ");
        int index = Integer.parseInt(brc.readLine());
        nacitajSubor();
        char pismenko = pismenoNaIndexe(index);
        int pocetZnakov = pocetZnakov();
        vypisSuboru(pismenko, pocetZnakov);
        System.out.println("Zapis suboru bol uspesny.");
    }
}
