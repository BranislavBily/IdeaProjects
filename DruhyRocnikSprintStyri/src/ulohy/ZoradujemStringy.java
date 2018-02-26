import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZoradujemStringy {

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

    public static void main(String[] args) throws IOException{
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
    }

    public static void userPlaysFunGameNow() throws IOException {
        String input;
        while(!(input = br.readLine()).equals("")) {
            if(Arrays.asList(songs).contains(input)) {
                System.out.println("Your song is among the song list.");
            } else {
                System.out.println("Unfortunately, your song is not on the list.");
            }

        }
    }
}
