import java.util.Scanner;

/**
 * Created by Branislav Bily on 7.2.2017.
 * decryption
 */
public class devat {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String veta = in.nextLine();
        String novy = "";
        int dlzka = veta.length();
        int a = 0;
        if ( dlzka % 2 == 0) {
            for ( int i = 0; i < veta.length(); i+=2){
                char pismeno = veta.charAt(a);
                novy+=pismeno;
                a+=2;
            }
            for ( int i = 0; i < veta.length(); i+=2) {
                char pismeno = veta.charAt(dlzka-1);
                novy+=pismeno;
                dlzka-=2;
            }

        }
        else {
            int dlzkaa= veta.length();
            for (int i = 0; i < veta.length(); i += 2) {
                char pismeno = veta.charAt(a);
                novy += pismeno;
                a += 2;
            }
            for (int i = 2; i < veta.length(); i += 2) {
                char pismeno = veta.charAt(dlzkaa-=2);
                novy += pismeno;
                dlzka -= 2;
            }
        }
        System.out.print(novy);



    }
}
