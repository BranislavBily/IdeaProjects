
import java.util.Scanner;

/**
 * Created by Branislav Bily on 7.2.2017.
 */
public class palindrom {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("Zadajte vetu, ktoru chcete overit : ");
        String veta= in.nextLine();
        String novy= "";
        veta=veta.replace(" ","");
        veta=veta.toLowerCase();
        for (int i = veta.length(); i > 0; i--) {
            char pismeno = veta.charAt(i-1);
            novy+=pismeno;
        }
        if ( veta.equals(novy)){
            System.out.print("Je to palindrom!");
        }
        else {
            System.out.print("Nie je to palindrom.");
        }
    }
}
