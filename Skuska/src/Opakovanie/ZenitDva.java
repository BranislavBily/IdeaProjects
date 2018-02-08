package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class ZenitDva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma;
        float kurz;
        int potrebne;
        System.out.print("Zadajte sumu :");
        suma= in.nextInt();
        System.out.print("Zadajte kurz : ");
        kurz = in.nextFloat();
        potrebne =(int)Math.ceil(suma*kurz);
        System.out.print(potrebne);
    }
}
