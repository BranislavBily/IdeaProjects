package SprintJedna;

/**
 * Created by Branislav Bily on 26.9.2017.
 * Pretty self explanatory, but divisions of 3 are shown, if theres a digit 3 its highlighted
 */
public class findingDivisionOfThree {
    public static void main(String[] args){
        for(int i = 1; i < 101;i++) {
            if(i >= 30 && i <= 39) System.out.println("*"+i);
            else if (i % 10 == 3) System.out.println("*"+i);
            else if( i % 3 == 0) System.out.println(i);
        }
    }
}
