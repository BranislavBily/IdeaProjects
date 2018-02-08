package ZakladneUlohy;

import java.util.*;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 11.01.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class hodOstepomJuChytilSaJejNejakPaciTenKoncept_9 {

    public static void zistujemeVsetkoo(int hody[], int poradiePretekara) {
        Scanner sc = new Scanner(System.in);
        double hod, sucet = 0, pocetHodov = 6, min = 0, max = 0, AP;
        for (int i = 0; i < 6; i++) {
            i++;
            System.out.println("Zadajte "+i+". hod "+poradiePretekara+". pretekara: ");
            i--;
            hod = sc.nextInt();
            if(i == 0) min = hod;
            if(hod == 0) pocetHodov--;
            else sucet += hod;
            if(hod < min && hod != 0) min = hod;
            else if(hod > max) max = hod;
        }
        AP = (double) Math.round(sucet / pocetHodov * 100) / 100;
        System.out.println("Najlepsi hod "+poradiePretekara+". pretekara bol "+max+", zatial co jeho " +
                           "najhorsi hod bol "+min+". Priemer vsetkych hodov bol "+AP);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadajte pocet pretekarov: ");
        int hody[][] = new int[sc.nextInt()][6];
        for (int i = 0; i < hody.length; i++) {
            zistujemeVsetkoo(hody[i], i + 1);
        }
    }
}
