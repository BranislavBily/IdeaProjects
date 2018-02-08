package ulohySprint;

import java.io.*;

/**
 * Created by Branislav Bily on 27.10.2017.
 * Vytvorte program, ktorý načíta zo súboru filmy.txt počet filmov premietaných
 * tento mesiac v kine a potom postupne ich názvy. Po prečítaní vstupných údajov
 * program vypíše názvy filmov na konzolu. Potom umožnite užívateľovi zadať
 * názov filmu z klávesnice a vypíšte mu, či sa bude takýto film premietať tento
 * mesiac alebo nie. S užívateľom komunikujte dovtedy, kým neukončí činnosť
 * programu zadaním Enteru (film bez názvu, dĺžka názvu 0).
 */
public class programPreKino {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\programovanie\\textPreUlohy\\programPreKino.txt"));
            BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
            int pocet = Integer.parseInt(br.readLine());
            String nazvy[] = new String[pocet];
            for (int i = 0; i < pocet; i++) {
                nazvy[i] = br.readLine();
            }
            vypisanie(nazvy);
            String userChoice;
            while(!(userChoice = brc.readLine()).equals("") ) {
                boolean nachadzaSa = false;
                for(String film : nazvy) {
                    if(userChoice.contains(film)) nachadzaSa = true;
                }
                if(nachadzaSa) System.out.println("Mozete ist na tento film.");
                else System.out.println("Bohuzial tento film nepremietame.");
            }
            br.close();
            System.out.println("Zapis uspesne vykonany.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void vypisanie(String filmy[]) {
        for(String film : filmy) {
            System.out.println(film);
        }
    }
}
