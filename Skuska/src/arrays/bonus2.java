package arrays;

/**
 * Project edu-scram
 * Copyright (C) SYNETECH s.r.o. - All Rights Reserved
 * <p>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * <p>
 * Proprietary and confidential
 * <p>
 * Written by Samuel Bilý <samuel.bily@synetech.cz>, 03 2017
 */

public class bonus2 {

    public static final int POCET_DETI = 9;
    public static final int POCET_SLABIK = 17;

    public static void main(String[] args) {
        int deti[] = new int[POCET_DETI];
        int pocet = POCET_DETI; int zvysok;
        for(int i = 0; i < POCET_DETI; i ++) {
            deti[i] = i+1;
        }
        do {
            zvysok = pocet % POCET_SLABIK;
            if (zvysok > 8) {
                zvysok-= 8;
            }
            deti[zvysok-1] = 0;
            pocet--;
        } while (pocet != 1);
        for(int i = 0; i < POCET_DETI; i ++) {
            if(deti[i] != 0) {
                System.out.println("Stastne dieta je "+deti[i]+". ");
            }
        }
    }
}
