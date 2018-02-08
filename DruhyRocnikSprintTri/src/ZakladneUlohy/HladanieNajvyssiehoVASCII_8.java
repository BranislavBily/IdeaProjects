package ZakladneUlohy;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 20.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Nacitanie char a potom najdenie najvyssieho pismena a ich pocet
 */
public class HladanieNajvyssiehoVASCII_8 {

    public static char[][] nacitanie() {
        Scanner sc = new Scanner(System.in);
        char H[][] = new char[5][5];
        for (int i = 0; i < H.length; i++) {
            for (int j = 0; j < H[i].length; j++) {
                j++;i++;
                System.out.print("Zadajte pismeno do " + j + ". stlpca v " + i + ". riadku: ");
                j--;i--;
                H[i][j] = sc.next().charAt(0);
            }
        }
        return H;
    }

    public static void hladanie(char H[][]) {
        int pocet = 0, max = 0;
        for (int i = 0; i < H.length; i++) {
            for (int j = 0; j < H[i].length; j++) {
                if(H[i][j] == max) pocet++;
                else if(H[i][j] > max) {
                    pocet = 1;
                    max = H[i][j];
                }
            }
        }
        char maxChar = (char)max;
        System.out.println("Najvacsie pismeno je "+maxChar+" ktore ste nacitali "+pocet+" krat.");
    }

    public static void main(String[] args) {
        char H[][] = nacitanie();
        hladanie(H);
    }
}
