package arrays;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 10.3.2017.
 */
public class styri {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char [] S; S = new char[8];int i = 0;int j = 0;char pohar;
        char pismenoJ, pismenoI;
        for (int x = 0 ; x < 8; x++) {
            System.out.println("Zadajte pismeno: ");
            S[x]=in.nextLine().charAt(0);
        }
        for(int x = 0; x < S.length; x++) {
            System.out.print(S[x]);
        }
        System.out.println("");
        System.out.println("Zadaj I.");
        i=in.nextInt()-1;
        while(i < 0 || i > 8) {
            System.out.print("Zle si zadal.");
            i = in.nextInt()-1;
        }
        System.out.println("Zadaj J.");
        j=in.nextInt()-1;
        while(j<0 || j > 8 || j == i){
            System.out.print("Zle si zadal.");
            j=in.nextInt()-1;
        }
        pohar=S[i];
        S[i]=S[j];
        S[j]=pohar;
        for(int y = 0; y < S.length; y++){
            System.out.print(S[y]);
        }





    }
}
