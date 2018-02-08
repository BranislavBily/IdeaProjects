/**
 * Created by Branislav Bily on 7.2.2017.
 */
import java.util.Scanner;


public class Piaty {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String veta = in.nextLine();
        String krstne = "";
        String priezvisko = "";
        if (veta.split("\\w+").length > 1) {
            priezvisko = veta.substring(veta.lastIndexOf(" ")+1);
            krstne = veta.substring(0, veta.lastIndexOf(' ')+1);
        }
        else {
            krstne = veta;
        }
        System.out.println("Krstne meno : "+krstne);
        System.out.println("Priezvisko : "+priezvisko);

    }

}
