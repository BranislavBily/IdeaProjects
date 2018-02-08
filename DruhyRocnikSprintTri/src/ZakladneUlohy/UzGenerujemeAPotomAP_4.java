package ZakladneUlohy;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 20.12.2017
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 * Do 2D pola vygenerovat cisla z intervalu <-100; 100>, potom vypocitat AP z parnych riadkov z cislov v intervale <-50;50>
 */
public class UzGenerujemeAPotomAP_4 {

    public static int[][] generaciaCisel() {
        int A[][] = new int[5][5];
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = (int)Math.round(Math.random() * 200 - 100);
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return A;
    }

    public static void vypocetAPZParnychPrvkov(int A[][]) {
        double sucet = 0, pocetCisel = 0;
        for(int i = 1; i < A.length; i += 2) {
            for(int j = 0; j < A[i].length; j++) {
                sucet += A[i][j];
                pocetCisel++;
                System.out.print(A[i][j]+" ");
            }
        }
        double AP = (double) Math.round(sucet / pocetCisel * 100) / 100;
        System.out.println();
        System.out.println("Aritmeticky priemer v parnych stlpcoch je "+AP);
    }

    public static void main(String[] args) {
        System.out.println("Generacia cisel do 2DPola a potom nasledne vypocitanie AP y parnych stlpcov.");
        int A[][] = generaciaCisel();
        vypocetAPZParnychPrvkov(A);
    }
}
