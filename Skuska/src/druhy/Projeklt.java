package druhy;

import java.util.Random;

/**
 * Created by Branislav Bily on 21.2.2017.
 */
public class Projeklt  {

    public static void main(String[] args) {

        Random random= new Random();
        String kod = "";
        int asci = 0, cislo = 0,pocet = 0;
        char pismeno;
        for ( int i = 1; i <= 16 ; i ++) {
            cislo = random.nextInt(2)+1;
                    switch (cislo) {
                        case 1:
                            asci = random.nextInt(10) + 48;
                            pismeno = (char) asci;
                            kod += pismeno;
                            break;
                        default:
                            asci = random.nextInt(25) + 65;
                            pismeno = (char) asci;
                            kod += pismeno;
                            break;
                    }
                    if ( i % 4 == '0') {
                    kod.replace(""," ");
                }
        }
        System.out.print(kod);

    }
}
