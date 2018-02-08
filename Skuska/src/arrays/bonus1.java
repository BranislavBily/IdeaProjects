package arrays;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 21.3.2017.
 */
public class bonus1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] Hod; Hod = new int[6]; int vstup;int max = 0; int min = 1000; int AP;int sucet = 0;int nad = 0;
        for ( int i = 0; i < Hod.length; i++){
            System.out.print("Zadaj hod: ");
            vstup=in.nextInt();
            Hod[i]=vstup;
        }
        for(int i = 0; i < Hod.length; i++){
            if(Hod[i] > max){
                max= Hod[i];
            }
            if(Hod[i] < min) {
                min= Hod[i];
            }
            if(Hod[i] > 0) {
                sucet+=Hod[i];
                nad++;
            }
        }
        AP=sucet/nad;
        System.out.print("Priemerny hod: "+AP);


    }
}
