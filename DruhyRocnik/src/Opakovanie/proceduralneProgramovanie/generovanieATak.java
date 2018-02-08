package Opakovanie.proceduralneProgramovanie;

/**
 * Created by Branislav Bily on 19.9.2017.
 * Program vygeneruje 10 cisel <0,20>, vypise sucet a aritmeticky priemer
 */
public class generovanieATak {
    public static void main (String[] args) {
        float celkovy_sucet = 0, aritmeticky_priemer;
        for (int i = 0; i < 10; i++) {
            float vygenerovane_cislo =  Math.round(Math.random() * 20);
            celkovy_sucet += vygenerovane_cislo;
        }
        aritmeticky_priemer = celkovy_sucet / 10;
        System.out.print("Sucet vygenerovanych cisel bol "+celkovy_sucet+
                         " , aritmeticky priemer tychto cisel bol "+aritmeticky_priemer);
    }
}
