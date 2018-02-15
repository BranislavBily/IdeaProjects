package ulohy;

import java.io.*;
/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 15.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class ZoradovanieCharov_4 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static char nacitavanie() throws IOException {
        return (br.readLine()).charAt(0);
    }

    public static void main(String[] args) throws IOException{
        char [][] znaky = new char[5][3];
        for (int i = 0; i < znaky.length; i++) {
            for (int j = 0; j < znaky[i].length; j++) {
                znaky[i][j] = nacitavanie();
            }
        }
    }
}
