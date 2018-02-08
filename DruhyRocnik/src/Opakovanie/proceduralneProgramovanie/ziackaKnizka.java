package Opakovanie.proceduralneProgramovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 19.9.2017.
 * Program ktory ma zistit ako prospel ziak ak nacita jeho najhorsiu znamku a priemer znamok
 */
public class ziackaKnizka {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Nacitajte najhorsiu znamku ziaka: ");
        int najhorsia_znamka = in.nextInt();
        System.out.print("Nacitajte priemernu znamku ziaka: ");
        float priemer_znamok = in.nextFloat();
        switch(najhorsia_znamka) {
            case 5: System.out.println("Ziak neprospieva."); break;
            case 4: System.out.println("Ziak prospel ale len tak tak."); break;
            case 3: if (priemer_znamok <= 2) System.out.println("Ziak prospel velmi dobre.");
                    else System.out.println("Ziak prospel ale len tak tak."); break;
            case 2: if (priemer_znamok <= 1.5) System.out.println("Ziak prospel s vyznamenim."); break;
            default: System.out.println("Ziak bol chvalitebny.");
        }
    }
}
