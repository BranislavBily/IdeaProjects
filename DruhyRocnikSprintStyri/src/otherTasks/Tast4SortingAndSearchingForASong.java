package otherTasks;

import java.io.*;
import java.util.Arrays;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 03.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Tast4SortingAndSearchingForASong {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String songs[] = {
            "The Past Recedes",
            "Lever Pulled",
            "Anne",
            "The Real",
            "A Name",
            "Control",
            "Your warning",
            "Hope",
            "Ascension",
            "Time Tonight",
            "Leave yor Bar"
    };

    public static void main(String[] args) throws IOException {
        output();
        Arrays.sort(songs);
        System.out.println();
        output();
        userPlaysFunGameNow();
    }

    public static void output() {
        for (String song :
                songs) {
            System.out.printf("%s, ", song);
        }
        System.out.println();
    }

    public static void userPlaysFunGameNow() throws IOException {
        String input;
        while (!(input = br.readLine()).equals("")) {
            if (Arrays.asList(songs).contains(input)) {
                System.out.println("Your song is among the song list.");
            } else {
                System.out.println("Unfortunately, your song is not on the list.");
            }
        }
    }
}
