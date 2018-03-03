package ulohy;

public class Zadanie1Zoradovanie {

    static int[] pole = new int[30];

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            pole[i] = nacitanieCisla();
        }
        vypis();
        pole = Sorty.quicksort(pole, 0, pole.length);
        System.out.println("Pole bolo zoradene.");
        vypis();
    }

    public static int nacitanieCisla(){
        double vygenerovaneCislo = Math.random() * 100;
        int cislo = (int)vygenerovaneCislo;
        return cislo;
    }

    public static void vypis() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ", pole[i * 10 + j]);
            }
            System.out.println();
        }
    }


}
