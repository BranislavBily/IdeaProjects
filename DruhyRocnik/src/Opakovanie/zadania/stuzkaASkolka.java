package Opakovanie.zadania;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Program nacita tri rozne stuzky a ich farbu, celkova dlzka kazdej farby
 */
public class stuzkaASkolka {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int modra = 0, cervena = 0, biela = 0, dlzka = 0;
        System.out.print("Zadajte pocet deti: ");
        int deti = in.nextInt();
        for (int i = 0; i < deti; i++) {
            System.out.print("Zadajte farbu stuzky: ");
            char vstup = in.next().charAt(0);
            switch(vstup) {
                case 'b' : System.out.print("Zadajte dlzku stuzky v centimetroch: ");
                           dlzka = in.nextInt();
                           biela += dlzka; break;
                case 'm' : System.out.print("Zadajte dlzku stuzky v centimetroch: ");
                           dlzka = in.nextInt();
                           modra += dlzka; break;
                case 'c' : System.out.print("Zadajte dlzku stuzky v centimetroch: ");
                           dlzka = in.nextInt();
                           cervena += dlzka; break;
                default: System.out.println("Tuto farbu si deti do skolky brat nemali ste zly rodic.");
            }
        }
        System.out.print("Biele stuzky mali dlzku "+biela+" cm, modre stuzky "+modra+" cm a cervene stuzky "+cervena+" centimetrov.");

    }
}
