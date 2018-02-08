
import java.io.*;

public class znamky {

    public static String[] nacitavanie() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Programovanie\\Skusanie\\znamky.txt"));
        String vstup = br.readLine();
        br.close();
        String[] vstupy = vstup.split(" ");
        return vstupy;
    }

    public static double vypocetAP(int[] cisla, double dlzkaPola) {
        int sucet = 0;
        for (int i = 1; i <= dlzkaPola; i++) {
            sucet += cisla[i];
        }
        double AP = (double) Math.round(sucet / (dlzkaPola) * 100) / 100;
        return AP;
    }

    public static void vypis(int[] cisla, double AP) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Programovanie\\vysledok.txt"));
        for (int i = 1; i < cisla.length; i++) {
            bw.write("" + cisla[i] + " ");
        }
        bw.newLine();
        bw.write("Aritmeticky priemer tychto cisel je " + AP);
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        String[] vstupy = nacitavanie();
        int cisla[] = new int[vstupy.length];
        int pocetZnamok = 0;
        double dlzkaPola = Integer.parseInt(vstupy[0]);
        for (int i = 1; i < vstupy.length; i++) {
            cisla[i] = Integer.parseInt(vstupy[i]);
            pocetZnamok++;
            if (cisla[i] < 1 || cisla[i] > 5) {
                System.out.println("Zadali ste zle znamky.");
                System.exit(0);
            }
        }
        if (pocetZnamok != dlzkaPola) {
            System.out.println("Zadali ste nespravny pocet znamok.");
            System.exit(0);
        }
        double AP = vypocetAP(cisla, dlzkaPola);
        vypis(cisla, AP);
        System.out.println("Zapis do subory bol uspesny.");
    }
}
