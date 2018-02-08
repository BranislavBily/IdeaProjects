package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * V subore je 5 cisel ktore sa ulozia do pola, vymenit i a j prvok v poli, negativne cisla nahradit 0, najvasie cislo
 * vymenit s 0 prvkom
 */
public class pracaSPolom {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\pracaSPolom.txt"));
            BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
            String vsetko = br.readLine();
            br.close();
            String [] rozdelenie = vsetko.split(" ");
            int B [] = new int[rozdelenie.length];
            int i, j, max = 0, indexNajviac = 0;
            for(int d = 0; d < rozdelenie.length; d++) {
                B[d] = Integer.parseInt(rozdelenie[d]);
                if(B[d] < 0) B[d] = 0;
                if(B[d] > max) {
                    max = B[d];
                    indexNajviac = d;
                }
            }
            vypis(B);
            System.out.println("Zadajte i-ty prvok: ");
            i = Integer.parseInt(brc.readLine()) - 1;
            System.out.println("Zadajte j-ty prvok: ");
            j = Integer.parseInt(brc.readLine()) - 1;
            B = vymenaPrvkov(i, j, B);
            vypis(B);
            B = vymenaPrvkov(0, indexNajviac, B);
            vypis(B);
            System.out.println("Zapis uspesne vykonany.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int [] vymenaPrvkov(int i, int j, int B[]){
        int pohar = B[i];
        B[i] = B[j];
        B[j] = pohar;
        return B;
    }

    public static void vypis(int B[]) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\programovanie\\vysledok.txt"));
            for (int i = 0; i < B.length; i++) {
                bw.write(""+B[i]+" ");
            }
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
