package Opakovanie.zadania;

/**
 * Created by Branislav Bily on 18.9.2017.
 * Joe prejde 50m z domu do krcmi, ostava 50m. Hodi si mincou, hlava ide 10m dopredu tail 10m dozadu, robi az
   kym niekde nedojde. Robi to cely rok, kde sa kolko krat dostal a vzdialenost ktoru presiel.
 */
public class bananovyJoe {
    public static void main(String[] args) {
        int domov = 0, krcma = 0,  presiel = 50 * 365;
        double minca;
        for (int i = 0; i < 10; i++) {
            int dosiahol = 50;
            while (dosiahol > 0 && dosiahol < 100) {
                minca = Math.random() * 2;
                //System.out.println(minca);
                if (minca > 1) {
                    dosiahol += 10;
                    //System.out.println(dosiahol);
                    presiel += 10;
                } else {
                    dosiahol -= 10;
                    //System.out.println(dosiahol);
                    presiel += 10;
                }
            }
            if (dosiahol == 100) {
                krcma++;
            } else {
                domov++;
            }
        }
        System.out.print("Domov sa dostal "+domov+" krat, do krcmi "+krcma+" krat. Celkovo nachodil "+presiel+" metrov.");
    }
}
