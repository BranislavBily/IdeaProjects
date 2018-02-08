package Opakovanie;

import java.util.Scanner;

/**
 * Created by Branislav Bily on 13.5.2017.
 */
public class dvanast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int medzici, medzime, cele = 0;
        System.out.print("Zadajte citatela: ");
        int citatel = in.nextInt();
        medzici = citatel;
        System.out.print("Zadajte menovatela: ");
        int menovatel = in.nextInt();
        medzime = menovatel;
        if ( medzici < medzime) {
            while (medzici != medzime) {
                if (medzici < medzime) {
                    medzime-=medzici;
                } else {
                    medzici-=medzime;
                }
            }
            System.out.println(citatel/medzici+"/"+menovatel/medzime);
        } else {
            while( citatel > menovatel) {
                citatel -= menovatel;
                cele++;
            }
            if ( citatel == menovatel) {
                cele++;
                System.out.println(cele);
            } else {
                System.out.println(cele + " " + citatel + "/" + menovatel);
            }
        }


    }
}
