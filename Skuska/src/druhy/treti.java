package druhy;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class treti {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("Zadajte vetu, ktoru chcete overit : ");
        String veta= in.nextLine();
        String novy= in.nextLine();
        veta=veta.toLowerCase();
        novy=novy.toLowerCase();
        if ( veta.equals(novy)){
            System.out.print("Su rovnake!");
        }
        else {
            System.out.print("Nie su rovnake.");
        }

    }
}
