import java.io.*;

public class trojuholnik {

    public static double odvesnaVypocitaj(double prepona) {
        double odvesna = Math.sqrt(Math.pow(prepona, 2) / 2);
        return odvesna;
    }

    public static double obsahVypocitaj(double odvesna) {
        double obsah = odvesna * odvesna / 2;
        obsah = (double) Math.round(obsah * 100) / 100;
        return obsah;
    }

    public static void vykresliSa(double odvesna, double obsah) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Programovanie\\vysledok.txt"));
        odvesna = (double) Math.round(odvesna * 100) / 100;
        bw.write("Odvesna trojuholnika je " + odvesna + ", obsah trojuholnika je " + obsah + ".");
        bw.newLine();
        for (int i = 0; i < odvesna; i++) {
            for (int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Programovanie\\Skusanie\\trojuholnik.txt"));
        double prepona = Integer.parseInt(br.readLine());
        br.close();
        double odvesna = odvesnaVypocitaj(prepona);
        double obsah = obsahVypocitaj(odvesna);
        vykresliSa(odvesna, obsah);
        System.out.println("Zapis do suboru uspesne vykonany.");
    }
}
