package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Branislav Bily on 28.3.2017.
 */
public class bonus4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Random random = new Random ();
        System.out.println("Zadajte pocet deti v zapase: ");
        int pocet = in.nextInt(); int zvysne = pocet; int poradie = 0;
        int [] deti; deti = new int [pocet]; int lopta = 0;
        for ( int i = 0; i < pocet; i++) {
            deti[i] = i + 1;
        }
        boolean hod = false; boolean kos = false;
        lopta=random.nextInt(2);
        if (lopta == 1) {
            hod = true;
        }

        while (zvysne != 1) {
            lopta = random.nextInt(2);
            if (lopta == 1) {
                kos = true;
            } else {
                kos = false;
            }
            if ( hod && !kos ) {
                deti[poradie]= 0;
                zvysne--;
            }
            lopta=random.nextInt(2);
            if (lopta == 1) {
                hod = true;
            } else {
                hod = false;
            }
            poradie++;
            if (poradie > pocet ) {
                poradie-=pocet;
            }
        }
        for (int i = 0; i < pocet; i ++) {
            if (deti[i] != 0 ) {
                System.out.print(i); break;
            }
        }
    }
}
